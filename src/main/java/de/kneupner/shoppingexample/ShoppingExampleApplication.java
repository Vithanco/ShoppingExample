package de.kneupner.shoppingexample;

import de.kneupner.shoppingexample.data.ProductRepository;
import de.kneupner.shoppingexample.domain.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class ShoppingExampleApplication {


    /*
    * Initiate Data.
    * */
    @Bean
    public CommandLineRunner dataLoader(
            ProductRepository products) {
        return args -> {
            log.warn("This is dummy data that needs to be removed before prduction");
            Product conceptMaps = new Product("pro1","Align People Method", "A description on how to align all stakeholders");
            Product benefitMapping = new Product("pro2","Benefit Mapping", "A description on how to design projects for benefits.");
            Product impactMapping = new Product("pro3","Impact Mapping", "A description on how to identify the best next feature.");
            products.save(conceptMaps);
            products.save(benefitMapping);
            products.save(impactMapping);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ShoppingExampleApplication.class, args);
    }

}
