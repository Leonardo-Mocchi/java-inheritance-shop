package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Carrello {

  public static Prodotto[] addProdottoToCarrello(
    Prodotto[] carrello,
    Prodotto prodotto
  ) {
    Prodotto[] carrelloAggiornato = new Prodotto[carrello.length + 1];

    for (int i = 0; i < carrello.length; i++) {
      carrelloAggiornato[i] = carrello[i];
    }

    carrelloAggiornato[carrelloAggiornato.length - 1] = prodotto;

    return carrelloAggiornato;
  }

  public static void main(String[] args) {
    Prodotto[] carrello = new Prodotto[0];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < Integer.MAX_VALUE; i++) {
      if (carrello.length == 0) {
        System.out.println(
          "\nBenvenuto stimato cliente \nChe tipo di articolo sta acquistando? \nSpecifichi se si tratta di Smartphone, Televisore o Cuffie:"
        );
      } else if (carrello.length > 0) {
        System.out.println(
          "\nInserire l'articolo numero " +
          (carrello.length + 1) +
          "\nSpecifichi se si tratta di Smartphone, Televisore o Cuffie:\""
        );
      }

      String productInput = scanner.nextLine().toLowerCase();
      // System.out.println(productInput); // debug

      if (
        productInput.equals("smartphone") ||
        productInput.equals("telefono") ||
        productInput.equals("cellulare") ||
        productInput.equals("televisore") ||
        productInput.equals("televisione") ||
        productInput.equals("cuffie") ||
        productInput.equals("cuffia")
      ) {
        // nome del prodotto
        System.out.println("Inserite il nome del prodotto:");
        String productName = scanner.nextLine();

        // marca del prodotto
        System.out.println("Inserite la marca del prodotto:");
        String productMarca = scanner.nextLine();

        // prezzo del prodotto
        System.out.println(
          "Ora immettete il prezzo FINALE del prodotto (con IVA inclusa):"
        );
        String priceInput = scanner.nextLine();
        BigDecimal fullPrice = new BigDecimal(priceInput);

        // Calculate base price (without IVA) from full price
        // fullPrice = basePrice * 1.22, so basePrice = fullPrice / 1.22
        BigDecimal productPrezzo = fullPrice.divide(
          new BigDecimal("1.22"),
          2,
          RoundingMode.HALF_UP
        );

        // da qui si entra nei valori specifici delle singole classi di prodotto quindi apro un check condizionale

        //! smartphone
        if (
          productInput.equals("smartphone") ||
          productInput.equals("telefono") ||
          productInput.equals("cellulare")
        ) {
          System.out.println(
            "Inserite il codice IMEI del prodotto (15 cifre!)"
          );
          String productIMEI = scanner.nextLine();

          System.out.println(
            "Per finire inserite la quantità di memoria del modello di Smartphone (in MegaByte)"
          );
          int productMemory = scanner.nextInt();
          scanner.nextLine(); // consume newline

          Smartphone smartPhone = new Smartphone(
            productName,
            productMarca,
            productPrezzo,
            productIMEI,
            productMemory
          );

          carrello = addProdottoToCarrello(carrello, smartPhone);
        }
        //! televisore
        else if (
          productInput.equals("televisore") ||
          productInput.equals("televisione")
        ) {
          System.out.println("Inserite la Larghezza della TV (in cm)");
          BigDecimal productLarghezza = BigDecimal.valueOf(scanner.nextInt());
          scanner.nextLine(); // consume newline

          System.out.println("Inserite la Altezza della TV (in cm)");
          BigDecimal productAltezza = BigDecimal.valueOf(scanner.nextInt());
          scanner.nextLine(); // consume newline

          System.out.println("Inserite la Profondità della TV (in cm)");
          BigDecimal productProfondità = BigDecimal.valueOf(scanner.nextInt());
          scanner.nextLine(); // consume newline

          System.out.println("Quanti pollici ha la tv?");
          BigDecimal productPollici = BigDecimal.valueOf(scanner.nextInt());
          scanner.nextLine(); // consume newline

          System.out.println("E per finire: è una smart tv? (s/n)");
          String smartResponse = scanner.next().toLowerCase();
          scanner.nextLine(); // consume newline
          boolean productIsSmartTV =
            smartResponse.equals("s") ||
            smartResponse.equals("si") ||
            smartResponse.equals("yes");

          Televisore televisore = new Televisore(
            productName,
            productMarca,
            productPrezzo,
            productLarghezza,
            productAltezza,
            productProfondità,
            productPollici,
            productIsSmartTV
          );

          carrello = addProdottoToCarrello(carrello, televisore);
        }
        //! cuffie
        else if (
          productInput.equals("cuffie") || productInput.equals("cuffia")
        ) {
          System.out.println("Inserite il colore delle cuffie");
          String productColore = scanner.nextLine();

          System.out.println("E per finire: sono cuffie WIRELESS? (s/n)");
          String smartResponse = scanner.next().toLowerCase();
          scanner.nextLine(); // consume newline
          boolean productIsWireless =
            smartResponse.equals("s") ||
            smartResponse.equals("si") ||
            smartResponse.equals("yes");

          Cuffie cuffie = new Cuffie(
            productName,
            productMarca,
            productPrezzo,
            productColore,
            productIsWireless
          );

          carrello = addProdottoToCarrello(carrello, cuffie);
        }
      } else {
        System.out.println(
          "\nOps.. non vendiamo questo tipo di prodotti!\nForse in futuro ;)\nArrivederci e buona giornata!"
        );
      }

      System.out.println("\nVuoi aggiungere altri prodotti? (s/n)");
      String continueResponse = scanner.nextLine().toLowerCase();

      if (!continueResponse.equals("s") && !continueResponse.equals("si")) {
        break; // Exit the for loop
      }
    }

    // Print final cart
    System.out.println("\nIl tuo carrello finale:");
    System.out.println("============================");
    for (int i = 0; i < carrello.length; i++) {
      System.out.println("Prodotto " + (i + 1) + ":");
      System.out.println(carrello[i].toString());
      System.out.println("----------------------------");
    }
    System.out.println("Totale articoli nel carrello: " + carrello.length);
    System.out.println("Grazie per l'acquisto!");

    scanner.close();
  }
}
