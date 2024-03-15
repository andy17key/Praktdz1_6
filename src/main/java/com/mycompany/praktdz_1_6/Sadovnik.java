/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktdz_1_6;

/**
 *
 * @author Andrew B
 */
public class Sadovnik {
    public void filter(Plant plant) {
        String newPlantName = plant.getName().replace("а", "")
                .replace("е", "").replace("о", "")
                .replace("и", "").replace("ю", "")
                .replace("у", "").replace("ы", "")
                .replace("э", "").replace("я", "");
        System.out.println(plant.getName() + ", " + newPlantName + " VGTBL");
    }
    
}
