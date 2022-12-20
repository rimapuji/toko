/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author ACER
 */
public class JDesktopPaneBackground extends JDesktopPane{
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics=(Graphics2D) g.create();
        Image img=new ImageIcon(getClass().getResource("img/bg.jpeg")).getImage();
        graphics.dispose() ;
    }
}
