package pl.cysiu.ecc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.cysiu.ecc.model.CipherMessage;
import pl.cysiu.ecc.service.impl.CipherServiceImpl;

@SpringBootApplication
public class EccApplication {

	public static void main(String[] args) {
		SpringApplication.run(EccApplication.class, args);
		CipherServiceImpl cpi = new CipherServiceImpl();
		CipherMessage cm = new CipherMessage("Hello world","s:4/3;7:e/26");
		cpi.encode(cm);
		System.out.println(cm.getEncodedText());
	}

}
