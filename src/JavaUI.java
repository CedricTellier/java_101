import javax.swing.*;
import java.awt.*;

public class JavaUI extends JFrame {
    private JButton button1;
    private JPanel panel1;


    public JavaUI(){
        setTitle("Hello World GUI");
        setSize(450,450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /*public static void main(String[] args) {
        JavaUI myUI = new JavaUI();
    }*/
}
