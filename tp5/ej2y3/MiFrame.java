import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.ArrayList;

public class MiFrame extends JFrame implements ActionListener
{
    JLabel noml,ap,salario,ventas,porc,canp,valp,phora,horas,hextra;
    JTextField tnom,tap,tsal,tpor,tven,tcanp,tvalp,tpho,thor,textr,tresul;
    JButton bJefe, bComision, bSubordinado, bHora;
    Empleado empleado;
    Empresa lista = new Empresa();

    public MiFrame(){
        setLayout(null);
        noml = new JLabel("Nombre: ");noml.setBounds(30,20,100,30);add(noml);
        ap = new JLabel("Apellido: ");ap.setBounds(30,60,100,30);add(ap);
        salario = new JLabel("Salario: ");salario.setBounds(30,100,100,30);add(salario);
        ventas = new JLabel("Ventas: ");ventas.setBounds(30,140,100,30);add(ventas);
        porc = new JLabel("Porcentaje: ");porc.setBounds(30,180,100,30);add(porc);
        canp = new JLabel("Cantidad Piezas: ");canp.setBounds(30,220,100,30);add(canp);
        valp = new JLabel("Valor de Pieza: ");valp.setBounds(30,260,100,30);add(valp);
        phora = new JLabel("Precio Hora: ");phora.setBounds(30,300,100,30);add(phora);
        horas = new JLabel("Horas: ");horas.setBounds(30,340,100,30);add(horas);
        hextra = new JLabel("Horas Extra: ");hextra.setBounds(30,380,100,30);add(hextra);
        tnom = new JTextField();tnom.setBounds(90,25,150,20);add(tnom);
        tap = new JTextField();tap.setBounds(90,65,150,20);add(tap);
        tsal = new JTextField();tsal.setBounds(90,105,150,20);add(tsal);
        tven = new JTextField();tven.setBounds(90,145,150,20);add(tven);
        tpor = new JTextField();tpor.setBounds(100,185,150,20);add(tpor);
        tcanp = new JTextField();tcanp.setBounds(130,225,150,20);add(tcanp);
        tvalp = new JTextField();tvalp.setBounds(130,265,150,20);add(tvalp);
        tpho = new JTextField();tpho.setBounds(130,305,150,20);add(tpho);
        thor = new JTextField();thor.setBounds(130,345,150,20);add(thor);
        textr =  new JTextField();textr.setBounds(130,385,150,20);add(textr);
        bJefe = new JButton("Jefe");bJefe.setBounds(400,60,100,30);add(bJefe);bJefe.addActionListener(this);
        bComision = new JButton("Comision");bComision.setBounds(400,100,100,30);add(bComision);bComision.addActionListener(this);
        bSubordinado = new JButton("Subordinado");bSubordinado.setBounds(400,140,130,30);add(bSubordinado);bSubordinado.addActionListener(this);
        bHora = new JButton("Por Hora");bHora.setBounds(400,180,100,30);add(bHora);bHora.addActionListener(this);
        tresul = new JTextField();tresul.setBounds(20,450,400,40);add(tresul);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String nombre = tnom.getText();  
        String apellido = tap.getText();
        if (e.getSource() == bJefe){
            String salario = tsal.getText();
            empleado = new Jefe(nombre, apellido, Double.parseDouble(salario));}
        else if (e.getSource() == bComision){
            String salario = tsal.getText();
            String ventas = tven.getText();
            empleado = new Comision(nombre, apellido, Double.parseDouble(salario), Double.parseDouble(ventas));}
        else if (e.getSource() == bSubordinado){
            String salario = tsal.getText();
            String ventas = tven.getText();
            String cantPiezas = tcanp.getText();
            String valorPiezas = tvalp.getText();
            empleado = new Subordinado(nombre, apellido, Integer.parseInt(cantPiezas), Double.parseDouble(valorPiezas));}
        else if(e.getSource() == bHora){
            String horas = thor.getText();
            String horasExtra = textr.getText();
            String precioHora = tpho.getText();
            empleado = new Empleadoxhr(nombre, apellido, Integer.parseInt(horas), Integer.parseInt(horasExtra),Double.parseDouble(precioHora));}
        tresul.setText("Salario: "+empleado.getSalario());
    }
    
    public static void main(String [] args){
        MiFrame f = new MiFrame();
        f.setBounds(0,0,600,600);
        f.setVisible(true);
        f.setLocationRelativeTo(null);  
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}