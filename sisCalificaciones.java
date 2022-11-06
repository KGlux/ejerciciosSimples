package ejerciciosUdemy;

import javax.swing.*;

public class sisCalificaciones {

    public static void main(String[] args) {

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
