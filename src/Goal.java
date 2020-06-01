import java.awt.*;

public class Goal
{
    double goalX;
    double goalY;
    double goalWidth;
    double goalHeight;
    public Goal(double x, double y, double w, double h)
    {
        goalX=x;
        goalY=y;
        goalWidth=w;
        goalHeight=h;
    }
    public Rectangle goalRect()
    {
        java.awt.Rectangle r=new Rectangle((int)(goalX),(int)(goalY), (int)(goalWidth), (int)(goalHeight));
        return r;
    }
}
