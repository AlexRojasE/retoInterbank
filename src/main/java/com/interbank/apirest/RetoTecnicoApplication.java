package com.interbank.apirest;

import com.interbank.apirest.configuration.CryptoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetoTecnicoApplication {

	public static void main(String[] args) {
    System.out.println(CryptoConfiguration.encrypt("u001"));
		SpringApplication.run(RetoTecnicoApplication.class, args);

	}

}
