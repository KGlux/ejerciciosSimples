package ejerciciosUdemy;

import javax.swing.*;

public class hwElMayorDeDosNumeros {

    public static void main(String[] args) {

        int num1;
        int num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer valor"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo valor"));

        if ( num1 > num2) {
            JOptionPane.showMessageDialog(null, "el primer valor es mayor: "+num1);
        } else {
            JOptionPane.showMessageDialog(null, "el segundo valor es mayor: "+num2);
        }

    }
}
