/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_laboratory_2;

/**
 *
 * @author Владислав
 */
import com.github.javafaker.Faker;

public abstract class OrkBuilder {
    protected Ork ork;
    protected Faker faker = new Faker();

    public OrkBuilder() {
        this.ork = new Ork();
    }

    public Ork getOrk() {
        return ork;
    }

    protected abstract String getTribeSuffix();

    public void generateName() {
        String baseName = faker.lordOfTheRings().character();
        ork.setName(baseName + getTribeSuffix());
    }

    public abstract void buildWeapon();
    public abstract void buildArmor();
    public abstract void buildBanner();
    public abstract void buildAdditionalItem();
    public abstract void buildStats();
}