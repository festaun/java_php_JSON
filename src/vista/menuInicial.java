/*
 * Created by JFormDesigner on Tue Nov 17 13:54:07 CET 2015
 */

package vista;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class menuInicial {
    public menuInicial() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Francisco Estaun
        panelLog = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        separator1 = new JSeparator();
        label3 = new JLabel();
        button1 = new JButton();

        //======== panelLog ========
        {
            Container panelLogContentPane = panelLog.getContentPane();

            //---- label1 ----
            label1.setText("Usuario");

            //---- label2 ----
            label2.setText("Contrase\u00f1a");

            //---- label3 ----
            label3.setIcon(new ImageIcon("C:\\Users\\CurroEt\\Documents\\GitHub\\java_php_JSON\\src\\resources\\descarga.png"));

            //---- button1 ----
            button1.setText("Log In");

            GroupLayout panelLogContentPaneLayout = new GroupLayout(panelLogContentPane);
            panelLogContentPane.setLayout(panelLogContentPaneLayout);
            panelLogContentPaneLayout.setHorizontalGroup(
                panelLogContentPaneLayout.createParallelGroup()
                    .addGroup(panelLogContentPaneLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(panelLogContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(separator1)
                            .addGroup(panelLogContentPaneLayout.createSequentialGroup()
                                .addGroup(panelLogContentPaneLayout.createParallelGroup()
                                    .addComponent(label1)
                                    .addComponent(label2))
                                .addGap(26, 26, 26)
                                .addGroup(panelLogContentPaneLayout.createParallelGroup()
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLogContentPaneLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(label3)))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLogContentPaneLayout.createSequentialGroup()
                        .addContainerGap(146, Short.MAX_VALUE)
                        .addComponent(button1)
                        .addGap(135, 135, 135))
            );
            panelLogContentPaneLayout.setVerticalGroup(
                panelLogContentPaneLayout.createParallelGroup()
                    .addGroup(panelLogContentPaneLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLogContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1))
                        .addGap(18, 18, 18)
                        .addGroup(panelLogContentPaneLayout.createParallelGroup()
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(button1)
                        .addGap(25, 25, 25))
            );
            panelLog.pack();
            panelLog.setLocationRelativeTo(panelLog.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Francisco Estaun
    private JFrame panelLog;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JSeparator separator1;
    private JLabel label3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
