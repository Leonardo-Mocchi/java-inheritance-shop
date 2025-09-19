package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

  private int codice;
  private String nome;
  private String marca;
  private BigDecimal prezzo;
  private boolean primaNecessita;
  private BigDecimal iva;

  //* Constructors
  Prodotto(
    String nome,
    String marca,
    BigDecimal prezzo,
    boolean primaNecessita
  ) {
    this.codice = assegnaNumeroProdotto();
    this.nome = nome;
    this.marca = marca.substring(0, 1).toUpperCase() + marca.substring(1);
    this.prezzo = prezzo.setScale(2, RoundingMode.HALF_UP);
    this.primaNecessita = primaNecessita;
    this.iva = calcolaIva();
  }

  Prodotto() {
    this.codice = assegnaNumeroProdotto();
    this.primaNecessita = false;
  }

  //* utility methods

  private BigDecimal calcolaIva() {
    if (prezzo != null) {
      BigDecimal percentuale = primaNecessita
        ? new BigDecimal("5")
        : new BigDecimal("22");
      BigDecimal cento = new BigDecimal("100");
      return prezzo.multiply(percentuale).divide(cento);
    }
    return null;
  }

  private int assegnaNumeroProdotto() {
    Random rand = new Random();
    int result = rand.nextInt(999999999);
    return result;
  }

  //* Getters
  public int getCodice() {
    return this.codice;
  }

  public String getNome() {
    return this.nome;
  }

  public String getMarca() {
    return this.marca;
  }

  public BigDecimal getPrezzo() {
    return this.prezzo.setScale(2, RoundingMode.HALF_UP);
  }

  public BigDecimal getIva() {
    return this.iva.setScale(2, RoundingMode.HALF_UP);
  }

  public BigDecimal getPrezzoPieno() {
    return this.prezzo.add(this.iva).setScale(2, RoundingMode.HALF_UP);
  }

  //? post correzione rimpiazza printNomeEsteso

  @Override
  public String toString() {
    if (nome != null) {
      return codice + " - " + marca + " " + nome;
    }
    return null;
  }

  //! prima della correzione
  public void printNomeEsteso() {
    System.out.println(
      "Il nome esteso dell'articolo è: " +
      codice +
      "-" +
      marca +
      "-" +
      nome.replaceAll("\\s+", "-")
    );
  }

  //* SETTERS
  public void setNome(String nuovoNome) {
    this.nome = nuovoNome;
  }

  public void setMarca(String nuovaMarca) {
    this.marca = nuovaMarca;
  }

  public void setPrezzo(BigDecimal nuovoPrezzo) {
    this.prezzo = nuovoPrezzo;
    this.iva = calcolaIva(); // qui per ricalcolare l'iva
  }

  public void setPrimaNecessita(boolean nuovaPrimaNecessita) {
    this.primaNecessita = nuovaPrimaNecessita;
    this.iva = calcolaIva(); // qui per ricalcolare l'iva
  }
}
