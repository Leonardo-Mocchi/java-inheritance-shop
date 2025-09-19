package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Televisore extends Prodotto {

  private BigDecimal larghezza;
  private BigDecimal altezza;
  private BigDecimal profondità;
  private BigDecimal pollici;
  private boolean isSmartTV;

  Televisore(
    String nome,
    String marca,
    BigDecimal prezzo,
    BigDecimal larghezza,
    BigDecimal altezza,
    BigDecimal profondità,
    BigDecimal pollici,
    boolean isSmartTV
  ) {
    super(nome, marca, prezzo, false);
    this.larghezza = larghezza.setScale(2, RoundingMode.HALF_UP);
    this.altezza = altezza.setScale(2, RoundingMode.HALF_UP);
    this.profondità = profondità.setScale(2, RoundingMode.HALF_UP);
    this.pollici = pollici.setScale(2, RoundingMode.HALF_UP);
    this.isSmartTV = isSmartTV;
  }

  // * GETTERS

  public BigDecimal getLarghezza() {
    return this.larghezza;
  }

  public BigDecimal getAltezza() {
    return this.altezza;
  }

  public BigDecimal getProfondità() {
    return this.profondità;
  }

  public String getDimensioni() {
    return String.format(
      "%s cm x %s cm x %s cm",
      larghezza,
      altezza,
      profondità
    );
  }

  public String getPollici() {
    return String.format("%s\"", pollici);
  }

  public boolean getIsSmartTV() {
    return this.isSmartTV;
  }

  // * SETTERS

  public void setLarghezza(BigDecimal nuovaLarghezza) {
    this.larghezza = nuovaLarghezza;
  }

  public void setAltezza(BigDecimal nuovaAltezza) {
    this.altezza = nuovaAltezza;
  }

  public void setProfondità(BigDecimal nuovaProfondità) {
    this.profondità = nuovaProfondità;
  }

  public void setPollici(BigDecimal nuoviPollici) {
    this.pollici = nuoviPollici;
  }

  public void setIsSmartTV(boolean isSmartTV) {
    this.isSmartTV = isSmartTV;
  }

  //? aggiunto post correzione

  @Override
  public String toString() {
    return (
      super.toString() +
      "\nDimensioni: " +
      getDimensioni() +
      "\nPollici: " +
      getPollici() +
      "\nSmart: " +
      (getIsSmartTV() ? "sì" : "no")
    );
  }
}
