package myviews;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;

public class HolaJframe extends JFrame {

    JDesktopPane myPane = new JDesktopPane();
    JLabel myLabel = new JLabel("Hola mundillo!.");

    HolaJframe() {

        this.setTitle("Hola mundo desde un JFrame");
        this.setSize(200, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(myPane);
        myPane.setLayout(null);
        myPane.add(myLabel);
        myLabel.setBounds(60, 60, 120, 25);

    }

    public static void main(String[] args) {
    
        HolaJframe myFrame = new HolaJframe();
        myFrame.setVisible(true);

    }

}