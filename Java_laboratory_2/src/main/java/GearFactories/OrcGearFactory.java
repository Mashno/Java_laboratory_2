/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GearFactories;

import Armors.Armor;
import Banners.Banner;
import Weapons.Weapon;

/**
 *
 * @author Владислав
 */
public interface OrcGearFactory {
    Weapon createWeapon();
    Armor createArmor();
    Banner createBanner();
}
