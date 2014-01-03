package info.gridworld.actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
public class Comedy extends Actor
{ 	
    public Location location;
    private int direction;
    private Color color;
    private ArrayList neighbors=new ArrayList<Location>();
	private Location next;
	private Actor hold;
	private Location old;
    public Comedy(){
    	super();
    	}
   
    public void moveTo(Location newLocation)
    {	if (grid == null)
            throw new IllegalStateException("This actor is not in a grid.");
        if (grid.get(location) != this)
            throw new IllegalStateException(
                    "The grid contains a different actor at location "
                            + location + ".");
        if (!grid.isValid(newLocation))
            throw new IllegalArgumentException("Location " + newLocation
                    + " is not valid.");

        if (newLocation.equals(location))
            return;
        grid.remove(location);
        Actor other = grid.get(newLocation);
        if (other != null)
            other.removeSelfFromGrid();
        location = newLocation;
        grid.put(location, this);
    }
	
	public void turn()
	{System.out.println();
	}
   
   	public void pickNeighbor(){
   	neighbors=grid.getOccupiedAdjacentLocations(this.getLocation());	
   	Random gen=new Random(neighbors.size());
   	int x=gen.nextInt();
   	next=(Location)neighbors.get(x);
   	}
   	
    public void act()
    {int z=grid.getOccupiedAdjacentLocations(this.getLocation()).size();
    if (z<1)	
    	{pickNeighbor();
        old=this.getLocation();
        hold=grid.put(next, this);
        grid.put(old, hold);
        this.setColor(Color.RED);
        System.out.println("JOKE!");}
     else {
     	for (int x=0; x<100; x++)
     		{this.setColor(Color.GREEN);}
     	for (int x=0; x<100; x++)
     		{this.setColor(Color.BLUE);}
     	for (int x=0; x<100; x++)
     		{this.setColor(Color.RED);}
     	for (int x=0; x<100; x++)
     		{this.setColor(Color.YELLOW);}
     	for (int x=0; x<100; x++)
     		{this.setColor(Color.WHITE);}}			
     		
     		
     	}   
    }