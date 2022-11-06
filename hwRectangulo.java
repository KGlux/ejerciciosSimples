package ejerciciosUdemy;

import javax.swing.*;

public class hwRectangulo {

    public static void main(String[] args) {

        int altura;
        int ancho;
        float resultArea;
        float resultPerimetro;

        altura = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la altura"));
        ancho = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el ancho"));

        resultArea = altura * ancho;
        resultPerimetro = (altura+ancho) * 2;

        JOptionPane.showMessageDialog(null, "Area: " +resultArea+ " Perimetro: " +resultPerimetro);

    }
}
