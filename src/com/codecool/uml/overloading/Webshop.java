package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.Date;

public class Webshop {

    public static void main(String[] args) {
	    Product prod1 = new Product();
	    Product prod2 = new Product("dog", 1000, Currency.getInstance("HUF"));
        System.out.println(prod1.toString());
        System.out.println(prod2.toString());

        ProductCategory pc1 = new ProductCategory();
        ProductCategory pc2 = new ProductCategory("animals", "alive things", "feed them with bones");
        System.out.println(pc1.toString());
        System.out.println(pc2.toString());

        Supplier supi1 = new Supplier();
        Supplier supi2 = new Supplier("dog breeder king", "mating selected dogs");
        System.out.println(supi1.toString());
        System.out.println(supi2.toString());

        FeaturedProductCategory fpc = new FeaturedProductCategory();
        fpc.schedule(new Date(), new Date());
        System.out.println(fpc.toString());
    }
}
