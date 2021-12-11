package io.github.lfteixeira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
/*@ComponentScan(basePackages = {"io.github.lfteixeira.repository",
                               "io.github.lfteixeira.service"} )*/
@RestController
public class VendasApplication {

    /*@Autowired
    @Qualifier("applicationName")*/
    @Value("${application.name}") // Pega o valor através do arquivo properties
    private String applicationName;

    @Cachorro
    private Animal animal;

    @Bean(name = "executarAnimal")
    public CommandLineRunner executarAnimal(){
        return args -> {
            this.animal.fazerBarulho();
        };
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {

        SpringApplication.run(VendasApplication.class,args);

    }


}
