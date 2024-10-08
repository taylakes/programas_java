import javax.swing.*;
import java.awt.event.*;

public class boton extends JFrame implements ActionListener{
 
 JButton boton1;
 
 public boton(){
  setLayout(null);
  boton1 = new JButton("Cerrar");
  boton1.setBounds(300,250,100,30);
  add(boton1);
  boton1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
     if (e.getSource() == boton1){System.exit(0);}
 }
 
 public static void main(String args[]){
   boton boton1 = new boton();
   boton1.setBounds(0,0,450,350);
   boton1.setVisible(true);
   boton1.setLocationRelativeTo(null);
   boton1.setResizable(false);
 }
}