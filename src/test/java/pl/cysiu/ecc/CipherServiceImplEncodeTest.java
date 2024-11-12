package pl.cysiu.ecc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.cysiu.ecc.model.CipherMessage;
import pl.cysiu.ecc.service.impl.CipherServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherServiceImplEncodeTest {

    private CipherServiceImpl cipherService;

    @BeforeEach
    void setUp() {
        cipherService = new CipherServiceImpl();
    }

    @Test
    public void testApplyCipher_simpleShift() {

        String textToEncode = "abcde";
        String pattern = "1:3/2"; // Shift letters from position 1 to 3 by 2 positions
        CipherMessage cm = new CipherMessage(textToEncode, pattern);

        String expected = "cdede";  // Expected result after shifting

        String result = cipherService.applyCipher(cm);

        assertEquals(expected, result, "The encoded result should match the expected output.");
    }

    @Test
    public void testApplyCipher_endPattern() {
        String textToEncode = "cipher";
        String pattern = "3:e/4";  // Shift letters from position 3 to end by 4 positions
        CipherMessage cm = new CipherMessage(textToEncode, pattern);

        String expected = "citliv";  // Expected result after shifting

        String result = cipherService.applyCipher(cm);

        assertEquals(expected, result, "The encoded result should match the expected output.");
    }

    @Test
    public void testApplyCipher_noShift() {
        String textToEncode = "hello";
        String pattern = "1:5/0";  // No shift
        String expected = "hello";  // Expected result after no shift
        CipherMessage cm = new CipherMessage(textToEncode, pattern);

        String result = cipherService.applyCipher(cm);

        assertEquals(expected, result, "The encoded result should match the original text.");
    }

    @Test
    public void testApplyCipher_singleCharShift(){
        String textToEncode = "a";
        String pattern = "1:1/1;";  // Shift the only character by 1 position
        String expected = "b";
        CipherMessage cm = new CipherMessage(textToEncode, pattern);

        String result = cipherService.applyCipher(cm);

        assertEquals(expected, result, "The encoded result should match the expected output.");
    }

    @Test
    public void testApplyCipher_multiplePatterns() {
        String textToEncode = "aaaaa";
        String pattern = "1:2/4;3:4/5;5:5/1";
        String expected = "eeffb";
        CipherMessage cm = new CipherMessage(textToEncode, pattern);

        String result = cipherService.applyCipher(cm);

        assertEquals(expected, result, "The encoded result should match the expected output.");
    }

}
