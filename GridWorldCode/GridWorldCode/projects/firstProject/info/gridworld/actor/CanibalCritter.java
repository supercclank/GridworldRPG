package info.gridworld.actor;
import info.gridworld.grid.Location;
import java.util.ArrayList;
public class CanibalCritter extends Critter
{
    public void act()
    {
        if (getGrid() == null)
            return;
        ArrayList<Actor> actors = getActors();
        processActors(actors);
    }

    public void processActors(ArrayList<Actor> actors)
    {int x=0;
    Location temp;
        for (Actor a : actors)
        {	if (a instanceof Rock)
        		x++;
            if ((a instanceof Critter)||(a instanceof ChameleonCritter))
                {temp=a.getLocation();
                a.removeSelfFromGrid();
            	new Rock().putSelfInGrid(getGrid(),temp);}
        }
     if (x==actors.size())
     	makeMove(new Location(getLocation().getRow(),getLocation().getCol()));  
    }

    public void makeMove(Location loc)
    { 	Actor other;
    	Location temp;
    	temp=getLocation();
    	if (getGrid() == null)
            throw new IllegalStateException("This actor is not in a grid.");
        if (!getGrid().isValid(loc))
            throw new IllegalArgumentException("Location is not valid.");
        if (loc == null)
            removeSelfFromGrid();
        else
        	{other=getGrid().put(loc,this);
        	getGrid().put(temp,other);
        	}
            
    }
}
