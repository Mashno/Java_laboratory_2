/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_laboratory_2;

import BuilderFactories.MordorOrkBuilder;
import BuilderFactories.OrkBuilderFactory;

/**
 *
 * @author Владислав
 */
public class MordorOrkBuilderFactory extends OrkBuilderFactory {
    @Override
    public OrkBuilder createOrkBuilder() {
        return new MordorOrkBuilder();
    }
}