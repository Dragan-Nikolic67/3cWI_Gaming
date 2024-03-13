package at.dragan.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangle extends BasicGame {
    private float circle_y;
    private float oval_x;
    private float rec_x;
    private float rec_y;
    private float upperBorder;
    private float lowerBorder;

    private float leftBorder;
    private float rightBorder;

    private boolean circleGoingDown;
    private boolean ovalGoingRight;

    private boolean recGoingRight;

    private Boolean recGoingDown;


    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {


    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.lowerBorder = 500;
        this.upperBorder = 0;
        this.leftBorder = 0;
        this.rightBorder = 600;
        if (circleGoingDown) {
            this.circle_y++;
            if (this.circle_y >= lowerBorder) {
                circleGoingDown = false;
            }
        } else {
            this.circle_y--;
            if (this.circle_y <= upperBorder) {
                circleGoingDown = true;
            }
        }
        if (ovalGoingRight) {
            this.oval_x++;
            if (this.oval_x >= rightBorder) {
                ovalGoingRight = false;
            }
        } else {
            this.oval_x--;
            if (this.oval_x <= leftBorder) {
                ovalGoingRight = true;
            }
        }
        if (recGoingRight) {
            this.rec_x++;
            if (this.rec_x >= 600) {
                recGoingRight = false;
                recGoingDown = true;
            }
        }




    }
//für nächstes mal, x = 120, 600  y=120, 400
            @Override
            public void render (GameContainer gameContainer, Graphics graphics) throws SlickException {
                graphics.drawRect(120, 400, 100, 100);
                graphics.drawOval(oval_x, 0, 200, 100);
                graphics.drawOval(0, this.circle_y, 100, 100);

            }

            public static void main (String[]argv){
                try {
                    AppGameContainer container = new AppGameContainer(new Rectangle("Rectangle"));
                    container.setDisplayMode(800, 600, false);
                    container.start();
                } catch (SlickException e) {
                    e.printStackTrace();
                }
            }
        }
