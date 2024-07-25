/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class MenuCarga {
    private byte mnuc;
    InfoMenu r = new InfoMenu();
    while(mnuc!=3){ 
         mnuc = Byte.parseByte(JOptionPane.showInputDialog(null,
                "***Menu SuperChino***\n\n"
                + "1.Agragar datos\n"
                + "2.Mostrar precios\n"
                + "3.Salir del sistema\n\n"
                + "Escriba un numero de los que se le presenta en pantalla:"));
        switch (mnuc) {
            case 1: {
                r.agregarCarga();
                break;
            }

            case 2: {
                r.mostrarInfoCarga();
                break;
            }
            case 3: {
                System.exit(0);
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "¡Opción incorrecta!");
            }
        }
    }
}

