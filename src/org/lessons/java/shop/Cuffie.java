package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

  private String colore;
  private boolean wireless = false;

  Cuffie(
    String nome,
    String marca,
    BigDecimal prezzo,
    String colore,
    boolean wireless
  ) {
    super(nome, marca, prezzo, false);
    this.colore = colore;
    this.wireless = wireless;
  }

  // * GETTERS

  public String getColore() {
    return this.colore;
  }

  public boolean getWireless() {
    return this.wireless;
  }

  // * SETTERS

  public void setColore(String nuovoColore) {
    this.colore = nuovoColore;
  }

  public void setWireless(boolean nuovaWireless) {
    this.wireless = nuovaWireless;
  }
}
