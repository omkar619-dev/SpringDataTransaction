package com.javalover.util;

import java.util.Arrays;
import java.util.List;

public class PromoCodeValidator {

    public static void validatePromoCode(String promoCode) {
        List<String> promoCodes = Arrays.asList("NEWYEAR","DECEND","NOVEND","SANTA","BLACKFRIDAY");
        if (!promoCodes.contains(promoCode)) {
            throw new RuntimeException("Invalid promo code! Please try again.");
        }
    }
}
