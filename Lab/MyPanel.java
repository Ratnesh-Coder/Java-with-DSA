import java.awt.*;
public class MyPanel {
    public static void main(String[] args) {
        Frame f = new Frame("My Frame");
        Panel p = new Panel();
        p.add(new Button("Click Me"));
        f.add(p);
        f.setSize(400, 300);
        f.setVisible(true);
    }
}