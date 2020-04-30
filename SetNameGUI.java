
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SetNameGUI extends JFrame {

    //private JButton bt[] = {new JButton(), new JButton(),new JButton(),new JButton()};

    public SetNameGUI(Trainner t) {
        super("Set Name"); 
        ImageIcon imgBG5 = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/imgBG5.jpg");
        JLabel Background = new JLabel("", imgBG5, JLabel.CENTER);
        ImageIcon Back = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/Back.png");
        JButton BtBack = new JButton(Back); //"☞︎ 𝔹𝕒𝕔𝕜"
        ImageIcon Pk1 = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/Pk1.png");
        ImageIcon Pk2 = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/Pk2.png");
        ImageIcon Pk3 = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/Pk3.png");

        JButton bt[] = {new JButton(Pk1), new JButton(Pk2),new JButton(Pk3)};

        Background.setLayout(null);
        Background.setBounds(0, 0, 900, 537);
        BtBack.setBounds(710, 430, 150, 50);

        bt[0].setBackground(new Color(255,241,221));
        bt[1].setBackground(new Color(255,241,221));
        bt[2].setBackground(new Color(255,241,221));
        BtBack.setBackground(new Color(255,241,221));

        Background.add(BtBack);
        Background.add(bt[0]);
        Background.add(bt[1]);
        Background.add(bt[2]);
        //Background.add(bt[3]);
        add(Background);

        int i=0;
        int y=10;
        for(Pokemon p : t.getArrayP()){
            try{
                y+=50;
                if (i == 0){
                    bt[i].setText(p.getName1());
                    bt[i].setBounds(100, y, 200, 70);
                }
                if (i == 1){
                    bt[i].setText(p.getName2());
                    bt[i].setBounds(100, y, 200, 70);
                }
                if (i == 2){
                    bt[i].setText(p.getName3());
                    bt[i].setBounds(100, y, 200, 70);
                }




            }catch(ArrayIndexOutOfBoundsException e){
                System.out.print("---");
            }
            i++;
            y+=100;
        }


        BtBack.addActionListener((ActionEvent e) -> { 
            setVisible(false); 
            new StartGUI(t); 
        });
        try{
            bt[0].addActionListener((ActionEvent e) -> {
                JOptionPane text = new JOptionPane();
                t.getPokemon(0).setName1(JOptionPane.showInputDialog( text, "Enter your pokemon name." )); 
                bt[0].setText(t.getPokemon(0).getName1());
                SwingUtilities.updateComponentTreeUI(bt[0]);
            });
            bt[1].addActionListener((ActionEvent e) -> {
                JOptionPane text = new JOptionPane();
                t.getPokemon(1).setName2(JOptionPane.showInputDialog( text, "Enter your pokemon name." )); 
                bt[1].setText(t.getPokemon(1).getName2());
                SwingUtilities.updateComponentTreeUI(bt[1]);
            });
            bt[2].addActionListener((ActionEvent e) -> {
                JOptionPane text = new JOptionPane();
                t.getPokemon(2).setName3(JOptionPane.showInputDialog( text, "Enter your pokemon name." )); 
                bt[2].setText(t.getPokemon(2).getName3());
                SwingUtilities.updateComponentTreeUI(bt[2]);
            });
            /*bt[3].addActionListener((ActionEvent e) -> {
                JOptionPane text = new JOptionPane();
                t.getPokemon(3).setName(JOptionPane.showInputDialog( text, "Enter your pokemon name." )); 
                bt[3].setText(t.getPokemon(3).getName());
                SwingUtilities.updateComponentTreeUI(bt[3]);
            });
            bt[4].addActionListener((ActionEvent e) -> {
                JOptionPane text = new JOptionPane();
                t.getPokemon(4).setName(JOptionPane.showInputDialog( text, "Enter your pokemon name." )); 
                bt[3].setText(t.getPokemon(4).getName());
                SwingUtilities.updateComponentTreeUI(bt[4]);
            });*/
        }catch(IllegalArgumentException e){
            JOptionPane text = new JOptionPane();
            JOptionPane.showMessageDialog( text, "Your Pokemon name is null." );
        }


        setSize(900,537);
        setLocationRelativeTo(null);
        setResizable(false); 
        setVisible(true);
        pack();
    }
} 