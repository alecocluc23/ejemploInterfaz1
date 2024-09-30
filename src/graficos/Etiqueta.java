package graficos;

import javax.swing.*;
import java.awt.*;

public class Etiqueta extends JLabel {
    private static final int ANCHO = 100;
    private static final int ALTO = 30;

    public Etiqueta() {
        setText("Etiqueta");
        setFont(new Font("Arial", Font.BOLD, 20));
        setSize(ANCHO, ALTO);
    }
}

}
