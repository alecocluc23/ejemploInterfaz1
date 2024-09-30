package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;

public class Ventana extends JFrame {
    private static final int ANCHO = 300;
    private static final int ALTO = 200;

    public Ventana() {
        setTitle("Ventana");
        setSize(ANCHO, ALTO);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        getContentPane().add(new Etiqueta());
        inicializarComponentes();
        setVisible(true);

    }
    private void inicializarComponentes() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.out.println("Ventana cerrando");
                System.exit(0);
            }

            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                System.out.println("Ventana abierta");
            }

            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                System.out.println("Ventana cerrada");
            }

            @Override
            public void windowIconified(java.awt.event.WindowEvent e) {
                System.out.println("Ventana minimizada");
            }

            @Override
            public void windowDeiconified(java.awt.event.WindowEvent e) {
                System.out.println("Ventana maximizada");
            }
        });
    }
}
