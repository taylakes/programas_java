import javax.swing.*;

public class texto extends JFrame{
 
 private JLabel label1;
 private JLabel label2;
 
 public texto (){
  setLayout(null);
  label1 = new JLabel("Interfaz grafica.");
  label1.setBounds(10,20,300,30);
  add(label1);
  label2 = new JLabel("Version 1.0.");
  label2.setBounds(10,100,100,30);
  add(label2);
 }

 public static void main(String args[]){
   texto texto1 = new texto();
   texto1.setBounds(0,0,400,550);
   texto1.setVisible(true);
   texto1.setLocationRelativeTo(null);
   texto1.setResizable(false);
 }
}