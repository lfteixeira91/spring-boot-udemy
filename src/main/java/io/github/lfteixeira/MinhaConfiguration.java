package io.github.lfteixeira;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Configuration
//@Profile("development")
@Development
public class MinhaConfiguration {

    /*@Bean(name="applicationName")
    public String applicationName(){
        return "Sistema de Vendas";
    }*/

    @Bean(name = "executar")
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }

}
