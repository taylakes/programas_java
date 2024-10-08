
import javax.swing.*;

public class Pantalla extends JFrame{
 
 public Pantalla(){
  setLayout(null); 
 }

 public static void main(String args[]){
   Pantalla pantalla1 = new Pantalla();
   pantalla1.setBounds(0,0,400,550);
   pantalla1.setVisible(true);
   pantalla1.setLocationRelativeTo(null);
   pantalla1.setResizable(false);
 }
}