import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WildGUI extends JFrame{

    private JButton berry[] = {new JButton(),new JButton(),new JButton(),new JButton(),new JButton()};
    protected int addBerry = 0;

    public WildGUI(Trainner t){
        super("Wild"); 
        setSize(900,537);
        setLocationRelativeTo(null);
        setResizable(false); 

        ImageIcon imgBG3 = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/imgBG3.png");
        JLabel Background = new JLabel(imgBG3);
        ImageIcon bryImg = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/berryImg.png");
        
        ImageIcon Back = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/Back.png");
        JButton BtBack = new JButton(Back); //"☞︎ 𝔹𝕒𝕔𝕜"
        BtBack.setBounds(720, 430, 150, 50);
        ImageIcon imgBry = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/imgBerry.png");
        JButton f = new JButton(imgBry);//"𝔽𝕖𝕖𝕕"
        f.setBounds(535, 430, 150, 50);
        ImageIcon imgWater = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/imgWater.png");
        JButton w = new JButton(imgWater);//"𝕎𝕒𝕥𝕖𝕣"
        w.setBounds(335, 430, 150, 50);

        BtBack.setBackground(new Color(255,241,221));
        f.setBackground(new Color(255,241,221));
        w.setBackground(new Color(255,241,221));
        
        for(int i=0;i<5;i++){
            try{
                berry[i].setIcon(bryImg);
                berry[i].setBounds(rdBerry(), rdBerry(), 50, 50);
                //Background.add(berry[i]);
                System.out.println(rdBerry());
                SwingUtilities.updateComponentTreeUI(berry[i]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.print("");
            }
        }

        berry[0].addActionListener((ActionEvent e) -> {
            JOptionPane text = new JOptionPane();
            JOptionPane.showMessageDialog (text, "got 1 berry." );
            Background.remove(berry[0]);
            addBerry++;
            t.setBerry(addBerry);
            SwingUtilities.updateComponentTreeUI(Background);
        });
        berry[1].addActionListener((ActionEvent e) -> {
            JOptionPane text = new JOptionPane();
            JOptionPane.showMessageDialog (text, "got 1 berry." );
            Background.remove(berry[1]);
            addBerry++;
            t.setBerry(addBerry);
            SwingUtilities.updateComponentTreeUI(Background);
        });
        berry[2].addActionListener((ActionEvent e) -> {
            JOptionPane text = new JOptionPane();
            JOptionPane.showMessageDialog (text, "got 1 berry." );
            Background.remove(berry[2]);
            addBerry++;
            t.setBerry(addBerry);
            SwingUtilities.updateComponentTreeUI(Background);
        });
        berry[3].addActionListener((ActionEvent e) -> {
            JOptionPane text = new JOptionPane();
            JOptionPane.showMessageDialog (text, "got 1 berry." );
            Background.remove(berry[3]);
            addBerry++;
            t.setBerry(addBerry);
            SwingUtilities.updateComponentTreeUI(Background);
        });
        berry[4].addActionListener((ActionEvent e) -> {
            JOptionPane text = new JOptionPane();
            JOptionPane.showMessageDialog (text, "got 1 berry." );
            Background.remove(berry[4]);
            //berry[4].enable(true);
            addBerry++;
            t.setBerry(addBerry);
            SwingUtilities.updateComponentTreeUI(Background);
        });

        w.addActionListener((ActionEvent e) -> { 
            for(int i=0;i<5;i++){
                berry[i].setBounds(rdBerry(), rdBerry(), 50, 50);
                Background.add(berry[i]);
                SwingUtilities.updateComponentTreeUI(Background);
            }
        });

        BtBack.addActionListener((ActionEvent e) -> { 
            setVisible(false); 
            new StartGUI(t); 
        });
        f.addActionListener((ActionEvent e) -> {
            JOptionPane text = new JOptionPane();
            int i = 0;
            if(t.getBerry() > 0){
                try{
                          
                    String name = JOptionPane.showInputDialog( text, "Enter name pokemon to feed." );
                    if(t.getPokemon(0).getName1().equals(name)){
                        t.getPokemon(0).lvUp1();
                        JOptionPane.showMessageDialog(text, "your pokemon lv up." );
                    }
                    else if(t.getPokemon(1).getName2().equals(name)){
                        t.getPokemon(1).lvUp2();
                        JOptionPane.showMessageDialog(text, "your pokemon lv up." );
                    }
                    else if(t.getPokemon(2).getName3().equals(name)){
                        t.getPokemon(2).lvUp3();
                        JOptionPane.showMessageDialog(text, "your pokemon lv up." );
                    }
                    
                    /*else if(t.getPokemon(3).getName1().equals(name1)){
                        t.getPokemon(3).lvUp1();
                       JOptionPane.showMessageDialog(text, "your pokemon lv up." );
                    }*/
                    else{
                        JOptionPane.showMessageDialog(text, "You don't have this pokemon name." );
                    }
                    addBerry--;
                    t.setBerry(addBerry);
                    System.out.println("Berry total: " + t.getBerry());
                }/*catch(ArrayIndexOutOfBoundsException ex){
                    System.out.println("---");*/
                catch(IndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(text, "You don't have this pokemon name." );
            
                }
            }else{
                JOptionPane.showMessageDialog(text, "You don't have enough beerry." );
            }
        });

        Background.add(berry[0]);
        Background.add(berry[1]);
        Background.add(berry[2]);
        Background.add(berry[3]);
        Background.add(berry[4]);

        Background.add(w);
        Background.add(f);
        Background.add(BtBack);
        Background.setBounds(0, 0, 900, 537);
        add(Background);
        setVisible(true);
        pack();

    }
    private int rdBerry(){
        
        return (int)(Math.random()*500);
    }

}