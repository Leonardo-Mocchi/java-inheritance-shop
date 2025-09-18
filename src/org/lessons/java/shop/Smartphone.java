package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto {

  private String IMEI;
  private int memoria;

  Smartphone(
    String nome,
    String marca,
    BigDecimal prezzo,
    String IMEI,
    int memoria
  ) {
    super(nome, marca, prezzo, false);
    IMEIvalidator(IMEI);

    this.memoria = memoria;
  }

  // * GETTERS

  public String getIMEI() {
    return this.IMEI;
  }

  public int getMemoria() {
    return this.memoria;
  }

  // * SETTERS

  public void setIMEI(String nuovoIMEI) {
    this.IMEI = IMEIvalidator(nuovoIMEI);
  }

  public void setMemoria(int nuovaMemoria) {
    this.memoria = nuovaMemoria;
  }

  // * utility

  public String IMEIvalidator(String IMEI) {
    if (!IMEI.matches("\\d{15}")) {
      // IMEI is not 15 digits, generate a random 15-digit IMEI
      return String.format("%015d", new Random().nextLong() & Long.MAX_VALUE);
    } else {
      return IMEI;
    }
  }
}
