package academy.devdojo.springwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;

@SpringBootApplication
public class SpringWebfluxApplication {

//    static {
//        BlockHound.install();
//    }
    public static void main(String[] args) {
        System.out.println(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("devdojo"));
        SpringApplication.run(SpringWebfluxApplication.class, args);
    }

}
