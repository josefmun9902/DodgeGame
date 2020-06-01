import java.awt.*;

public class BasicObstacle
{
    private int x;
    private int y;
    private int w;
    private int h;
    private int s;
    private String d;
    private boolean hit;
    public BasicObstacle(int x, int y, int w, int h, String d, int s)
    {
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.d=d;
        this.s=s;
        hit=false;
    }
    public void update()
    {
        if(d=="hl")
        {
            x-=s;
            if(hit)
                d="hr";
        }
        else if(d=="hr")
        {
            x+=s;
            /*System.out.println("right before");
            System.out.println(hit);
            if(hit)
            {
                System.out.println("hit true reached the method");
                d="hl";
            }*/
        }
        else if(d=="vd")
        {
            y+=s;
            if(hit)
                d="vu";
        }
        else if(d=="vu")
        {
            y-=s;
            if(hit)
                d="vd";
        }
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
    public String getD() {
        return d;
    }
    public void setD(String d) {
        this.d = d;
    }
    public Rectangle getBO()
    {
        java.awt.Rectangle r= new java.awt.Rectangle((int)(x), (int)(y), (int)(w), (int)(h));
        return r;
    }
    public boolean isHit() {
        return hit;
    }
    public void setHit(boolean hit) {
        this.hit = hit;
    }
}
