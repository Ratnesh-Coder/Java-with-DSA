import java.awt.*;
public class Layout {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLayout(new FlowLayout());
        f.add(new Button("Button 1"));
        f.add(new Button("Button 2"));
        f.add(new Button("Button 3"));
        f.setSize(300, 200);
        f.setVisible(true);
    }
}