/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_laboratory_2;

/**
 *
 * @author Владислав
 */
public class OrcDirector {
    public void constructBasicOrk(OrkBuilder builder) {
        builder.getOrk().setType("Базовый");
        builder.generateName();
        builder.buildWeapon();
        builder.buildArmor();
        builder.buildStats();
        builder.buildAdditionalItem();
    }

    public void constructLeaderOrk(OrkBuilder builder) {
        builder.getOrk().setType("Командир");
        builder.generateName();
        builder.buildWeapon();
        builder.buildArmor();
        builder.buildBanner();
        builder.buildStats();
        builder.buildAdditionalItem();
    }

    public void constructScoutOrk(OrkBuilder builder) {
        builder.getOrk().setType("Разведчик");
        builder.generateName();
        builder.buildWeapon();
        builder.buildArmor();
        builder.buildStats();
        builder.buildAdditionalItem();
    }
}
