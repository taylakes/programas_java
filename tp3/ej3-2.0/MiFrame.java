import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class MiFrame extends JFrame implements ActionListener
{
    JLabel noml, apl, conl, nacl;
    JTextField tnom, tap, tcon, icon, tnac, tresul;
    JButton boton1,boton2, boton3;
    ArrayList<Empleado> listaDeEmpleados;

    public MiFrame(){
        setLayout(null);
        listaDeEmpleados = new ArrayList();
        noml = new JLabel("Nombre: ");noml.setBounds(30,20,100,30);add(noml);
        apl = new JLabel("Apellido: ");apl.setBounds(30,60,100,30);add(apl);
        conl = new JLabel("Fecha de Contratación: ");conl.setBounds(30,100,200,30);add(conl);
        nacl = new JLabel("Fecha de Nacimiento: ");nacl.setBounds(30,140,200,30);add(nacl);
        tnom = new JTextField();tnom.setBounds(90,25,150,20);add(tnom);
        tap = new JTextField();tap.setBounds(90,65,150,20);add(tap);
        tcon = new JTextField();tcon.setBounds(165,105,100,20);add(tcon);
        tnac = new JTextField();tnac.setBounds(155,145,110,20);add(tnac);
        boton1 = new JButton("Agregar");boton1.setBounds(200,170,100,30);add(boton1);boton1.addActionListener(this);
        boton2 = new JButton ("Mostrar Contra");boton2.setBounds(20,230,125,25);add(boton2);boton2.addActionListener(this);
        boton3 = new JButton("Mostrar Nacimiento");boton3.setBounds(150,230,150,25);add(boton3);boton3.addActionListener(this);
        tresul = new JTextField();tresul.setBounds(20,280,280,20);add(tresul);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()== boton1){
            String nombre = tnom.getText();
            String apellido = tap.getText();
            String contr = tcon.getText();
            String naci = tnac.getText();
            Empleado nuevoem = new Empleado(nombre,apellido,contr,naci);
            listaDeEmpleados.add(nuevoem);
        }
        else if (e.getSource() == boton2){
            String f = tcon.getText();
            Fecha contra = new Fecha(f);
            tresul.setText(contra.toString());
        } else if (e.getSource() == boton3){
            String f= tnac.getText();
            Fecha nace = new Fecha(f);
            tresul.setText(nace.toString());
        }
    }
    
    public static void main(String [] args){
        MiFrame f = new MiFrame();
        f.setBounds(0,0,330,350);
        f.setVisible(true);
        f.setLocationRelativeTo(null);  
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
