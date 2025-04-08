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

class OrcArmyGUI extends JFrame {
    private JTree armyTree;
    private DefaultTreeModel treeModel;
    private DefaultMutableTreeNode rootNode;
    private JPanel infoPanel;
    

    public OrcArmyGUI() {
        setTitle("Армия Саурона");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 1. Создаем дерево армии
        rootNode = new DefaultMutableTreeNode("Армия Мордора");
        treeModel = new DefaultTreeModel(rootNode);
        armyTree = new JTree(treeModel);
        
        // 2. Панель управления (сверху)
        JPanel controlPanel = new JPanel(new FlowLayout());
        
        // Выбор племени
        JComboBox<String> tribeCombo = new JComboBox<>(new String[]{"Мордор", "Дол Гулдур", "Мглистые Горы"});
        
        // Выбор типа орка
        JComboBox<String> typeCombo = new JComboBox<>(new String[]{"Базовый", "Командир", "Разведчик"});
        
        // Кнопка создания
        JButton createButton = new JButton("Создать орка");
        createButton.addActionListener(e -> createOrk(
            (String)tribeCombo.getSelectedItem(),
            (String)typeCombo.getSelectedItem()
        ));
        
        controlPanel.add(new JLabel("Племя:"));
        controlPanel.add(tribeCombo);
        controlPanel.add(new JLabel("Тип:"));
        controlPanel.add(typeCombo);
        controlPanel.add(createButton);

        // 3. Панель информации (справа)
        infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.setBorder(BorderFactory.createTitledBorder("Информация об орке"));
        updateInfoPanel(null); // Пустая панель по умолчанию

        // 4. Размещаем компоненты
        JSplitPane splitPane = new JSplitPane(
            JSplitPane.HORIZONTAL_SPLIT,
            new JScrollPane(armyTree),
            new JScrollPane(infoPanel)
        );
        splitPane.setDividerLocation(300);
        
        add(controlPanel, BorderLayout.NORTH);
        add(splitPane, BorderLayout.CENTER);

        // Обработчик выбора орка в дереве
        armyTree.addTreeSelectionListener(e -> {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode)armyTree.getLastSelectedPathComponent();
            if (node != null && node.getUserObject() instanceof Ork) {
                updateInfoPanel((Ork)node.getUserObject());
            }
        });
    }

    private void createOrk(String tribe, String type) {
        OrkBuilderFactory factory = getFactoryForTribe(tribe);
        OrkBuilder builder = factory.createOrkBuilder();
        OrcDirector director = new OrcDirector();

        switch(type) {
            case "Базовый" -> director.constructBasicOrk(builder);
            case "Командир" -> director.constructLeaderOrk(builder);
            case "Разведчик" -> director.constructScoutOrk(builder);
        }

        Ork newOrk = builder.getOrk();
        addOrkToTree(newOrk);
    }

    private OrkBuilderFactory getFactoryForTribe(String tribe) {
        return switch(tribe) {
            case "Мордор" -> new MordorOrkBuilderFactory();
            case "Дол Гулдур" -> new DolGuldurOrkBuilderFactory();
            case "Мглистые Горы" -> new MistyMountainsOrkBuilderFactory();
            default -> throw new IllegalArgumentException();
        };
    }

    private void addOrkToTree(Ork ork) {
        // Находим или создаем узел племени
        DefaultMutableTreeNode tribeNode = null;
        for (int i = 0; i < rootNode.getChildCount(); i++) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode)rootNode.getChildAt(i);
            if (node.toString().equals(ork.getTribe())) {
                tribeNode = node;
                break;
            }
        }
        
        if (tribeNode == null) {
            tribeNode = new DefaultMutableTreeNode(ork.getTribe());
            rootNode.add(tribeNode);
        }
        
        // Добавляем орка
        tribeNode.add(new DefaultMutableTreeNode(ork));
        treeModel.reload();
    }

    private void updateInfoPanel(Ork ork) {
        infoPanel.removeAll();
        
        if (ork == null) {
            infoPanel.add(new JLabel("Выберите орка для просмотра информации"));
        } else {
            // 1. Основная информация
            infoPanel.add(new JLabel("Имя: " + ork.getName()));
            infoPanel.add(new JLabel("Племя: " + ork.getTribe()));
            infoPanel.add(Box.createVerticalStrut(10));
            
            // 2. Снаряжение
            infoPanel.add(new JLabel("Оружие: " + ork.getWeapon().getName()));
            infoPanel.add(new JLabel("Броня: " + ork.getArmor().getName()));
            if (ork.getBanner() != null) {
                infoPanel.add(new JLabel("Знамя: " + ork.getBanner().getName()));
            }
            if (ork.getAdditionalItem() != null) {
                infoPanel.add(new JLabel("Доп. предмет: " + ork.getAdditionalItem().getName()));
            }
            infoPanel.add(Box.createVerticalStrut(10));
            
            // 3. Характеристики (прогресс-бары)
            infoPanel.add(new JLabel("Сила:"));
            infoPanel.add(createProgressBar(ork.getStrength()));
            
            infoPanel.add(new JLabel("Ловкость:"));
            infoPanel.add(createProgressBar(ork.getAgility()));
            
            infoPanel.add(new JLabel("Интеллект:"));
            infoPanel.add(createProgressBar(ork.getIntelligence()));
            
            infoPanel.add(new JLabel("Здоровье:"));
            infoPanel.add(createProgressBar(ork.getHealth(), 200));
        }
        
        infoPanel.revalidate();
        infoPanel.repaint();
    }

    private JProgressBar createProgressBar(int value) {
        return createProgressBar(value, 100);
    }

    private JProgressBar createProgressBar(int value, int max) {
        JProgressBar pb = new JProgressBar(0, max);
        pb.setValue(value);
        pb.setStringPainted(true);
        return pb;
    }
}