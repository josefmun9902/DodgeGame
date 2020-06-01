import java.awt.*;

public class PatternObstacles
{
    private int x;
    private int y;
    private int w;
    private int h;
    private int s;
    private int t;
    private int cur;
    private int direction;
    public static final int RIGHT=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int UP=3;
    public PatternObstacles(int x, int y, int w, int h, int s, int t)
    {
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.s=s;
        this.t=t;
        cur=0;
    }
    public void update()
    {
        //System.out.println("aaa");
        //System.out.println(cur);
        //System.out.println(s+", "+t);
        if(cur==t)
        {
            cur=0;
            if(direction==RIGHT)
                direction=DOWN;
            else if(direction==DOWN)
                direction=LEFT;
            else if(direction==LEFT)
                direction=UP;
            else if(direction==UP)
                direction=RIGHT;
            return;
        }
        if(direction==RIGHT)
            x+=s;
        else if(direction==DOWN)
            y+=s;
        else if(direction==LEFT)
            x-=s;
        else if(direction==UP)
            y-=s;
        cur+=s;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getW() {
        return w;
    }
    public void setW(int w) {
        this.w = w;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    public int getS() {
        return s;
    }
    public void setS(int s) {
        this.s = s;
    }
    public int getT() {
        return t;
    }
    public void setT(int t) {
        this.t = t;
    }
    public Rectangle getPO()
    {
        java.awt.Rectangle r= new java.awt.Rectangle((int)(x), (int)(y), (int)(w), (int)(h));
        return r;
    }
}
