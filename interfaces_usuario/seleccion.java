import javax.swing.*;
import java.awt.event.*;

public class seleccion extends JFrame implements ItemListener{

    private JComboBox combo1;
    
    public seleccion(){
        setLayout(null);
        combo1 = new JComboBox();
        combo1.setBounds(10,10,89,20);
        add(combo1);
        
        combo1.addItem("rojo");
        combo1.addItem("rosa");
        combo1.addItem("azul");
        combo1.addItem("verde");
        combo1.addItemListener(this);    
    }
    
    public void itemStateChanged(ItemEvent e){
        if (e.getSource() == combo1){
            String seleccion = combo1.getSelectedItem().toString();
            setTitle(seleccion);
        }
    }
    
    public static void main(String [] args){
        seleccion seleccion1 = new seleccion();
        seleccion1.setBounds(0,0,300,300);
        seleccion1.setVisible(true);
        seleccion1.setResizable(false);
        seleccion1.setLocationRelativeTo(null);
    }
}