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
    protected Ork ork = new Ork();
    protected Faker faker = new Faker();

    public abstract void generateName();
    public abstract void buildWeapon();
    public abstract void buildArmor();
    public abstract void buildBanner();
    public abstract void buildAdditionalItem();
    public abstract void buildStats();

    public Ork getOrk() {
        return ork;
    }

    protected abstract String getTribeSuffix();
}