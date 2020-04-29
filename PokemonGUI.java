import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PokemonGUI extends JFrame { 

    public PokemonGUI(){
        
    }

    public PokemonGUI(Trainner t) {
        super("Pokemon Game"); 
        ImageIcon imgBG = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/imgBG.jpg");
        JLabel Background = new JLabel("", imgBG, JLabel.CENTER);
        JButton BtStart = new JButton("☞︎ 𝕊𝕥𝕒𝕣𝕥 𝔾𝕒𝕞𝕖");
        JButton BtExit = new JButton("☞︎ 𝔼𝕩𝕚𝕥"); 
        
        Background.setLayout(null);
        Background.setBounds(0, 0, 900, 537);
        BtStart.setBounds(140, 200, 150, 50);
        BtExit.setBounds(140, 280, 150, 50);

        Background.add(BtStart);
        Background.add(BtExit);
        add(Background);

        BtStart.addActionListener((ActionEvent e) -> {
            setVisible(false);
            new StartGUI(t);

        });

        BtExit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        setSize(900,537);
        setLocationRelativeTo(null);
        setResizable(false); 
        setVisible(true);
    }
    
}