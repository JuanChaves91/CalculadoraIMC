import javax.swing.*;
import java.awt.event.*;

public class CalculadoraIMC extends JFrame implements ActionListener{
  private JLabel labelPeso;
  private JLabel labelTalla;
  private JLabel resultado;
  private JTextField tfPeso;
  private JTextField tfTalla;
  private JButton calcular;

  public CalculadoraIMC(){
    setLayout(null);

    labelPeso = new JLabel("Ingresa tu peso (kg):");
    labelPeso.setBounds(10,10,150,30);
    add(labelPeso);

    labelTalla = new JLabel("Ingresa tu estatura (m):");
    labelTalla.setBounds(10,40,150,30);
    add(labelTalla);

    tfPeso = new JTextField();
    tfPeso.setBounds(160,10,50,30);
    add(tfPeso);

    tfTalla = new JTextField();
    tfTalla.setBounds(160,40,50,30);
    add(tfTalla);

    calcular = new JButton("Calcular");
    calcular.setBounds(10,80,100,30);
    add(calcular);
    calcular.addActionListener(this);

    resultado = new JLabel();
    resultado.setBounds(120,80,100,30);
    add(resultado);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == calcular){
      String tmpPeso = tfPeso.getText();
      float peso = Float.parseFloat(tmpPeso);

      String tmpTalla = tfTalla.getText();
      float talla = Float.parseFloat(tmpTalla);

      float calculo = peso / (talla * talla);

      String res = Float.toString(calculo);
      resultado.setText(res);
    }
  }

  public static void main(String args[]){
    CalculadoraIMC calc = new CalculadoraIMC();
    calc.setBounds(0,0,240,170);
    calc.setVisible(true);
    calc.setResizable(false);
    calc.setLocationRelativeTo(null);
    calc.setTitle("Calculadora IMC");
  }
}