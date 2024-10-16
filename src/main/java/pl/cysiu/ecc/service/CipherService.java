package pl.cysiu.ecc.service;

import pl.cysiu.ecc.model.CipherMessage;

public interface CipherService {
    public String encode(CipherMessage messageToEncode);
}
