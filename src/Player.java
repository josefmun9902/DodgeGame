import javafx.scene.shape.Rectangle;

import java.awt.*;
public class Player
{
    private double playerX;
    private double playerY;
    private boolean upPressed;
    private boolean downPressed;
    private boolean leftPressed;
    private boolean rightPressed;
    private boolean hitUp;
    private boolean hitDown;
    private boolean hitLeft;
    private boolean hitRight;
    public static final int SPEED=4;
    public Player(double x, double y)
    {
        playerX=x;
        playerY=y;
    }
    public double getPlayerX() {
        return playerX;
    }

    public void setPlayerX(double playerX) {
        this.playerX = playerX;
    }

    public double getPlayerY() {
        return playerY;
    }

    public void setPlayerY(double playerY) {
        this.playerY = playerY;
    }
    public void update()
    {
        System.out.print(playerX+", ");
        System.out.println(playerY);
        if(upPressed&&!leftPressed&&!rightPressed&&!hitUp)
            playerY-=SPEED;
        if(downPressed&&!leftPressed&&!rightPressed&&!hitDown)
            playerY+=SPEED;
        if(leftPressed&&!upPressed&&!downPressed&&!hitLeft)
            playerX-=SPEED;
        if(rightPressed&&!upPressed&&!downPressed&&!hitRight)
            playerX+=SPEED;
        if(upPressed&&leftPressed&&!hitUp&&!hitLeft)
        {
            playerY-=.7*SPEED;
            playerX-=.7*SPEED;
        }
        if(upPressed&&rightPressed&&!hitUp&&!hitRight)
        {
            playerY-=.7*SPEED;
            playerX+=.7*SPEED;
        }
        if(downPressed&&rightPressed&&!hitDown&&!hitRight)
        {
            playerY+=.7*SPEED;
            playerX+=.7*SPEED;
        }
        if(downPressed&&leftPressed&&!hitDown&&!hitLeft)
        {
            playerY+=.7*SPEED;
            playerX-=.7*SPEED;
        }
    }
    public void setUpPressed(boolean pressed)
    {
        upPressed=pressed;
    }
    public void setDownPressed(boolean pressed)
    {
        downPressed=pressed;
    }
    public void setLeftPressed(boolean pressed)
    {
        leftPressed=pressed;
    }
    public void setRightPressed(boolean pressed)
    {
        rightPressed=pressed;
    }
    public java.awt.Rectangle Rectangle()
    {
        java.awt.Rectangle r1=new java.awt.Rectangle((int)(playerX),(int)(playerY), 20, 20 );
        return r1;
    }
    public boolean isHitUp() {
        return hitUp;
    }

    public void setHitUp(boolean hitUp) {
        this.hitUp = hitUp;
    }

    public boolean isHitDown() {
        return hitDown;
    }

    public void setHitDown(boolean hitDown) {
        this.hitDown = hitDown;
    }

    public boolean isHitLeft() {
        return hitLeft;
    }

    public void setHitLeft(boolean hitLeft) {
        this.hitLeft = hitLeft;
    }

    public boolean isHitRight() {
        return hitRight;
    }
    public void setHitRight(boolean hitRight) {
        this.hitRight = hitRight;
    }

    public boolean isUpPressed() {
        return upPressed;
    }

    public boolean isDownPressed() {
        return downPressed;
    }

    public boolean isLeftPressed() {
        return leftPressed;
    }

    public boolean isRightPressed() {
        return rightPressed;
    }
}
