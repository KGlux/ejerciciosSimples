package ejerciciosUdemy;

import javax.swing.*;

public class hwRectangulo {

    public static void main(String[] args) {

        /*En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo, para ello deberemos
        crear las siguientes variables:
        alto (int)
        ancho (int)
        El usuario debe proporcionar los valores de largo y ancho, y después se debe imprimir el resultado en el siguiente
        formato(no usar acentos y respetar los espacios, mayúsculas, minúsculas y saltos de línea):
        #Proporciona el alto:
        #Proporciona el ancho:
        Area: <area>
        Perimetro: <perimetro>
        #Las fórmulas para calcular el área y el perímetro de un Rectángulo son:
        #Área: alto * ancho
        #Perímetro: (alto + ancho) * 2
        * */

        /* +++++++++++ RESOLUCION DEL PROBLEMA +++++++++++ */
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
