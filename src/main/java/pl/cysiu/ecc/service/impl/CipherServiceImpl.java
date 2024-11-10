package pl.cysiu.ecc.service.impl;

import org.springframework.stereotype.Service;
import pl.cysiu.ecc.exceptions.EmptyTextException;
import pl.cysiu.ecc.model.CipherMessage;
import pl.cysiu.ecc.service.CipherService;

import java.util.HashMap;
import java.util.Map;

@Service
public class CipherServiceImpl implements CipherService {

    private static class Range {
        int from;
        int to;

        Range(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }


    @Override
    public String applyCipher(CipherMessage message) {
        validateMessage(message);

        String pattern = message.getPattern().toLowerCase();
        String messageOriginalText = message.getOriginalText();

        Map<Range, Integer> shifts = parsePattern(pattern, messageOriginalText.length());

        char[] chars = applyShifts(messageOriginalText.toCharArray(), shifts);

        String encodedText = new String(chars);
        message.setCipheredText(encodedText);

        return encodedText;
    }

    private void validateMessage(CipherMessage message) {
        if (message.getOriginalText() == null || message.getOriginalText().isEmpty()) {
            throw new EmptyTextException("Message can't be empty");
        }
    }

    private Map<Range, Integer> parsePattern(String pattern, int messageLength) {
        Map<Range, Integer> shifts = new HashMap<>();
        String[] patternSections = pattern.split(";");

        for (String section : patternSections) {
            String[] parts = section.split("/");
            String range = parts[0];
            int shift = Integer.parseInt(parts[1]);

            Range fromToRange = parseRange(range, messageLength);

            shifts.put(fromToRange, shift);
        }

        return shifts;
    }

    private Range parseRange(String range, int messageLength) {
        String[] fromToParts = range.split(":");
        int from = fromToParts[0].equals("s") ? 0 : Integer.parseInt(fromToParts[0]) - 1;
        int to = fromToParts[1].equals("e") ? messageLength - 1 : Integer.parseInt(fromToParts[1]) - 1;

        if (from < 0 || to >= messageLength || from > to) {
            throw new IllegalArgumentException("Invalid range in pattern: " + range);
        }

        return new Range(from, to);
    }

    private char[] applyShifts(char[] chars, Map<Range, Integer> shifts) {
        for (Map.Entry<Range, Integer> entry : shifts.entrySet()) {
            Range range = entry.getKey();
            int shift = entry.getValue();

            for (int i = range.from; i <= range.to && i < chars.length; i++) {
                chars[i] = shiftChar(chars[i], shift);
            }
        }
        return chars;
    }

    private char shiftChar(char c, int shift) {
        if (Character.isLetter(c)) {
            char base = Character.isLowerCase(c) ? 'a' : 'A';
            int alphabetSize = 26;
            return (char) ((c - base + shift + alphabetSize) % alphabetSize + base);
        } else {
            return c;
        }
    }
}
