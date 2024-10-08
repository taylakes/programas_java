import javax.swing.*;
import javax.swing.event.*;

public class tildes extends JFrame implements ChangeListener{

  private JCheckBox check1, check2, check3;

  public tildes(){
    setLayout(null);
    check1 = new JCheckBox("Inglés");
    check1.setBounds(10,10,150,30);
    check1.addChangeListener(this);
    add(check1);

    check2 = new JCheckBox("Francés");
    check2.setBounds(10,50,150,30);
    check2.addChangeListener(this);
    add(check2);

    check3 = new JCheckBox("Alemán");
    check3.setBounds(10,90,150,30);
    check3.addChangeListener(this);
    add(check3);
  }


  public void stateChanged(ChangeEvent e){
    String cad="";

    if(check1.isSelected() == true){
	cad = cad + "Inglés-";
    }
    if(check2.isSelected() == true){
	cad = cad + "Francés-";
    }
    if(check3.isSelected() == true){
	cad = cad + "Alemán-";
    }
    setTitle(cad);
  }

  public static void main(String args[]){
   tildes tildes1 = new tildes();
   tildes1.setBounds(0,0,350,200);
   tildes1.setVisible(true);
   tildes1.setResizable(false);
   tildes1.setLocationRelativeTo(null);
  }
}