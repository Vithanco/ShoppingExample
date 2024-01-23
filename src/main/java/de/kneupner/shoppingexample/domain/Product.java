package de.kneupner.shoppingexample.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.UniqueElements;



/*
*  Product we are going to sell on our website
* */
@Slf4j
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Product {

    @Id
    String sku;

    @NonNull
    String name;

    @NonNull
    String description;

    /*
    * further properties here, will include pictures, descriptions, etc.
    * */

}
