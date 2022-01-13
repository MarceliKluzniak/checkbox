package pl.mkluzniak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;//add to be recognize by ActionPerformed
    JCheckBox checkBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton();
        button.setText("submit");
        button.addActionListener(this);//will do action when clicked

        JCheckBox checkBox = new JCheckBox();//creating new checkbox
        checkBox.setText("I'm not a robot");//add text to frame
        checkBox.setFocusPainted(false);//remove around text dots
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));//add new font

        this.add(checkBox);//add checkbox to existing frame
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());//print what ischecked in frame


        }

    }
}
