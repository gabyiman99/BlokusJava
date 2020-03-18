/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import model.ModelGame;

/**
 *
 * @author Vic
 */
public class ButtonChooser extends JButton {

    public ButtonChooser(int type) {
        this.setPreferredSize(new Dimension(100, 100));
        
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModelGame.type = type;
                
                //bikin popup window
                FramePopUp frame = new FramePopUp(type);
                frame.showWindow();
            }
        });
    }

}
