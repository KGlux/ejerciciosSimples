package ejerciciosUdemy;

import javax.swing.*;

public class hwElMayorDeDosNumeros {

    public static void main(String[] args) {

        /*Solicitar al usuario dos valores:
        numero1 (int)
        numero2 (int)
        Se debe imprimir el mayor de los dos números (la salida debe ser identica a la que sigue):
        Proporciona el numero1:
        Proporciona el numero2:
        El numero mayor es:
        <numeroMayor>
        Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.

        Preguntas de esta tarea
        ¿Cuál es el código del requerimiento solicitado?
        */
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
