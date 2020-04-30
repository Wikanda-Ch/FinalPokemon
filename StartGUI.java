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
        ImageIcon Home = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/Home.png");
        JButton BtHome = new JButton(Home);//"☞︎ ℍ𝕠𝕞𝕖"
        ImageIcon Wild = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/Wild.png");
        JButton BtWild = new JButton(Wild);//"☞︎ 𝕎𝕚𝕝𝕕"
        ImageIcon SetName = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/SetName.png");
        JButton BtSetName = new JButton(SetName);//"☞︎ 𝕊𝕖𝕥 ℕ𝕒𝕞𝕖"
        ImageIcon Catch = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/Catch.png");
        JButton BtCatch = new JButton(Catch);//"☞︎ ℂ𝕒𝕥𝕔𝕙"
        ImageIcon Back = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/Back.png");
        JButton BtBack = new JButton(Back); //"☞︎ 𝔹𝕒𝕔𝕜"
        //Background.setLayout(null); 

        Background.setBounds(0, 0, 900, 537); 
        BtHome.setBounds(350, 110, 150, 50);
        BtWild.setBounds(350, 180, 150, 50);
        BtSetName.setBounds(350, 250, 150, 50);
        BtCatch.setBounds(350, 320, 150, 50);
        BtBack.setBounds(350, 390, 150, 50);

        BtHome.setBackground(new Color(255,241,221));
        BtWild.setBackground(new Color(255,241,221));
        BtSetName.setBackground(new Color(255,241,221));
        BtCatch.setBackground(new Color(255,241,221));
        BtBack.setBackground(new Color(255,241,221));

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
            new PokemonGUI(t); 

        });

        setVisible(true);
        pack();
        
    }

}
