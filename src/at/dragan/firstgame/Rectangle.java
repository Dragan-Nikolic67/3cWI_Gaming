package at.dragan.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangle extends BasicGame {
    private int x;
    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.x ++;

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, 100, 100, 100);
        if (this.x < 1000){
            graphics.drawString("Hello from the Knollis!", 50, 50);
        }
        else{
            graphics.drawString("Bye Bye, from the Knollis!", 80, 80);
        }
    }
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangle("Rectangle"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
