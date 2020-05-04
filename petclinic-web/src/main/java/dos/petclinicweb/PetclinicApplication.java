package dos.petclinicweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dos")
public class PetclinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetclinicApplication.class, args);
    }

}
