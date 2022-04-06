package br.com.conexao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"br.com.conexao", "br.com.conexao.config"})
@EntityScan("br.com.conexao.model")
@EnableJpaRepositories("br.com.conexao.repository")
public class ConexaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConexaoApplication.class, args);
    }

}
