/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GearFactories;

import Armors.LeatherArmor;
import Armors.Armor;
import Weapons.Axe;
import Weapons.Weapon;
import Banners.MoonBanner;
import Banners.Banner;



/**
 *
 * @author Владислав
 */
public class MistyMountainsGearFactory implements OrcGearFactory {
    @Override
    public Weapon createWeapon() {
        return new Axe();
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }

    @Override
    public Banner createBanner() {
        return new MoonBanner();
    }
}