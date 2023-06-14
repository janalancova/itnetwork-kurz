/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.main5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Evidence {
    private ArrayList<Pojistenec> pojistenci;
   
    public Evidence() {
        pojistenci = new ArrayList<>();
    }
    
   public void pridejPojistence(Pojistenec pojistenec) {
       pojistenci.add(pojistenec);      
   }
   
   public void vypisPojistene() {
        for (Pojistenec pojistenec : pojistenci) {
            System.out.println(pojistenec);
        }
   }
   
   public void vyhledejPojistence(String hledaneJmeno, String hledanePrijmeni) {
    boolean nalezeno = false; // Předpokládáme, že pojistěný s daným jménem a příjmením nebyl nalezen

    for (Pojistenec pojistenec : pojistenci) {
        if (pojistenec.getJmeno().equalsIgnoreCase(hledaneJmeno) && pojistenec.getPrijmeni().equalsIgnoreCase(hledanePrijmeni)) {
            nalezeno = true; // Pojistěný byl nalezen
            System.out.println("Pojištěnec:\n" + pojistenec);
        }
    }

    if (!nalezeno) {
        System.out.println("Pojištěný s daným jménem a příjmením nebyl nalezen.");
    }
}
}