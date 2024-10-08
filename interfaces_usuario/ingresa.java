import javax.swing.*;
import java.awt.event.*;
import javax.swing.JTextField;

public class ingresa extends JFrame implements ActionListener{
 
 private JTextField textfield1;
 private JLabel label1;
 private JButton boton1;
 
 public ingresa(){
  
  setLayout(null);
  label1 = new JLabel("Usuario:");
  label1.setBounds(10,10,100,30);
  add(label1);
  
  textfield1 = new JTextField();
  textfield1.setBounds(120,17,150,20);
  add(textfield1);
  
  boton1 = new JButton("Aceptar");
  boton1.setBounds(10,80,100,30);
  add(boton1);
  boton1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
     if (e.getSource() == boton1){
         String texto = textfield1.getText();
         setTitle(texto);
     }
 }
 
 public static void main(String args[]){
   ingresa ingresa1 = new ingresa();
   ingresa1.setBounds(0,0,300,150);
   ingresa1.setVisible(true);
   ingresa1.setLocationRelativeTo(null);
   ingresa1.setResizable(false);
 }
}