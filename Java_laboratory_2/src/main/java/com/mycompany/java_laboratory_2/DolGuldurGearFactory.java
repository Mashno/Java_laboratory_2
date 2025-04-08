/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_laboratory_2;

import Armors.Chainmail;
import Armors.Armor;
import Weapons.Spear;
import Weapons.Weapon;
import Banners.SpiderBanner;
import Banners.Banner;



/**
 *
 * @author Владислав
 */
public class DolGuldurGearFactory implements OrcGearFactory {
    @Override
    public Weapon createWeapon() {
        return new Spear();
    }

    @Override
    public Armor createArmor() {
        return new Chainmail();
    }

    @Override
    public Banner createBanner() {
        return new SpiderBanner();
    }
}
