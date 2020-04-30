import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CatchGUI extends JFrame {


    public CatchGUI(Trainner t) {
        super("Catch Pokemon");
        
        
        // input Image
        ImageIcon imgBG4 = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/imgBG4.png");
        JLabel Background = new JLabel("", imgBG4, JLabel.CENTER);
        ImageIcon imgBall1 = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/imgBall1.png");
        JButton BtCatchI = new JButton(imgBall1);
        ImageIcon imgBall2 = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/imgBall2.png");
        JButton BtCatchII = new JButton(imgBall2);
        ImageIcon imgBall3 = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/imgBall3.png");
        JButton BtCatchIII = new JButton(imgBall3);
        ImageIcon Back = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/Back.png");
        JButton BtBack = new JButton(Back); //"☞︎ 𝔹𝕒𝕔𝕜"
       
        Background.setLayout(null); 

        BtCatchI.setBounds(200, 200, 70, 70);
        BtCatchII.setBounds(380, 200, 70, 70);
        BtCatchIII.setBounds(560, 200, 70, 70);
        BtBack.setBounds(700, 390, 150, 50);

        //BtCatchI.setBackground(new Color(255,241,221));
        //BtCatchII.setBackground(new Color(255,241,221));
        //BtCatchIII.setBackground(new Color(255,241,221));
        BtBack.setBackground(new Color(255,241,221));

        Background.add(BtCatchI);
        Background.add(BtCatchII);
        Background.add(BtCatchIII);
        Background.add(BtBack);
        add(Background);

        BtCatchI.addActionListener( new ActionListener() {

            public void actionPerformed( ActionEvent actionEvent ) {

            
                Pokemon p = new PkI();
                t.setPokemon(p);
                JOptionPane text = new JOptionPane();
                BtCatchI.setEnabled(false);
                JOptionPane.showMessageDialog (text, "You get Pokemon!" ,"Pokemon One",JOptionPane.INFORMATION_MESSAGE);
            
            }
        });


        BtCatchII.addActionListener( new ActionListener() {

            public void actionPerformed( ActionEvent actionEvent ) {
                
               
                Pokemon p = new PkII();
                t.setPokemon(p);
                JOptionPane text = new JOptionPane();
                BtCatchII.setEnabled(false);
                JOptionPane.showMessageDialog (text, "You get Pokemon!" ,"Pokemon Two",JOptionPane.INFORMATION_MESSAGE);
                
            }
        });


        BtCatchIII.addActionListener( new ActionListener() {

            public void actionPerformed( ActionEvent actionEvent ) {
                
                Pokemon p = new PkIII();
                t.setPokemon(p);
                JOptionPane text = new JOptionPane();
                BtCatchIII.setEnabled(false);
                JOptionPane.showMessageDialog (text, "You get Pokemon!","Pokemon Three",JOptionPane.INFORMATION_MESSAGE);

            }
        });


        BtBack.addActionListener((ActionEvent e) -> { 
            setVisible(false); 
            new StartGUI(t); 
        });

        setSize(900, 537);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

    }


}