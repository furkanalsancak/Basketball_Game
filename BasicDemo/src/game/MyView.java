package game;

import city.cs.engine.World;
import city.cs.engine.WorldView;

import javax.swing.*;
import java.awt.*;

public abstract class MyView extends WorldView {

    private Image background;

    public MyView(World w, int width, int height){
        super(w, width, height);
        background = new ImageIcon("data.university.png").getImage();
    }

    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 50, 100, this);
    }

    @Override
    protected void paintForeground(Graphics2D g) {
        //g.drawImage(background, 50, 100, this);
    }

}
