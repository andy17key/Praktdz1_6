/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.praktdz_1_6;

import java.util.Scanner;

/**
 *
 * @author Andrew B
 */
public class Praktdz_1_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String plantName = input.next();
        Plant plant = new Plant();
        plant.setName(plantName);

        Sadovnik sadovnik = new Sadovnik();

        System.out.println("Богданов Андрей Вариант 4");
        sadovnik.filter(plant);
    }
}