package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {
    System.out.println();

    // <editor-fold desc="Prodotto base Doritos">
    Prodotto Doritos = new Prodotto(
      "Doritos Tex Mex",
      "Doritos",
      new BigDecimal("2.20"),
      true
    );

    System.out.println(
      "Il codice prodotto del prodotto " +
      Doritos.getNome() +
      " è: " +
      Doritos.getCodice()
    );

    System.out.println(
      "La marca del prodotto " + Doritos.getNome() + " è: " + Doritos.getMarca()
    );
    System.out.println(
      "Il prezzo (senza iva) del prodotto " +
      Doritos.getNome() +
      "  è: " +
      Doritos.getPrezzo() +
      "$"
    );
    System.out.println(
      "Il prezzo pieno del prodotto " +
      Doritos.getNome() +
      " è: " +
      Doritos.getPrezzoPieno() +
      "$, di cui IVA " +
      Doritos.getIva() +
      "$"
    );
    Doritos.printNomeEsteso();

    System.out.println();
    // </editor-fold>

    // <editor-fold desc="Prodotto - Televisore">
    Televisore biggestCRT = new Televisore(
      "PVM-4300",
      "Sony",
      new BigDecimal(32786.88),
      new BigDecimal(105),
      new BigDecimal(92.5),
      new BigDecimal(76.7),
      new BigDecimal(43),
      false
    );

    System.out.println(
      "Il codice prodotto del prodotto " +
      biggestCRT.getNome() +
      " è: " +
      biggestCRT.getCodice()
    );

    System.out.println(
      "La marca del prodotto " +
      biggestCRT.getNome() +
      " è: " +
      biggestCRT.getMarca()
    );
    System.out.println(
      "Il prezzo (senza iva) del prodotto " +
      biggestCRT.getNome() +
      "  è: " +
      biggestCRT.getPrezzo() +
      "$"
    );
    System.out.println(
      "Il prezzo pieno del prodotto " +
      biggestCRT.getNome() +
      " è: " +
      biggestCRT.getPrezzoPieno() +
      "$, di cui IVA " +
      biggestCRT.getIva() +
      "$"
    );
    biggestCRT.printNomeEsteso();

    System.out.println(
      "Le dimensioni del prodotto sono: " +
      biggestCRT.getDimensioni() +
      ", e con un pannello da " +
      biggestCRT.getPollici()
    );

    String smartTvMessage = String.format(
      "La televisione %s smart",
      biggestCRT.getIsSmartTv() ? "è" : "non è"
    );
    System.out.println(smartTvMessage);

    System.out.println();
    // <editor-fold>

  }
}
