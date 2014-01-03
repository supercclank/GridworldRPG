package info.gridworld.actor;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.awt.Color;
import info.gridworld.actor.Bug;
public class KillerCritter extends Critter
{
    public void act()
    {
        if (getGrid() == null)
            return;
        ArrayList<Actor> actors = getActors();
        processActors(actors);
        ArrayList<Location> moveLocs = getMoveLocations();
        Location loc = selectMoveLocation(moveLocs);
        makeMove(loc);
    }

   public ArrayList<Actor> getActors()
    {
       return getGrid().getNeighbors(getLocation());
    }

    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (!(a instanceof Critter))
                {System.out.println(a.toString());
               	a.removeSelfFromGrid();}
        }
    }

	public Location selectMoveLocation(ArrayList<Location> locs)
    {
        int n = locs.size();
        if (n == 0)
            return getLocation();
        return locs.get(n/2);
    }
    
    public void makeMove(Location loc)
    {Location temp=getLocation();
    Bug box=new Bug();
    box.setColor(Color.BLUE);
        if (loc == null)
            removeSelfFromGrid();
        else
            moveTo(loc);
     box.putSelfInGrid(grid,temp);
            
    }
}
