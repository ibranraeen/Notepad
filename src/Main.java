import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.plaf.metal.*;

class Main extends JFrame implements ActionListener {
    // ? Creating Required Objects.
    JFrame f;
    JTextArea t;
    JMenuBar menu;
    JMenu file, edit;
    JMenuItem f1, f2, f3, f4, e1, e2, e3, close;

    Main() {
        f = new JFrame("Ibran Notepaper");
        // ? Setting Overall Theme Of Application.
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        } catch (Exception e) {
            System.out.println("Error setting look and feel: " + e);
        }
        // ? Setting Text Component.
        t = new JTextArea();
        // ? Setting Menu Bar.
        menu = new JMenuBar();
        // ? Setting File Menu.
        file = new JMenu("File");
        // ? File Menu Items.
        f1 = new JMenuItem("New");
        f2 = new JMenuItem("Open");
        f3 = new JMenuItem("Save");
        f4 = new JMenuItem("Print");
        // ? Action On Clicking File Menu Items.
        f1.addActionListener(this);
        f2.addActionListener(this);
        f3.addActionListener(this);
        f4.addActionListener(this);
        // ? Adding File Menu Items To The File Menu.
        file.add(f1);
        file.add(f2);
        file.add(f3);
        file.add(f4);
        // ? Setting Edit Menu.
        edit = new JMenu("Edit");
        // ? Edit Menu Items.
        e1 = new JMenuItem("Cut");
        e2 = new JMenuItem("Copy");
        e3 = new JMenuItem("Paste");
        // ? Action On Clicking Edit Menu Items.
        e1.addActionListener(this);
        e2.addActionListener(this);
        e3.addActionListener(this);
        // ? Adding Edit Menu Items To The Edit Menu.
        edit.add(e1);
        edit.add(e2);
        edit.add(e3);
        // ? Setting Close Item
        close = new JMenuItem("Close");
        // ? Action On Clicking Close Menu Item.
        close.addActionListener(this);
        // ? Adding File And Edit Menu To Menu Bar Along With Close Item.
        menu.add(file);
        menu.add(edit);
        menu.add(close);
        // ? Adding MenuBar, TextArea To JFrame And Setting The Size Of JFrame Window.
        f.setJMenuBar(menu);
        f.add(t);
        f.setSize(500, 500);
        f.show(); // * Testing
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("New")) {

        } else if (s.equals("Open")) {

        } else if (s.equals("Save")) {

        } else if (s.equals("Print")) {

        } else if (s.equals("Cut")) {

        } else if (s.equals("Copy")) {

        } else if (s.equals("Paste")) {

        } else if (s.equals("Close")) {

        }
    }

    public static void main(String[] args) throws Exception {
        Main e = new Main();
    }
}