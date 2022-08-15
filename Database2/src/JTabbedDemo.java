import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Berlin
 */
public class JTabbedDemo {
    String colom [] = {"CMS","Name","Last Name","CGPA"};
    String rows [][] = { {"023-21-0036","Shams ","Din","3.12"},{"193-21-0005","Ramim ","Ali","3.55"},{"023-21-0022","Ali ","Raza","3.12"},{"023-21-0002","Mohsin ","Ali","2.78"},{"023-21-0042","Aqib ","Ali","3"},{"023-21-0021","Usama ","Khan","2.76"},{"023-21-0090","Awais ","Ali","2.3"},{"023-20-0113","Dilbar ","Hussain","3"}};
    JTabbedDemo()
    {
        JFrame f  = new JFrame("Details");
        JTable table = new JTable(rows,colom);
        JScrollPane p = new JScrollPane(table);
        f.add(p);
        f.setSize(300,250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String arg[])
    {
        new JTabbedDemo();
      }
}
