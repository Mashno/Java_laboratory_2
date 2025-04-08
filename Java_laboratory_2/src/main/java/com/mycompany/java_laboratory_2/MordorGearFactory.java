/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_laboratory_2;

import Armors.SteelArmor;
import Armors.Armor;
import Weapons.HeavySword;
import Weapons.Weapon;
import Banners.RedEyeBanner;
import Banners.Banner;



/**
 *
 * @author Владислав
 */
class MordorGearFactory implements OrcGearFactory {
    @Override
    public Weapon createWeapon() { return new HeavySword(); }
    @Override
    public Armor createArmor() { return new SteelArmor(); }
    @Override
    public Banner createBanner() { return new RedEyeBanner(); }
}
