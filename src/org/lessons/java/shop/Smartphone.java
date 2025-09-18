package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto {

  private String IMEI;
  private int memoriaMB;

  Smartphone(
    String nome,
    String marca,
    BigDecimal prezzo,
    String IMEI,
    int memoriaMB
  ) {
    super(nome, marca, prezzo, false);
    //
    this.IMEI = IMEIvalidator(IMEI);

    this.memoriaMB = memoriaMB;
  }

  // * GETTERS

  public String getIMEI() {
    return this.IMEI;
  }

  public int getMemoriaMB() {
    return this.memoriaMB;
  }

  // * SETTERS

  public void setIMEI(String nuovoIMEI) {
    this.IMEI = IMEIvalidator(nuovoIMEI);
  }

  public void setMemoriaMB(int nuovaMemoriaMB) {
    this.memoriaMB = nuovaMemoriaMB;
  }

  // * utility

  public String IMEIvalidator(String IMEI) {
    if (!IMEI.matches("\\d{15}")) {
      // IMEI is not 15 digits, generate a random 15-digit IMEI
      StringBuilder randomIMEI = new StringBuilder();
      Random rand = new Random();
      for (int i = 0; i < 15; i++) {
        randomIMEI.append(rand.nextInt(10));
      }
      return randomIMEI.toString();
    } else {
      return IMEI;
    }
  }
}
