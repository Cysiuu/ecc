package pl.cysiu.ecc.service.impl;

import pl.cysiu.ecc.exceptions.EmptyTextException;
import pl.cysiu.ecc.model.CipherMessage;
import pl.cysiu.ecc.service.CipherService;

import java.util.HashMap;
import java.util.Map;

public class CipherServiceImpl implements CipherService {
    @Override
    public String encode(CipherMessage messageToEncode) {

        if(messageToEncode.getOriginalText() == null ||
        messageToEncode.getOriginalText().isEmpty() ){
            throw new EmptyTextException("Message can't be empty");
        }

        // Pattern format should be like this one below
        // %from%:%to%/%shift%; ...
        // from can be declared as 's' (start) and to 'e' (end)
        String pattern = messageToEncode
                .getPattern()
                .toLowerCase();

        String messageOriginalText = messageToEncode.getOriginalText();

        Map<int[], Integer> shifts = new HashMap<>();
        String[] patternSections = pattern.split(";");

        for (String section : patternSections) {

            String[] parts = section.split("/");
            String range = parts[0];
            int shift = Integer.parseInt(parts[1]);

            String[] fromToParts = range.split(":");
            int from, to;

            if (fromToParts[1].equals("e")) {
                to = messageOriginalText.length() - 1;
            } else {
                to = Integer.parseInt(fromToParts[1]) - 1;
            }

            if (fromToParts[0].equals("s")) {
                from = 0;
            } else {
                from = Integer.parseInt(fromToParts[0]) - 1;
            }

            if (from < 0 || to >= messageOriginalText.length() || from > to) {
                throw new IllegalArgumentException("Invalid range in pattern: " + range);
            }

            shifts.put(new int[]{from, to}, shift);

        }

        char[] chars = messageOriginalText.toCharArray();

        for (Map.Entry<int[], Integer> entry : shifts.entrySet()) {
            int[] range = entry.getKey();
            int shift = entry.getValue();

            for (int i = range[0]; i <= range[1] && i < chars.length; i++) {
                chars[i] = shiftChar(chars[i], shift);
            }

        }

        messageToEncode.setEncodedText(new String(chars));

        return messageToEncode.getEncodedText();
    }

    private char shiftChar(char c, int shift) {
        if (Character.isLetter(c)) {
            char base = Character.isLowerCase(c) ? 'a' : 'A';
            int alphabetSize = 26;
            return (char) ((c - base + shift) % alphabetSize + base);
        } else {
            return c;
        }
    }
}
