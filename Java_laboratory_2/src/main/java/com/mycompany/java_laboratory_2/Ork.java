/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_laboratory_2;

import AdditionalItems.AdditionalItem;
import Armors.Armor;
import Weapons.Weapon;
import Banners.Banner;

/**
 *
 * @author Владислав
 */
public class Ork {
    private String name;
    private Weapon weapon;
    private Armor armor;
    private Banner banner;
    private AdditionalItem additionalItem;
    private int strength;
    private int agility;
    private int intelligence;
    private int health;
    private String tribe;
    private String type;
    public Ork(){
        
    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public Weapon getWeapon() { return weapon; }
    public void setWeapon(Weapon weapon) { this.weapon = weapon; }
    
    public Armor getArmor() { return armor; }
    public void setArmor(Armor armor) { this.armor = armor; }
    
    public Banner getBanner() { return banner; }
    public void setBanner(Banner banner) { this.banner = banner; }
    
    public AdditionalItem getAdditionalItem() { return additionalItem; }
    public void setAdditionalItem(AdditionalItem additionalItem) { 
        this.additionalItem = additionalItem; 
    }
    
    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }
    
    public int getAgility() { return agility; }
    public void setAgility(int agility) { this.agility = agility; }
    
    public int getIntelligence() { return intelligence; }
    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }
    
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    
    public String getTribe() { return tribe; }
    public void setTribe(String tribe) { this.tribe = tribe; }
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}
