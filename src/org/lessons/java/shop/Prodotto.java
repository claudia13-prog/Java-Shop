package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // Variabili d'istanza
    int codice;
    String nome;
    String descrizione;
    double prezzo;
    double iva;

    // Metodi

    // Costruttore
    public Prodotto(String nome, String descrizione, double prezzo, double iva){
        this.codice = new Random().nextInt(1000);  // alla creazione di un nuovo prodotto il codice è valorizzato con un numero random
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Metodo che ritorna il prezzo base
    public String prezzoBase(){
        return "Il prezzo base è " + prezzo;
    }

    // Metodo che ritorna il prezzo comprensivo di iva
    public String prezzoConIva(){
        return "Il prezzo comprensivo di iva è " + (prezzo * (1 + iva / 100));
    }


}
