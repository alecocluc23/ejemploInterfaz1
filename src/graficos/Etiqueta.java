package graficos;

import javax.swing.*;
import java.awt.*;

public class Etiqueta extends JLabel {
    private static final int ANCHO = 400;
    private static final int ALTO = 30;
    private static final int CoordX = 0;
    private static final int CoordY = 0;

    public Etiqueta() {
        setText("Etiqueta");
        setFont(new Font("Arial", Font.BOLD, 20));
        setBounds(CoordX, CoordY, ANCHO, ALTO);
        setHorizontalAlignment(SwingConstants.CENTER);
        setVisible(true);
    }
}
