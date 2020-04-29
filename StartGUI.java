import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class StartGUI extends JFrame {

    public StartGUI(Trainner t) {
        super("Start Pokemon");
        setSize(900, 537);
        setResizable(false);
        setLocationRelativeTo(null);
        

        ImageIcon imgBG2 = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/imgBG2.png");
        JLabel Background = new JLabel(imgBG2);  
        JButton BtHome = new JButton("☞︎ ℍ𝕠𝕞𝕖");
        JButton BtWild = new JButton("☞︎ 𝕎𝕚𝕝𝕕");
        JButton BtSetName = new JButton("☞︎ 𝕊𝕖𝕥 ℕ𝕒𝕞𝕖");
        JButton BtCatch = new JButton("☞︎ ℂ𝕒𝕥𝕔𝕙");
        JButton BtBack = new JButton("☞︎ 𝔹𝕒𝕔𝕜"); 
        //Background.setLayout(null); 

        Background.setBounds(0, 0, 900, 537); 
        BtHome.setBounds(350, 110, 150, 50);
        BtWild.setBounds(350, 180, 150, 50);
        BtSetName.setBounds(350, 250, 150, 50);
        BtCatch.setBounds(350, 320, 150, 50);
        BtBack.setBounds(350, 390, 150, 50);

        Background.add(BtHome);
        Background.add(BtWild);
        Background.add(BtSetName);
        Background.add(BtCatch);
        Background.add(BtBack); 
        add(Background);

        BtHome.addActionListener((ActionEvent e) -> {
            setVisible(false);
            new HomeGUI(t);

        });
        BtWild.addActionListener((ActionEvent e) -> {
            setVisible(false);
            new WildGUI(t);

        });

        BtSetName.addActionListener((ActionEvent e) -> {
            setVisible(false);
            new SetNameGUI(t);

        });

        BtCatch.addActionListener((ActionEvent e) -> {
            setVisible(false);
            new CatchGUI(t);

        });

        BtBack.addActionListener((ActionEvent e) -> { 
            setVisible(false); 
            new PokemonGUI(); 

        });

        setVisible(true);
        pack();
        
    }

}

