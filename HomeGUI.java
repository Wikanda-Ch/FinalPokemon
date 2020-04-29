import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 

public class HomeGUI extends JFrame { 

    private JTextArea status[] = {new JTextArea(),new JTextArea(),new JTextArea(),new JTextArea()};
    private int y=10;

    public HomeGUI(Trainner t) {
        super("Home"); 
        ImageIcon imgHome = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/imgHome.jpg");
        JLabel Background = new JLabel("", imgHome, JLabel.CENTER);
        ImageIcon Back = new ImageIcon("C:/Users/Ribbon/Downloads/Pokemon/img/Back.png");
        JButton BtBack = new JButton(Back); //"☞︎ 𝔹𝕒𝕔𝕜"

        int i=0;
        for(Pokemon p: t.getArrayP()){
            try{
                if (i == 0){
                    status[i].setText(" Your Pokemon name: "+p.getName1()+"\n"+
                                        "   HP : "+p.getHP1()+"\n"+
                                        "   MP : "+p.getMP1()+"\n"+
                                        "   Lv. "+p.getlv1());
                status[i].setBounds(150, y, 300, 100);
                SwingUtilities.updateComponentTreeUI(status[i]);
                //i++;
                //y+=150;
                
                }

                if (i == 1){
                    status[i].setText(" Your Pokemon name: "+p.getName2()+"\n"+
                                        "   HP : "+p.getHP2()+"\n"+
                                        "   MP : "+p.getMP2()+"\n"+
                                        "   Lv. "+p.getlv2());
                status[i].setBounds(150, y, 300, 100);
                SwingUtilities.updateComponentTreeUI(status[i]);
                //i++;
                //y+=150;
               
                }

                if(i == 2){
                    status[i].setText(" Your Pokemon name: "+p.getName3()+"\n"+
                                        "   HP : "+p.getHP3()+"\n"+
                                        "   MP : "+p.getMP3()+"\n"+
                                        "   Lv. "+p.getlv3());
                status[i].setBounds(150, y, 300, 100);
                SwingUtilities.updateComponentTreeUI(status[i]);
                //i++;
                //y+=150;
                
                }
                i++; 
                y+=150;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("---");
                /*JOptionPane text = new JOptionPane();
                JOptionPane.showMessageDialog (text, "error" );*/
            }
        
        }
        
        Background.add(status[0]);
        Background.add(status[1]);
        Background.add(status[2]);
        //Background.add(status[3]);
        Background.setLayout(null);
        Background.setBounds(0, 0, 900, 537);
        BtBack.setBounds(720, 440, 150, 50);

        BtBack.setBackground(new Color(255,241,221));
        
        Background.add(BtBack);
        add(Background);

        BtBack.addActionListener((ActionEvent e) -> { 
            setVisible(false); 
            new StartGUI(t); 
        });

        setSize(900,537);
        setLocationRelativeTo(null);
        setResizable(false); 
        setVisible(true);
        pack();
    }
}