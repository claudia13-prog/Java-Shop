package org.lessons.java.shop;

public class Prodotto {

    // Variabili d'istanza
    int codice;
    String nome;
    String descrizione;
    float prezzo;
    float iva;

    // Metodi

    // Costruttore
    public Prodotto(int codice, String nome, String descrizione, float prezzo, float iva){
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

}
