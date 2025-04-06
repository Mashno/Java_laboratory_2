/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_laboratory_2;

/**
 *
 * @author Владислав
 */
public class DolGuldurGearFactory implements OrcGearFactory {
    @Override
    public String createWeapon() { return "Копье"; }
    
    @Override
    public String createArmor() { return "Кольчуга"; }
    
    @Override
    public String createBanner() { return "Знамя с пауком"; }
}
