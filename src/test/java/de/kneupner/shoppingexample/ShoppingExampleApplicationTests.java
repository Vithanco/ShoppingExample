package de.kneupner.shoppingexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ShoppingExampleApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    // should find the correct version from HATEAOS
    private MediaType halPlusJson = new MediaType("application", "hal+json", Charset.forName("UTF-8"));

    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("onlyWebsite"));
    }

    @Test
    public void testCreateShoppingCart() throws Exception {
        // Simulate a POST request to create a shopping cart
        mockMvc.perform(get("/api/products")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));

        mockMvc.perform(post("/api/CartItems").contentType(MediaType.APPLICATION_JSON)
                .content("{ product: pro1, count: 3 }")
                .accept(halPlusJson))
                .andExpect(status().isCreated());
    }
}
