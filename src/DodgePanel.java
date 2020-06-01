/*
Things needed in a text file
----------------------------
-wall(x, y, w, h)
-player start(x, y)
-obstacles
 -type
 -more data
-goals(x, y, width, height)

File
----
P X Y(player)
G X Y W H(goal)
W X Y W H(wall)
HBO X Y(horizontal basic obstacle)
VBO X Y(vertical basic obstacle)

Algorithimum
--------------
try
{
    File f = new File("Level_One.txt");
    Scanner ff=new Scanner(f);
    while(ff.hasNextLine())
    {
        String [] data =ff.nextLine().split(" ");
        if(data[0].equals("P"))
        {
            int sx=Integer.parseInt(data[1]);
            int sy=Integer.parseInt(data{2})
        }
    }
}
catch(Exception e)
{
    e.printStackTrace();
}
*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.BufferedImage;
public class DodgePanel extends JPanel implements MouseListener, KeyListener, Runnable
{
    public static final int UPS = 60;
    public static final int FPS = 35;
    public static final int WIDTH = 700;
    public static final int HEIGHT = 700;
    BufferedImage buffer = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_4BYTE_ABGR);
    Graphics bg = buffer.getGraphics();
    DodgeGame game;
    boolean hasPainted=false;
    public DodgePanel(int width, int height)
    {
        super();
        game=new DodgeGame(1, 5);
        Thread t = new Thread(this);
        setSize(WIDTH, HEIGHT);
        //add the mouse listener
        addMouseListener(this);
        addKeyListener(this);
        t.start();
    }
    public void paint(Graphics g) {
        if(game.getStatus()!=game.LOST&&game.getStatus()!=game.WON) {
            //background
            bg.setColor(new Color(190, 190, 190));
            bg.fillRect(0, 0, getWidth(), getHeight());
            //goal
            bg.setColor(Color.GREEN);
            bg.fillRect((int) (game.getGoal().goalX), (int) (game.getGoal().goalY), (int) (game.getGoal().goalWidth), (int) (game.getGoal().goalHeight));
            //player
            bg.setColor(Color.BLUE);
            bg.fillRect((int) (game.getPX()), (int) (game.getPY()), 20, 20);
            //walls
            for (int x = 0; x < game.getWalls().size(); x++) {
                bg.setColor(new Color(94, 94, 93));
                //System.out.println((int)(game.getWalls().get(x).getX())+" "+(int)(game.getWalls().get(x).getY())+" "+(int)(game.getWalls().get(x).getWidth())+" "+(int)(game.getWalls().get(x).getHeight()));
                bg.fillRect((int) (game.getWalls().get(x).getX()), (int) (game.getWalls().get(x).getY()), (int) (game.getWalls().get(x).getWidth()), (int) (game.getWalls().get(x).getHeight()));
            }
            //basic obstacles
            for (int x = 0; x < game.getBos().size(); x++) {
                bg.setColor(Color.RED);
                bg.fillRect((int) (game.getBos().get(x).getX()), (int) (game.getBos().get(x).getY()), (int) (game.getBos().get(x).getW()), (int) (game.getBos().get(x).getH()));
            }
            //pattern obstacles
            for (int x = 0; x < game.getPos().size(); x++) {
                bg.setColor(Color.RED);
                //System.out.println((game.getPos().get(x).getX())+", "+(game.getPos().get(x).getY())+", "+(game.getPos().get(x).getW())+", "+(game.getPos().get(x).getH()));
                bg.fillRect((int) (game.getPos().get(x).getX()), (int) (game.getPos().get(x).getY()), (int) (game.getPos().get(x).getW()), (int) (game.getPos().get(x).getH()));
            }
            //# of lives
            bg.setColor(Color.RED);
            String s = "Lives: " + game.getLives();
            bg.setFont(new Font("Courier", Font.BOLD, 16));
            bg.drawString(s, 3, 13);
            //laser
            if(game.getLos().size()>0)
            for (int x = 0; x < game.getLos().size(); x++) {
                bg.setColor(Color.RED);
                //System.out.println((game.getPos().get(x).getX())+", "+(game.getPos().get(x).getY())+", "+(game.getPos().get(x).getW())+", "+(game.getPos().get(x).getH()));
                if(game.getLos().get(x).isOn())
                    bg.fillRect((int) (game.getLos().get(x).getX()), (int) (game.getLos().get(x).getY()), (int) (game.getLos().get(x).getW()), (int) (game.getLos().get(x).getH()));
            }
        }
        if(game.getStatus()==game.LOST) {
            bg.setColor(new Color(94, 94, 93));
            bg.fillRect(0, 0, 700, 15);
            bg.setColor(Color.RED);
            bg.setFont(new Font("Courier", Font.BOLD, 32));
            String ss="You have lost. Restart the game to Retry.";
            bg.drawString(ss, 50, 50);
            //# of lives
            String s = "Lives: " + game.getLives();
            bg.setFont(new Font("Courier", Font.BOLD, 16));
            bg.drawString(s, 6, 12);
        }
        if(game.getStatus()==game.WON)
        {
            bg.setColor(Color.RED);
            bg.setFont(new Font("Courier", Font.BOLD, 32));
            String ss="You have won.";
            bg.drawString(ss, 50, 50);
        }
        g.drawImage(buffer, 0, 0, null);
        hasPainted=true;
    }
    public void mousePressed(MouseEvent e) {
    }
    public void mouseClicked(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar()=='w'&&game.getStatus()!=game.LOST)
        {
            game.getPlayer().setUpPressed(true);
        }
        if(e.getKeyChar()=='s'&&game.getStatus()!=game.LOST)
        {
            game.getPlayer().setDownPressed(true);
        }
        if(e.getKeyChar()=='d'&&game.getStatus()!=game.LOST)
        {
            game.getPlayer().setRightPressed(true);
        }
        if(e.getKeyChar()=='a'&&game.getStatus()!=game.LOST)
        {
            game.getPlayer().setLeftPressed(true);
        }
    }
    public void keyReleased(KeyEvent e) {
        if(e.getKeyChar()=='w')
        {
            game.getPlayer().setUpPressed(false);
        }
        if(e.getKeyChar()=='s')
        {
            game.getPlayer().setDownPressed(false);
        }
        if(e.getKeyChar()=='d')
        {
            game.getPlayer().setRightPressed(false);
        }
        if(e.getKeyChar()=='a')
        {
            game.getPlayer().setLeftPressed(false);
        }
    }
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar()=='n'&&game.getStatus()==game.LOST)
            game=new DodgeGame(1, 5);
    }
    public void addNotify() {
        super.addNotify();
        requestFocus();
    }

    public void run() {
        int sleepTime = 1000 / UPS;
        while (true) {
            repaint();
            if(hasPainted)
                update();
            try {
                Thread.sleep(sleepTime);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void update() {
            if(game.getStatus()!=game.LOST||game.getStatus()!=game.WON) {
            game.update();
            if (game.getStatus()!=game.WON&&game.nextLevel(game.getStatus())) {
                //System.out.println("herher");
                game = new DodgeGame(game.getStatus(), game.getLives()+1);
            }
            if (game.getStatus()!=game.WON&&game.deaths() && game.getLives() == 1) {
                game.setLives(game.getLives() - 1);
                game.setStatus(0);
            } else if (game.getStatus()!=game.WON&&game.deaths()) {
                game = new DodgeGame(game.getStatus(), game.getLives() - 1);
            }
        }
    }
}

