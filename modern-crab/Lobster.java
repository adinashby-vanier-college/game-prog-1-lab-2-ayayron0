// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if (Greenfoot.isKeyDown("a")) {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(4);
        }
        if (isTouching(Crab.class)) {
            move(10);
            turn(6);
        }
        
    }
}
