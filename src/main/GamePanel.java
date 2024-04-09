package main;

import entity.Player;
import object.SuperObject;
import tile.TileManager;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{
    final int originalTileSize = 16;
    final int scale =3;
    public final int tileSize = originalTileSize*scale; //48x48

   public final int maxScreenCol  =16;
    public final int maxScreenRow =12;
    public final int screenWidth = tileSize * maxScreenCol;
    public final int screenHeight = tileSize *maxScreenRow;
    KeyHandler keyH = new KeyHandler();

    Thread gameThread;
//FPS
    int FPS=60;
    TileManager tileM = new TileManager(this);
    public Player player = new Player(this,keyH);

    //Players Default Position
    int playerX = 100;
    int playerY =100;
    int playerSpeed = 4;

    public final int maxWorldCol = 50;
    public final int maxWorldRow = 50;
    public final int worldWidth = tileSize*maxWorldCol;
    public final int worldHeight =tileSize*maxWorldRow;
    public CollisionChecker cChecker = new CollisionChecker(this);
    public AssestSetter aSetter = new AssestSetter(this);

    public SuperObject obj[] = new SuperObject[10];

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);



    }

    public void setUpGame(){
        aSetter.setObject();
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double nextDrawTime = System.nanoTime()+drawInterval;

        while(gameThread!=null){
            update();
            repaint();
            try {


                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime=remainingTime/1000000;
                if(remainingTime<0){
                    remainingTime =0;
                }

                Thread.sleep((long) remainingTime);

                nextDrawTime +=drawInterval;
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }



    }
    public void update(){
        player.update();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        //Tile Draw
        tileM.draw(g2);
        //Object Draw
        for(int i = 0; i<obj.length;i++){
            if(obj[i]!= null){
                obj[i].draw(g2, this);
            }
        }

        //Player Draw
        player.draw(g2);
        g2.dispose();


    }



}
