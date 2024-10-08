import javax.swing.*;

public class ventana extends JFrame{
  private JLabel label1;
 
  public ventana(){
   setLayout(null);
   label1 = new JLabel("BlueJ");
   label1.setBounds(15,50,200,200);
   add(label1);
  }

  public static void main(String args[]){
   ventana ventana1 = new ventana();
   ventana1.setBounds(0,0,400,300);
   ventana1.setVisible(true);
   ventana1.setLocationRelativeTo(null);
  }
}