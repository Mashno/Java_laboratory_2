/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_laboratory_2;

/**
 *
 * @author Владислав
 */
// OrcArmyBuilderApp.java
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class OrcArmyBuilderApp extends JFrame {
    private JTree armyTree;
    private DefaultTreeModel treeModel;
    private DefaultMutableTreeNode rootNode;
    private List<Ork> orcs = new ArrayList<>();

    public OrcArmyBuilderApp() {
        setTitle("Армия Саурона");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Создаем дерево армии
        rootNode = new DefaultMutableTreeNode("Армия Мордора");
        treeModel = new DefaultTreeModel(rootNode);
        armyTree = new JTree(treeModel);

        // Панель управления
        JPanel controlPanel = new JPanel();
        JButton addBasicOrkButton = new JButton("Базовый орк");
        JButton addLeaderOrkButton = new JButton("Командир");
        JButton addScoutOrkButton = new JButton("Разведчик");

        // Обработчики кнопок
        addBasicOrkButton.addActionListener(e -> createOrk("basic"));
        addLeaderOrkButton.addActionListener(e -> createOrk("leader"));
        addScoutOrkButton.addActionListener(e -> createOrk("scout"));

        controlPanel.add(addBasicOrkButton);
        controlPanel.add(addLeaderOrkButton);
        controlPanel.add(addScoutOrkButton);

        // Размещаем компоненты
        add(new JScrollPane(armyTree), BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }

    private void createOrk(String type) {
        OrkBuilderFactory factory = new MordorOrkBuilderFactory();
        OrkBuilder builder = factory.createOrkBuilder();
        OrcDirector director = new OrcDirector();

        switch (type) {
            case "basic":
                director.constructBasicOrk(builder);
                break;
            case "leader":
                director.constructLeaderOrk(builder);
                break;
            case "scout":
                director.constructScoutOrk(builder);
                break;
        }

        Ork newOrk = builder.getOrk();
        orcs.add(newOrk);
        DefaultMutableTreeNode orkNode = new DefaultMutableTreeNode(newOrk.getName());
        rootNode.add(orkNode);
        treeModel.reload();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new OrcArmyBuilderApp().setVisible(true);
        });
    }
}