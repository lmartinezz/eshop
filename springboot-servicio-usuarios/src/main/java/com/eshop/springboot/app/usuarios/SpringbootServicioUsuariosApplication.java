package com.eshop.springboot.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.eshop.springboot.app.cms.models.entity"})
@SpringBootApplication
public class SpringbootServicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioUsuariosApplication.class, args);
	}

}
