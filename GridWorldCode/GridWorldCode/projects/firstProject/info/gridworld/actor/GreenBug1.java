package info.gridworld.actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class GreenBug1 extends Bug
{
	
	public GreenBug1(){
		super(Color.GREEN);
		setDirection(Location.SOUTHWEST);}
		
    public void act()
    {
        if (canMove())
            move();
        else
            turn();
    }

    /**
     * Turns the bug 45 degrees to the right without changing its location.
     */
    public void turn()
    {
        setDirection(getDirection() - 135);
        if(getDirection()==Location.NORTH)
        	turn();
        if(getDirection()==Location.SOUTH)
        	turn();	
        setColor(Color.YELLOW);
    }

    /**
     * Moves the bug forward, putting a flower into the location it previously
     * occupied.
     */
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        Bug bug = new Bug(Color.RED);
        bug.putSelfInGrid(gr, loc);
        bug.setDirection(Location.NORTHEAST);
    }

    /**
     * Tests whether this bug can move forward into a location that is empty or
     * contains a flower.
     * @return true if this bug can move.
     */
    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        setColor(Color.GREEN);
        return !(neighbor instanceof Critter);
        // ok to move into empty location or onto flower
        // not ok to move onto any other actor
    }
}
