package br.edu.infnet.erickfilho;

import br.edu.infnet.erickfilho.model.domain.Estudante;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ErickfilhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErickfilhoApplication.class, args);
	}

}
