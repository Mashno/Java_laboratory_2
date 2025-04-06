/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_laboratory_2;

/**
 *
 * @author Владислав
 */
public class MistyMountainsGearFactory implements OrcGearFactory {
    @Override
    public String createWeapon() { return "Топор"; }
    
    @Override
    public String createArmor() { return "Кожаная броня"; }
    
    @Override
    public String createBanner() { 
        return "Знамя с Луной"; 
    }
}