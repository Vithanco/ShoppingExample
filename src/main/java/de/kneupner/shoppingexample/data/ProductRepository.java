package de.kneupner.shoppingexample.data;


/*
* Storing Products in our database
* */

import de.kneupner.shoppingexample.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {

}
