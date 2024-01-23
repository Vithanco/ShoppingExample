package de.kneupner.shoppingexample.data;

import de.kneupner.shoppingexample.domain.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {
}
