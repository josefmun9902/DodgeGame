import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class DodgeGame
{
    private File one;
    private File two;
    private File three;
    private File five;
    private Player player;
    private ArrayList<Wall> walls;
    private ArrayList<BasicObstacle> Bos;
    private ArrayList<PatternObstacles> Pos;
    private ArrayList<LaserObstacles> Los;
    private Goal goal;
    private int status;
    private int lives;
    public static final int LOST=0;
    public static final int ONE=1;
    public static final int TWO=2;
    public static final int THREE=3;
    public static final int FOUR=4;
    public static final int FIVE=5;
    public static final int WON=6;
    public DodgeGame(int status, int lives) {
        this.status = status;
        this.lives = lives;
        //status = ONE;
        walls = new ArrayList<>();
        Bos = new ArrayList<>();
        Pos = new ArrayList<>();
        Los = new ArrayList<>();
        //algorithum
        if (status == ONE) {
            try {
                one = new File("src/Level_One.txt");
                Scanner ff = new Scanner(one);
                while (ff.hasNextLine()) {
                    String[] data = ff.nextLine().split(" ");
                    if (data[0].equals("P")) {
                        double sx = Double.parseDouble(data[1]);
                        double sy = Double.parseDouble(data[2]);
                        player = new Player(sx, sy);
                    }
                    if (data[0].equals("W")) {
                        double wx = Double.parseDouble(data[1]);
                        double wy = Double.parseDouble(data[2]);
                        double ww = Double.parseDouble(data[3]);
                        double wh = Double.parseDouble(data[4]);
                        walls.add(new Wall(wx, wy, ww, wh));
                    }
                    if (data[0].equals("G")) {
                        double gx = Double.parseDouble(data[1]);
                        double gy = Double.parseDouble(data[2]);
                        double gw = Double.parseDouble(data[3]);
                        double gh = Double.parseDouble(data[4]);
                        goal = new Goal(gx, gy, gw, gh);
                    }
                    if (data[0].equals("VBO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        Bos.add(new BasicObstacle((int) (bx), (int) (by), (int) (bw), (int) (bh), "vd", (int) (s)));
                    }
                    if (data[0].equals("HBO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        Bos.add(new BasicObstacle((int) (bx), (int) (by), (int) (bw), (int) (bh), "hr", (int) (s)));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (status == TWO) {
            //System.out.println("here");
            try {
                two = new File("src/Level_Two.txt");
                Scanner tt = new Scanner(two);
                while (tt.hasNextLine()) {
                    String[] data = tt.nextLine().split(" ");
                    if (data[0].equals("P")) {
                        double sx = Double.parseDouble(data[1]);
                        double sy = Double.parseDouble(data[2]);
                        player = new Player(sx, sy);
                    }
                    if (data[0].equals("W")) {
                        double wx = Double.parseDouble(data[1]);
                        double wy = Double.parseDouble(data[2]);
                        double ww = Double.parseDouble(data[3]);
                        double wh = Double.parseDouble(data[4]);
                        walls.add(new Wall(wx, wy, ww, wh));
                    }
                    if (data[0].equals("G")) {
                        double gx = Double.parseDouble(data[1]);
                        double gy = Double.parseDouble(data[2]);
                        double gw = Double.parseDouble(data[3]);
                        double gh = Double.parseDouble(data[4]);
                        goal = new Goal(gx, gy, gw, gh);
                    }
                    if (data[0].equals("VBO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        Bos.add(new BasicObstacle((int) (bx), (int) (by), (int) (bw), (int) (bh), "vd", (int) (s)));
                    }
                    if (data[0].equals("HBO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        Bos.add(new BasicObstacle((int) (bx), (int) (by), (int) (bw), (int) (bh), "hr", (int) (s)));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (status == THREE) {
            //System.out.println("here");
            try {
                three = new File("src/Level_Three.txt");
                Scanner bb = new Scanner(three);
                while (bb.hasNextLine()) {
                    String[] data = bb.nextLine().split(" ");
                    if (data[0].equals("P")) {
                        double sx = Double.parseDouble(data[1]);
                        double sy = Double.parseDouble(data[2]);
                        player = new Player(sx, sy);
                    }
                    if (data[0].equals("W")) {
                        double wx = Double.parseDouble(data[1]);
                        double wy = Double.parseDouble(data[2]);
                        double ww = Double.parseDouble(data[3]);
                        double wh = Double.parseDouble(data[4]);
                        walls.add(new Wall(wx, wy, ww, wh));
                    }
                    if (data[0].equals("G")) {
                        double gx = Double.parseDouble(data[1]);
                        double gy = Double.parseDouble(data[2]);
                        double gw = Double.parseDouble(data[3]);
                        double gh = Double.parseDouble(data[4]);
                        goal = new Goal(gx, gy, gw, gh);
                    }
                    if (data[0].equals("VBO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        Bos.add(new BasicObstacle((int) (bx), (int) (by), (int) (bw), (int) (bh), "vd", (int) (s)));
                    }
                    if (data[0].equals("HBO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        Bos.add(new BasicObstacle((int) (bx), (int) (by), (int) (bw), (int) (bh), "hr", (int) (s)));
                    }
                    if (data[0].equals("PO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        double t = Double.parseDouble(data[6]);
                        Pos.add(new PatternObstacles((int) (bx), (int) (by), (int) (bw), (int) (bh), (int) (s), (int) (t)));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (status == FOUR) {
            //System.out.println("here");
            try {
                three = new File("src/Level_Four.txt");
                Scanner bb = new Scanner(three);
                while (bb.hasNextLine()) {
                    String[] data = bb.nextLine().split(" ");
                    if (data[0].equals("P")) {
                        double sx = Double.parseDouble(data[1]);
                        double sy = Double.parseDouble(data[2]);
                        player = new Player(sx, sy);
                    }
                    if (data[0].equals("W")) {
                        double wx = Double.parseDouble(data[1]);
                        double wy = Double.parseDouble(data[2]);
                        double ww = Double.parseDouble(data[3]);
                        double wh = Double.parseDouble(data[4]);
                        walls.add(new Wall(wx, wy, ww, wh));
                    }
                    if (data[0].equals("G")) {
                        double gx = Double.parseDouble(data[1]);
                        double gy = Double.parseDouble(data[2]);
                        double gw = Double.parseDouble(data[3]);
                        double gh = Double.parseDouble(data[4]);
                        goal = new Goal(gx, gy, gw, gh);
                    }
                    if (data[0].equals("VBO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        Bos.add(new BasicObstacle((int) (bx), (int) (by), (int) (bw), (int) (bh), "vd", (int) (s)));
                    }
                    if (data[0].equals("HBO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        Bos.add(new BasicObstacle((int) (bx), (int) (by), (int) (bw), (int) (bh), "hr", (int) (s)));
                    }
                    if (data[0].equals("PO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        double t = Double.parseDouble(data[6]);
                        Pos.add(new PatternObstacles((int) (bx), (int) (by), (int) (bw), (int) (bh), (int) (s), (int) (t)));
                    }
                    if (data[0].equals("LO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        //double t = Double.parseDouble(data[6]);
                        Los.add(new LaserObstacles((int) (bx), (int) (by), (int) (bw), (int) (bh), (int) (s)));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            }
        //System.out.println("here");
        if (status == FIVE) {
            //System.out.println("1");
            //System.out.println("here");
            try {
                five = new File("src/Level_Five.txt");
                Scanner v = new Scanner(five);
                while (v.hasNextLine()) {
                    String[] data = v.nextLine().split(" ");
                    if (data[0].equals("P")) {
                        double sx = Double.parseDouble(data[1]);
                        double sy = Double.parseDouble(data[2]);
                        player = new Player(sx, sy);
                    }
                    if (data[0].equals("W")) {
                        double wx = Double.parseDouble(data[1]);
                        double wy = Double.parseDouble(data[2]);
                        double ww = Double.parseDouble(data[3]);
                        double wh = Double.parseDouble(data[4]);
                        walls.add(new Wall(wx, wy, ww, wh));
                    }
                    if (data[0].equals("G")) {
                        //System.out.println("aaaa");
                        double gx = Double.parseDouble(data[1]);
                        double gy = Double.parseDouble(data[2]);
                        double gw = Double.parseDouble(data[3]);
                        double gh = Double.parseDouble(data[4]);
                        goal = new Goal(gx, gy, gw, gh);
                    }
                    if (data[0].equals("VBO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        Bos.add(new BasicObstacle((int) (bx), (int) (by), (int) (bw), (int) (bh), "vd", (int) (s)));
                    }
                    if (data[0].equals("HBO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        Bos.add(new BasicObstacle((int) (bx), (int) (by), (int) (bw), (int) (bh), "hr", (int) (s)));
                    }
                    if (data[0].equals("PO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        double t = Double.parseDouble(data[6]);
                        Pos.add(new PatternObstacles((int) (bx), (int) (by), (int) (bw), (int) (bh), (int) (s), (int) (t)));
                    }
                    if (data[0].equals("LO")) {
                        double bx = Double.parseDouble(data[1]);
                        double by = Double.parseDouble(data[2]);
                        double bw = Double.parseDouble(data[3]);
                        double bh = Double.parseDouble(data[4]);
                        double s = Double.parseDouble(data[5]);
                        //double t = Double.parseDouble(data[6]);
                        Los.add(new LaserObstacles((int) (bx), (int) (by), (int) (bw), (int) (bh), (int) (s)));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void update()
    {
        if(status!=6) {
            player.update();
            for (int x = 0; x < Pos.size(); x++)
                Pos.get(x).update();
            for (int x = 0; x < Bos.size(); x++)
                Bos.get(x).update();
            for (int x = 0; x < Los.size(); x++)
                Los.get(x).update();
            //System.out.print(Pos.size());
            upPInt();
            downPInt();
            leftPInt();
            rightPInt();
            BOHitwall();
        }
        //nextLevel(status);
    }
    public double getPX()
    {
        return player.getPlayerX();
    }
    public double getPY()
    {
        return player.getPlayerY();
    }
    public void setPX(double PX)
    {
        player.setPlayerX(PX);
    }
    public void setPY(double PY)
    {
        player.setPlayerY(PY);
    }
    public Player getPlayer() {
        return player;
    }
    public ArrayList<Wall> getWalls() {
        return walls;
    }
    public boolean upPInt()
    {
        //System.out.println("here");
        for(int x=0;x<walls.size();x++)
        {
            if(new java.awt.Rectangle((int)(walls.get(x).getX()), (int)(walls.get(x).getY()), (int)(walls.get(x).getWidth()), (int)(walls.get(x).getHeight())).intersects(player.Rectangle())&&new java.awt.Rectangle((int)(walls.get(x).getX()), (int)(walls.get(x).getY()), (int)(walls.get(x).getWidth()), (int)(walls.get(x).getHeight())).contains(player.getPlayerX()+10, player.getPlayerY()))
            {
                /*if(player.isUpPressed())
                    player.setUpPressed(false);*/
                player.setHitUp(true);
                //System.out.println("hit");
                player.setPlayerY(walls.get(x).getY()+walls.get(x).getHeight());
                return true;
            }
        }
        player.setHitUp(false);
        return false;
    }
    public boolean downPInt()
    {
        //System.out.println("here");
        for(int x=0;x<walls.size();x++)
        {
            if(new java.awt.Rectangle((int)(walls.get(x).getX()), (int)(walls.get(x).getY()), (int)(walls.get(x).getWidth()), (int)(walls.get(x).getHeight())).intersects(player.Rectangle())&&new java.awt.Rectangle((int)(walls.get(x).getX()), (int)(walls.get(x).getY()), (int)(walls.get(x).getWidth()), (int)(walls.get(x).getHeight())).contains(player.getPlayerX()+10, player.getPlayerY()+20))
            {
                /*if(player.isUpPressed())
                    player.setUpPressed(false);*/
                player.setHitDown(true);
                //System.out.println("hit");
                player.setPlayerY(walls.get(x).getY()-20);
                return true;
            }
        }
        player.setHitDown(false);
        return false;
    }
    public boolean leftPInt()
    {
        //System.out.println("here");
        for(int x=0;x<walls.size();x++)
        {
            if(new java.awt.Rectangle((int)(walls.get(x).getX()), (int)(walls.get(x).getY()), (int)(walls.get(x).getWidth()), (int)(walls.get(x).getHeight())).intersects(player.Rectangle())&&new java.awt.Rectangle((int)(walls.get(x).getX()), (int)(walls.get(x).getY()), (int)(walls.get(x).getWidth()), (int)(walls.get(x).getHeight())).contains(player.getPlayerX(), player.getPlayerY()+10))
            {
                /*if(player.isUpPressed())
                    player.setUpPressed(false);*/
                player.setHitLeft(true);
                //System.out.println("hit");
                player.setPlayerX(walls.get(x).getX()+walls.get(x).getWidth());
                return true;
            }
        }
        player.setHitLeft(false);
        return false;
    }
    public boolean rightPInt()
    {
        //System.out.println("here");
        for(int x=0;x<walls.size();x++)
        {
            if(new java.awt.Rectangle((int)(walls.get(x).getX()), (int)(walls.get(x).getY()), (int)(walls.get(x).getWidth()), (int)(walls.get(x).getHeight())).intersects(player.Rectangle())&&new java.awt.Rectangle((int)(walls.get(x).getX()), (int)(walls.get(x).getY()), (int)(walls.get(x).getWidth()), (int)(walls.get(x).getHeight())).contains(player.getPlayerX()+20, player.getPlayerY()+10))
            {
                /*if(player.isUpPressed())
                    player.setUpPressed(false);*/
                player.setHitRight(true);
                //System.out.println("hit");
                player.setPlayerX(walls.get(x).getX()-20);
                return true;
            }
        }
        player.setHitRight(false);
        return false;
    }
    public boolean nextLevel(int curLevel)
    {
        //System.out.println("here");
        if(goal.goalRect().intersects(player.Rectangle()))
        {
            //System.out.println("here2");
            status=status+1;
            //System.out.println(status);
            return true;
        }
        return false;
    }
    public Goal getGoal()
    {
        return goal;
    }

    public int getStatus() {
        return status;
    }
    public void BOHitwall()
    {
        for(int b=0;b<Bos.size();b++)
        {
            Bos.get(b).setHit(false);
            for(int w=0;w< walls.size();w++) {
                if (Bos.get(b).getBO().intersects(walls.get(w).getRectangle()))
                {
                    if(Bos.get(b).getD()=="hr")
                    {
                        Bos.get(b).setX((int)(walls.get(w).getX()-20));
                        Bos.get(b).setD("hl");
                    }
                }
                if (Bos.get(b).getBO().intersects(walls.get(w).getRectangle()))
                {
                    if(Bos.get(b).getD()=="hl")
                    {
                        Bos.get(b).setX((int)(walls.get(w).getX()+walls.get(w).getWidth()));
                        Bos.get(b).setD("hr");
                    }
                }
                if (Bos.get(b).getBO().intersects(walls.get(w).getRectangle()))
                {
                    if(Bos.get(b).getD()=="vd")
                    {
                        Bos.get(b).setY((int)(walls.get(w).getY()-20));
                        Bos.get(b).setD("vu");
                    }
                }
                if (Bos.get(b).getBO().intersects(walls.get(w).getRectangle()))
                {
                    if(Bos.get(b).getD()=="vu")
                    {
                        Bos.get(b).setY((int)(walls.get(w).getY()+walls.get(w).getHeight()));
                        Bos.get(b).setD("vd");
                    }
                }
            }
        }
    }
    //public boolean POHitWall()
    //{}
    public ArrayList<BasicObstacle> getBos() {
        return Bos;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
    public boolean deaths()
    {
        for(int b=0;b<Bos.size();b++)
        {
            if(Bos.get(b).getBO().intersects(player.Rectangle()))
            {
                return true;
            }

        }
        for(int p=0;p<Pos.size();p++)
        {
            if(Pos.get(p).getPO().intersects(player.Rectangle()))
            {
                return true;
            }
        }
        for(int e=0;e<Los.size();e++)
        {
            if(Los.get(e).get().intersects(player.Rectangle())&&Los.get(e).isOn())
            {
                return true;
            }
        }
        return false;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public ArrayList<PatternObstacles> getPos() {
        return Pos;
    }
    public void setPos(ArrayList<PatternObstacles> pos) {
        Pos = pos;
    }
    public ArrayList<LaserObstacles> getLos() {
        return Los;
    }
    public void setLos(ArrayList<LaserObstacles> los) {
        Los = los;
    }
}

