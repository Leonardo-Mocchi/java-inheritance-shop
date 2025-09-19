package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

  private String colore;
  private boolean isWireless = false;

  Cuffie(
    String nome,
    String marca,
    BigDecimal prezzo,
    String colore,
    boolean isWireless
  ) {
    super(nome, marca, prezzo, false);
    this.colore = colore;
    this.isWireless = isWireless;
  }

  // * GETTERS

  public String getColore() {
    return this.colore;
  }

  public boolean getIsWireless() {
    return this.isWireless;
  }

  // * SETTERS

  public void setColore(String nuovoColore) {
    this.colore = nuovoColore;
  }

  public void setIsWireless(boolean nuovoIsWireless) {
    this.isWireless = nuovoIsWireless;
  }

  //? aggiunto post correzione

  @Override
  public String toString() {
    return (
      super.toString() +
      "\nColore: " +
      getColore() +
      "\nWireless: " +
      (getIsWireless() ? "sì" : "no")
    );
  }
}
