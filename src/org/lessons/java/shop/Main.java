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

    System.out.println("Invece qui con l'approccio toString:");
    System.out.println(Doritos.toString());

    System.out.println();

    // </editor-fold>

    // <editor-fold desc="Prodotto - Smartphone">
    Smartphone bestPhoneEverMade = new Smartphone(
      "3310",
      "Nokia",
      new BigDecimal(122.95),
      "",
      16
    );

    System.out.println(
      "Il codice prodotto del prodotto " +
      bestPhoneEverMade.getMarca() +
      " " +
      bestPhoneEverMade.getNome() +
      " è: " +
      bestPhoneEverMade.getCodice()
    );

    System.out.println(
      "La marca del prodotto " +
      bestPhoneEverMade.getNome() +
      " è: " +
      bestPhoneEverMade.getMarca()
    );
    System.out.println(
      "Il prezzo (senza iva) del prodotto " +
      bestPhoneEverMade.getMarca() +
      " " +
      bestPhoneEverMade.getNome() +
      "  è: " +
      bestPhoneEverMade.getPrezzo() +
      "$"
    );
    System.out.println(
      "Il prezzo pieno del prodotto " +
      bestPhoneEverMade.getMarca() +
      " " +
      bestPhoneEverMade.getNome() +
      " è: " +
      bestPhoneEverMade.getPrezzoPieno() +
      "$, di cui IVA " +
      bestPhoneEverMade.getIva() +
      "$"
    );
    bestPhoneEverMade.printNomeEsteso();

    System.out.println(
      "Il codice IMEI del prodotto " +
      bestPhoneEverMade.getMarca() +
      " " +
      bestPhoneEverMade.getNome() +
      " è: " +
      bestPhoneEverMade.getIMEI()
    );

    System.out.println(
      "La quantità di memoria interna del dispositivo " +
      bestPhoneEverMade.getMarca() +
      " " +
      bestPhoneEverMade.getNome() +
      " ammonta a " +
      bestPhoneEverMade.getMemoriaMB() +
      "MB"
    );

    System.out.println();

    System.out.println("Invece qui con l'approccio toString:");
    System.out.println(bestPhoneEverMade.toString());

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
      biggestCRT.getMarca() +
      " " +
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
      biggestCRT.getMarca() +
      " " +
      biggestCRT.getNome() +
      "  è: " +
      biggestCRT.getPrezzo() +
      "$"
    );
    System.out.println(
      "Il prezzo pieno del prodotto " +
      biggestCRT.getMarca() +
      " " +
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

    String smartTVMessage = String.format(
      "La televisione %s smart",
      biggestCRT.getIsSmartTV() ? "è" : "non è"
    );
    System.out.println(smartTVMessage);

    System.out.println();

    System.out.println("Invece qui con l'approccio toString:");
    System.out.println(biggestCRT.toString());

    System.out.println();
    // </editor-fold>

    // <editor-fold desc="Prodotto - Cuffie">
    Cuffie cuffieGaming = new Cuffie(
      "PRO X",
      "Logitech",
      new BigDecimal(118.85),
      "Nero",
      true
    );

    System.out.println(
      "Il codice prodotto del prodotto " +
      cuffieGaming.getMarca() +
      " " +
      cuffieGaming.getNome() +
      " è: " +
      cuffieGaming.getCodice()
    );

    System.out.println(
      "La marca del prodotto " +
      cuffieGaming.getNome() +
      " è: " +
      cuffieGaming.getMarca()
    );
    System.out.println(
      "Il prezzo (senza iva) del prodotto " +
      cuffieGaming.getNome() +
      "  è: " +
      cuffieGaming.getPrezzo() +
      "$"
    );
    System.out.println(
      "Il prezzo pieno del prodotto " +
      cuffieGaming.getMarca() +
      " " +
      cuffieGaming.getNome() +
      " è: " +
      cuffieGaming.getPrezzoPieno() +
      "$, di cui IVA " +
      cuffieGaming.getIva() +
      "$"
    );
    cuffieGaming.printNomeEsteso();

    System.out.println(
      "Il prodotto " +
      cuffieGaming.getMarca() +
      " " +
      cuffieGaming.getNome() +
      " è di colore " +
      cuffieGaming.getColore()
    );

    String wirelessHeadphonesMessage = String.format(
      "Le cuffie %s wireless",
      cuffieGaming.getIsWireless() ? "sono" : "non sono"
    );

    System.out.println(wirelessHeadphonesMessage);

    System.out.println();

    System.out.println("Invece qui con l'approccio toString:");
    System.out.println(cuffieGaming.toString());
    // </editor-fold>
  }
}
