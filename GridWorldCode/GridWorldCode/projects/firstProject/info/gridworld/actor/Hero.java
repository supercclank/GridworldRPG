/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 */

package info.gridworld.actor;

import java.awt.Color;

/**
 * A <code>Rock</code> is an actor that does nothing. It is commonly used to
 * block other actors from moving. <br />
 * The API of this class is testable on the AP CS A and AB exams.
 */
import info.gridworld.grid.Location;
public class Hero extends Actor
{
    
    
    private static final Color DEFAULT_COLOR = null;

    /**
     * Constructs a black rock.
     */
    public Hero() throws InterruptedException
    {setColor(DEFAULT_COLOR);
    }

    /**
     * Constructs a rock of a given color.
     * @param rockColor the color of this rock
     */
    public Hero(Color rockColor) 
    {
        setColor(rockColor);
    }

    /**
     * Overrides the <code>act</code> method in the <code>Actor</code> class
     * to do nothing.
     */
    public Location Walk(int xgraph,int ygraph)
    {int x=xgraph;
    int y=ygraph;
    Location newspace=new Location(x,y);
    Actor other = grid.get(newspace);

			moveTo(newspace);
    	return newspace;
    }
    

    
     
    
      
  
    
    
    
    
    
    
}
