import javax.swing.JFrame;
import java.time.LocalTime;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.time.format.DateTimeFormatter;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TimeTest extends JFrame implements ActionListener
{    
 
 private JButton boton1;
 private Tiempo t;
 private JTextField textfield1, textfield2, textfield3;
 private JLabel hor, min,seg, horaac, horam;
 private JButton boton2;
 
 public void init()
 {
    t = new Tiempo();   
 }
 
  public TimeTest(){
  setLayout(null);
  hor = new JLabel("Hora:");
  hor.setBounds(50,50,100,30);
  add(hor);

  min = new JLabel("Minuto:");
  min.setBounds(50,75,100,30);
  add(min);

  seg = new JLabel("Segundos:");
  seg.setBounds(50,100,100,30);
  add(seg);

  textfield1 = new JTextField();
  textfield1.setBounds(120,55,150,20);
  add(textfield1);

  textfield2 = new JTextField();  
  textfield2.setBounds(120,80,150,20);
  add(textfield2);
  
  textfield3 = new JTextField();  
  textfield3.setBounds(120,105,150,20);
  add(textfield3);

  boton2 = new JButton("Resultado");
  boton2.setBounds(50,160,100,30);
  add(boton2);
  boton2.addActionListener(this);
  
  boton1 = new JButton("Cerrar");
  boton1.setBounds(250,200,100,30);
  add(boton1);
  boton1.addActionListener(this);
 }
 
 public void actionPerformed(ActionEvent e){
     if (e.getSource() == boton1){System.exit(0);}
     else if (e.getSource() == boton2){
         try{
             int h=0, m=0, s=0;
         
             h = Integer.parseInt(textfield1.getText());
             m = Integer.parseInt(textfield2.getText());
             s = Integer.parseInt(textfield3.getText());
             
            if (h < 0 || h >= 24 || m < 0 || m >= 60 || s < 0 || s >= 60) {
                JOptionPane.showMessageDialog(null, "Los valores deben estar en el rango: 0 <= hora < 24, 0 <= minuto < 60, 0 <= segundo < 60.");}
            else {
                 t.setTime(h, m, s);
                 String militaryTime = t.toMilitaryString();
                 String standardTime = t.toString();
                 JOptionPane.showMessageDialog(null, "Hora estándar: " + standardTime + "\nHora militar: " + militaryTime);
                }
            } catch (NumberFormatException ex){JOptionPane.showMessageDialog(null,"Ingrese numeros validos.");}
        }
 }
 
 @Override
 public void paint (Graphics g)//muestra hora por defecto
 {
    super.paint(g);
    LocalTime now = LocalTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
    String formattedTime = now.format(formatter);
    g.drawString("La hora actual es: " + formattedTime,50,50);
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HHmm");
    String formattedTime2 = now.format(formatter2);
    g.drawString("La hora militar actual es: " + formattedTime2,50,70);
 }
 
   public void formato(Graphics g)//personaliza hora
 {
    super.paint(g);
    g.drawString("La hora actual es: " +t.toString(),80,90);
    g.drawString("La hora militar actual es: " +t.toMilitaryString(),90,70);
 } 

 public static void main(String args[]){
   TimeTest timetest1 = new TimeTest();
   timetest1.setBounds(0,0,400,300);
   timetest1.setVisible(true);
   timetest1.setLocationRelativeTo(null);
   timetest1.setResizable(false);
   timetest1.init();
 }
}
