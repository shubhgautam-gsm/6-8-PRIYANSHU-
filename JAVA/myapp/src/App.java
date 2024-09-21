import java.awt.Graphics;
import javax.swing.JFrame;

public class App extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Call base class paint method
        g.drawString("Hello, World!", 20, 20);
    }

    public static void main(String[] args) {
        App app = new App();
        app.setTitle("Hello, World!");
        app.setSize(300, 200);
        app.setVisible(true);
    }
}