import javafx.scene.shape.Line;
import org.w3c.dom.css.Rect;

import java.awt.*;

public class LaserObstacles
{
    private int x;
    private int y;
    private int w;
    private int h;
    private int speed;
    private int cur;
    private boolean on;
    public LaserObstacles(int x, int y, int w, int h, int speed)
    {
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.speed=speed;
    }
    public void update()
    {
        //System.out.println(cur+" , "+speed);
        if(cur==speed)
        {
            if(on)
                on=false;
            else
                on=true;
            cur=0;
        }
        else
            cur++;
    }
    public Rectangle get()
    {
        Rectangle r=new java.awt.Rectangle(x, y, w, h);
        return r;
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
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getCur() {
        return cur;
    }
    public void setCur(int cur) {
        this.cur = cur;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
}
