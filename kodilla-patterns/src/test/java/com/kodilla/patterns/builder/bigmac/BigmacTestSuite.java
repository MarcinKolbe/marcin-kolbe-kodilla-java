package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(BunType.SESAME_BUN)
                .burgers(3)
                .sauce(SauceType.STANDARD)
                .addIngredient(AllowedIngredients.BACON)
                .addIngredient(AllowedIngredients.CHEESE)
                .addIngredient(AllowedIngredients.MUSHROOMS)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assertions.assertEquals(3, howManyIngredients);
    }
}
