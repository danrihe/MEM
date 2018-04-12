
import java.awt.Color;
import java.awt.Frame;
import java.awt.FlowLayout;

public class MEMViewer {
    
    public static void main(String[] args)
    {
        Frame frame = new MainFrame();
        //frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        frame.setTitle("Membership Application");
        frame.setVisible(true);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 0,0));
        frame.setBackground(Color.white);
        frame.setResizable(false);
    }
    
}
