package ejerciciosUdemy;

import javax.swing.*;

public class sisCalificaciones {

    public static void main(String[] args) {

        /*El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
            El usuario proporcionará un valor entre 0 y 10.
            Si está entre 9 y 10: imprimir una A
            Si está entre 8 y menor a 9: imprimir una B
            Si está entre 7 y menor a 8: imprimir una C
            Si está entre 6 y menor a 7: imprimir una D
            Si está entre 0 y menor a 6: imprimir una F
            cualquier otro valor debe imprimir: Valor desconocido
            Por ejemplo:
            Proporciona un valor entre 0 y 10: A
        */

        /* +++++++++++ RESOLUCION DEL PROBLEMA +++++++++++ */
        int calificacion;

        calificacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la calificacion"));

        switch (calificacion) {

            case 10:
            case 9:
                JOptionPane.showMessageDialog(null, "El alumno obtiene una A");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "El alumno obtiene una B");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "El alumno obtiene una C");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "El alumno obtiene una D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                JOptionPane.showMessageDialog(null, "El alumno obtiene una F");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Calificacion fuera de rango");
        }


    }
}
