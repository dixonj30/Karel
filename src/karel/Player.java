package karel;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Player extends Entity
{
    char direction; //karels icon ^ > < v
    
    private int gemBag; //how many gems karel is holding
    
    public Player(int x, int y) 
    {
        super(x, y);
        direction ='^';

        URL loc = this.getClass().getResource("up.png");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
    }

    //updates karels position
    public void move(int x, int y) 
    {
        int newX = this.GetX() + x;
        int newY = this.GetY() + y;
        this.SetX(newX);
        this.SetY(newY);
    }
    
    
    public void addGem()
    {
        this.gemBag++;
    }
    
    public int getGemCount()
    {
        return this.gemBag;
    }
    
    public char GetDirection()
    {
        return this.direction;
    }
    
    public void SetDirection(char newDirection)
    {
        this.direction = newDirection;
    }
    
    public void ChangeImage(String NewDirection)
    {   
        URL loc = this.getClass().getResource(NewDirection +".png");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
    }
}