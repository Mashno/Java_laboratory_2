/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_laboratory_2;

/**
 *
 * @author Владислав
 */
public class MistyMountainsOrkBuilder extends OrkBuilder {
    private OrcGearFactory gearFactory = new MistyMountainsGearFactory();

    @Override
    protected String getTribeSuffix() { return "-гор"; }

    @Override
    public void buildWeapon() {
        ork.setWeapon(gearFactory.createWeapon());
    }

    // Остальные методы с характеристиками для Мглистых Гор
}