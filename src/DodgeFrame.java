import java.awt.*;
import javax.swing.*;
public class DodgeFrame extends JFrame
{
    private int panelWidth=700;
    private int panelHeight=700;
    public DodgeFrame(String title)
    {
        super(title);
        setDefaultCloseOperation(DodgeFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        DodgePanel o=new DodgePanel(panelWidth, panelHeight);
        Insets insets=getInsets();
        int width=o.getWidth()+insets.left+insets.right;
        int height=o.getHeight()+insets.top+insets.bottom;
        setPreferredSize(new Dimension(width, height));
        setLayout(null);
        add(o);
        pack();
        setVisible(true);
    }
}
