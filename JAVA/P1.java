import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class VerticalCirclesApplet extends Applet {
    public void paint(Graphics g) {
        int radius = 50;
        int diameter = 2 * radius;
        int spacing = 20;
        g.setColor(Color.RED);

        for (int i = 0; i < 10; i++) {
            int x = (getWidth() - diameter) / 2;
            int y = i * (diameter + spacing);
            g.fillOval(x, y, diameter, diameter);
        }
    }
}
