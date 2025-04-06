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
        builder.generateName();
        builder.buildWeapon();
        builder.buildArmor();
        builder.buildStats();
        builder.getOrk().setType("Базовый");
    }

    public void constructLeaderOrk(OrkBuilder builder) {
        builder.generateName();
        builder.buildWeapon();
        builder.buildArmor();
        builder.buildBanner();
        builder.buildAdditionalItem();
        builder.buildStats();
        builder.getOrk().setType("Командир");
    }

    public void constructScoutOrk(OrkBuilder builder) {
        builder.generateName();
        builder.buildWeapon();
        builder.buildArmor();
        builder.buildAdditionalItem();
        builder.buildStats();
        builder.getOrk().setType("Разведчик");
    }
}
