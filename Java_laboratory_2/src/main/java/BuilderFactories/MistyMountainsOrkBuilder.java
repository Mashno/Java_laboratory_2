/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderFactories;

import AdditionalItems.Horn;
import Weapons.Bow;
import GearFactories.MistyMountainsGearFactory;
import GearFactories.OrcGearFactory;
import com.mycompany.java_laboratory_2.OrkBuilder;



/**
 *
 * @author Владислав
 */
public class MistyMountainsOrkBuilder extends OrkBuilder {
    private OrcGearFactory gearFactory = new MistyMountainsGearFactory();

    @Override
    protected String getTribeSuffix() {
        return "-гор";
    }

    @Override
    public void generateName() {
        String baseName = faker.lordOfTheRings().character();
        ork.setName(baseName + getTribeSuffix());
    }

    @Override
    public void buildWeapon() {
        if ("Разведчик".equals(ork.getType())) {
            ork.setWeapon(new Bow());
        } else {
            ork.setWeapon(gearFactory.createWeapon());
        }
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
        // Высокая ловкость (+30%), низкий интеллект
        ork.setStrength((int)(Math.random() * 70 + 30));
        ork.setAgility((int)(Math.random() * 100 + 30));
        ork.setIntelligence((int)(Math.random() * 30));
        ork.setHealth((int)(Math.random() * 150 + 50));
        ork.setTribe("Мглистые Горы");
    }
}
