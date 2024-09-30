package graficos;

import javax.swing.*;
import java.awt.*;

public class Boton extends JButton {
    private static final int ANCHO = 150;
    private static final int ALTO = 30;
    private static final int CoordX = 70;
    private static final int CoordY = 85;

    public Boton () {
        setText("Boton");
        setFont(new Font("Sans-Serif", Font.BOLD, 16));
        setBounds(CoordX, CoordY, ANCHO, ALTO);
        setHorizontalAlignment(SwingConstants.CENTER);
        setVisible(true);
}

}

