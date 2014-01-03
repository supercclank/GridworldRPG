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

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.GreenBug1;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Hero;
import cs1.Keyboard;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.Comedy2;
import info.gridworld.actor.KillerCritter;
import info.gridworld.actor.Critter;
/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner2
{
    public static void main(String[] args)
    {   int newx=1, oldx=1, newy=1, oldy=1, newz=1, oldz=1;
    	int newy1=1,oldy1=1,oldx1=1,newx1=1;

    	
    	BoundedGrid Map=new BoundedGrid (10,10);
    	String direction;
        ActorWorld world = new ActorWorld(Map);
        world.add(new KillerCritter());
        world.add(new Bug());
        world.add(new Rock());
        //world.add(new GreenBug1());
        world.add(new Comedy2());
        
        //world.add(new Critter());
        world.show();
    	}
    }


