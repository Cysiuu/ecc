package pl.cysiu.ecc.dto;

import lombok.Data;
@Data
public class CipherRequest {

    private String textToCipher;
    private String pattern;

}
