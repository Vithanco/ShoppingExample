package de.kneupner.shoppingexample.domain;


import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @OneToOne(cascade = CascadeType.PERSIST)
    Product product; // the product our client is shopping
    Integer count; // the number of items in the cart of the same product

    /*
    String specialWishes; // for the customer, in case we want to provide special instructions
*/
}
