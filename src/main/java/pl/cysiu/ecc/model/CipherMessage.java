package pl.cysiu.ecc.model;

import lombok.Data;

@Data
public class CipherMessage {
    private String originalText, cipheredText, pattern;

    public CipherMessage(String originalText, String pattern) {
        this.originalText = originalText;
        this.pattern = pattern;
    }

}
