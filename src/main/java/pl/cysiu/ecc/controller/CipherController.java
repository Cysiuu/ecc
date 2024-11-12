package pl.cysiu.ecc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.cysiu.ecc.dto.CipherRequest;
import pl.cysiu.ecc.model.CipherMessage;
import pl.cysiu.ecc.service.CipherService;


@RestController
@RequestMapping("/api/cipher")
public class CipherController {

    private final CipherService cipherService;

    @Autowired
    public CipherController(CipherService cipherService) {
        this.cipherService = cipherService;
    }

    @PostMapping("/encrypt")
    public ResponseEntity<CipherMessage> encryptMessage(@RequestBody CipherRequest request) {

        CipherMessage cipherMessage = new CipherMessage(request.getTextToCipher(), request.getPattern());
        String cipheredText = cipherService.applyCipher(cipherMessage);

        cipherMessage.setCipheredText(cipheredText);

        return ResponseEntity.ok(cipherMessage);
    }
}
