import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiFrame extends JFrame implements ActionListener
{
    JLabel dl, ml, al;
    JTextField td, tm , ta, tr;
    JButton boton1, boton2;
    
    public MiFrame(){
        setLayout(null);
        dl = new JLabel("Dia:");
        ml = new JLabel("Mes:");
        al = new JLabel("Año:");
        td = new JTextField(2);
        tm = new JTextField(2);
        ta = new JTextField(4);
        tr = new JTextField(20);
        boton1 = new JButton("Mostrar Fecha");
        boton2 = new JButton("Incrementar Fecha");
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(dl);cp.add(td);
        cp.add(ml);cp.add(tm);
        cp.add(al);cp.add(ta);
        cp.add(boton1); cp.add(boton2);
        cp.add(tr);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        String d = td.getText();
        d = (d.length()== 1?"0"+d:d);
        String m = tm.getText();
        m = (m.length()== 1?"0"+m:m);
        String a = ta.getText();
        Fecha f = new Fecha(d+"/"+m+"/"+a);
        if (e.getSource() == boton1){tr.setText(f.toString());}
        else if (e.getSource() == boton2){tr.setText(f.incrementarDia());}
    }
    
    public static void main(String [] args){
        MiFrame  f = new MiFrame();
        f.setSize(400,200);
        f.setVisible(true);
        f.setLocationRelativeTo(null);  
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
