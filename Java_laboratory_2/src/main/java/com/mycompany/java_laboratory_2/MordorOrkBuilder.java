/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_laboratory_2;

/**
 *
 * @author Владислав
 */
public class MordorOrkBuilder extends OrkBuilder {
    private OrcGearFactory gearFactory = new MordorGearFactory();

    @Override
    protected String getTribeSuffix() {
        return "-мор";
    }

    @Override
    public void generateName() {
        String baseName = faker.lordOfTheRings().character();
        ork.setName(baseName + getTribeSuffix());
    }

    @Override
    public void buildWeapon() {
        ork.setWeapon("Разведчик".equals(ork.getType()) ? new Bow() : gearFactory.createWeapon());
    }

    @Override
    public void buildArmor() {
        ork.setArmor(gearFactory.createArmor());
    }

    @Override
    public void buildBanner() {
        ork.setBanner("Командир".equals(ork.getType()) ? gearFactory.createBanner() : null);
    }

    @Override
    public void buildAdditionalItem() {
        if ("Командир".equals(ork.getType())) {
            ork.setAdditionalItem(new Horn());
        } else {
            ork.setAdditionalItem(null);
        }
    }

    @Override
    public void buildStats() {
        ork.setStrength((int)(Math.random() * 70 + 30)); // +30% к силе
        ork.setAgility((int)(Math.random() * 100));
        ork.setIntelligence((int)(Math.random() * 50));
        ork.setHealth((int)(Math.random() * 150 + 50));
        ork.setTribe("Мордор");
    }
}
