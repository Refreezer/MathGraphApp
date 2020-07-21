/*
 * Created by JFormDesigner on Tue Jul 21 02:31:21 MSK 2020
 */

package com.company;

import javax.swing.*;

/**
 * @author unknown
 */
public class AppForm extends JFrame {
    public AppForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        button2 = new JButton();
        button1 = new JButton();
        slider1 = new JSlider();
        scrollPane1 = new JScrollPane();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        //---- button2 ----
        button2.setText("text");
        contentPane.add(button2);

        //---- button1 ----
        button1.setText("tan(x)");
        contentPane.add(button1);
        contentPane.add(slider1);
        contentPane.add(scrollPane1);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton button2;
    private JButton button1;
    private JSlider slider1;
    private JScrollPane scrollPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
