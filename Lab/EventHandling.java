import java.awt.*;
import java.awt.event.*;
public class EventHandling {
    public static void main(String[] args) {
        Frame f = new Frame("Event Handling");
        Button b = new Button("Click me");
        b.setBounds(100, 100, 100, 50);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}  