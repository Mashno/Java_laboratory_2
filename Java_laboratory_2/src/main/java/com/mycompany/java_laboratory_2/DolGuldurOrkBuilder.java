/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_laboratory_2;

/**
 *
 * @author Владислав
 */
public class DolGuldurOrkBuilder extends OrkBuilder {
    private OrcGearFactory gearFactory = new DolGuldurGearFactory();

    @Override
    protected String getTribeSuffix() { return "-дур"; }

    @Override
    public void buildWeapon() {
        ork.setWeapon(gearFactory.createWeapon());
    }

    // Остальные методы аналогично MordorOrkBuilder
    // с соответствующими характеристиками для Dol Guldur
}
