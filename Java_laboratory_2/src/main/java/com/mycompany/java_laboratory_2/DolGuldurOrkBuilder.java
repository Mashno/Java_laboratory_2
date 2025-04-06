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

    @Override
    public void buildArmor() {
        ork.setArmor(gearFactory.createArmor());
    }

    @Override
    public void buildBanner() {
        ork.setBanner(gearFactory.createBanner());
    }

    @Override
    public void buildAdditionalItem() {
        ork.setAdditionalItem("Черный посох");
    }

    @Override
    public void buildStats() {
        // Сбалансированные характеристики
        ork.setStrength((int)(Math.random() * 85 + 15));
        ork.setAgility((int)(Math.random() * 85 + 15));
        ork.setIntelligence((int)(Math.random() * 50));
        ork.setHealth((int)(Math.random() * 150 + 50));
        ork.setTribe("Дол Гулдур");
    }
}
