/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.main5;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Pojistenec {
    /**
     * Jméno pojištěného
     */
    private String jmeno;

    /**
     * Přijmení pojištěného
     */
    private String prijmeni; 
    
     /**
     * Věk pojištěného
     */
    private int vek;
    
     /**
     * Telefonní číslo pojištěného
     */
    private String telefonniCislo;
     /**
     * Konstruktor
     * 
     * @param jmeno Jméno
     * @param prijmeni Přijmení
     * @param vek  Věk
     * @param telefonniCislo Telefonní číslo
     */
    public Pojistenec(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }
    
    /**
     * Vrátí jméno pojištěného
     */
    public String getJmeno() {
        return jmeno;
    }
    
    /**
     * Vrátí příjmení pojištěného
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Vrátí věk pojištěného
     */
    public int getVek() {
        return vek;
    }
    
    /**
     * Vrátí telefonní číslo pojištěného
     */
    public String getTelefonniCislo() {
        return telefonniCislo;
    }
    
    @Override
    public String toString() {
        return jmeno + "\t" + prijmeni + "\t" + vek + "\t" + telefonniCislo;
    }
}
