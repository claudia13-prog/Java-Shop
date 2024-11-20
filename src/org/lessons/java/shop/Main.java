package org.lessons.java.shop;

public class Main {

    public static void main(String[] args){

        Prodotto prodotto1 = new Prodotto("Smartphone", "super top", 890.00, 20.0);

        System.out.println(prodotto1.codice);
        System.out.println(prodotto1.prezzoBase());
        System.out.println(prodotto1.prezzoConIva());

    }

}
