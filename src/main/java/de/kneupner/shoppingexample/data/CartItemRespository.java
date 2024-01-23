package de.kneupner.shoppingexample.data;

import de.kneupner.shoppingexample.domain.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRespository extends JpaRepository<CartItem,Long> {
}
