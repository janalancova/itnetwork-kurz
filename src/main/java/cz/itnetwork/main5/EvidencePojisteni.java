/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.main5;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class EvidencePojisteni {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"Windows-1250");
        Evidence evidence = new Evidence();

        String volba;
        do {
            System.out.println("----------------------------");
            System.out.println("Evidence pojištěných");
            System.out.println("----------------------------");
            System.out.println("Vyberte si akci:");
            System.out.println("1 – Přidat nového pojištěného");
            System.out.println("2 – Vypsat všechny pojištěné");
            System.out.println("3 – Vyhledat pojištěného");
            System.out.println("4 – Konec");
            volba = scanner.nextLine();

            switch (volba) {
                 case "1":
                    String jmeno;
                    String prijmeni;
                    String telefonniCislo;
                    int vek;
                    do {
                        System.out.println("Zadejte jméno pojištěného:");
                        jmeno = scanner.nextLine();
                        if (jmeno.trim().isEmpty()) {
                            System.out.println("Neplatné zadání, zadejte jméno pojištěného:");
                        }
                    } while (jmeno.trim().isEmpty());

                    do {
                        System.out.println("Zadejte příjmení:");
                        prijmeni = scanner.nextLine();
                        if (prijmeni.trim().isEmpty()) {
                            System.out.println("Neplatné zadání, zadejte příjmení pojištěného:");
                        }
                    } while (prijmeni.trim().isEmpty());

                    do {
                        System.out.println("Zadejte telefonní číslo:");
                        telefonniCislo = scanner.nextLine();
                        if (telefonniCislo.trim().isEmpty()) {
                            System.out.println("Neplatné zadání, zadejte telefonní číslo pojištěného:");
                        }
                    } while (telefonniCislo.trim().isEmpty());

                    do {
                        System.out.println("Zadejte věk:");
                        try {
                            vek = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Neplatné zadání, zadejte celé číslo pro věk pojištěného:");
                        }
                    } while (true);

                    Pojistenec pojistenec = new Pojistenec(jmeno, prijmeni, vek, telefonniCislo);
                    evidence.pridejPojistence(pojistenec);

                    System.out.println("Data byla uložena. Stiskněte Enter...");
                    scanner.nextLine(); // Pro čekání na stisknutí klávesy Enter
                    break;

                case "2":
                    System.out.println("----------------------------");
                    System.out.println("Evidence pojištěných");
                    System.out.println("----------------------------");
                    evidence.vypisPojistene();
                    System.out.println("Stiskněte Enter...");
                    scanner.nextLine();
                    break;

                case "3":
                    System.out.println("----------------------------");
                    System.out.println("Evidence pojištěných");
                    System.out.println("----------------------------");
                    System.out.println("Zadejte jméno pojištěného:");
                    String hledaneJmeno = scanner.nextLine();

                    System.out.println("Zadejte příjmení pojištěného:");
                    String hledanePrijmeni = scanner.nextLine();

                    evidence.vyhledejPojistence(hledaneJmeno, hledanePrijmeni);
                    System.out.println("Stiskněte Enter...");
                    scanner.nextLine();
                    break;
                case "4":
                      System.out.println("Děkujeme za využití aplikace Evidence pojištění.");
                    break;  
                default:
                    System.out.println("Neplatná volba, zadejte 1 - 4");
            }
        } while (! volba.equals("4"));
          scanner.close();
    }
}
 