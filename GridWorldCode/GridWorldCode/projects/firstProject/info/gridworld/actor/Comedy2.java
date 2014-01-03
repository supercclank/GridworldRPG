package info.gridworld.actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
public class Comedy2 extends Actor {

   public Comedy2() {
   }

   public boolean canAct(){
               Grid<Actor> gr = getGrid();
       if (gr == null)
               return false;

       Location loc = getLocation();
       ArrayList<Actor> anthony = grid.getNeighbors(loc);
       if (anthony.size() == 0)
               return false;
       else
               return true;



   }
   public void act(){
       if (canAct())
               move();
       else
               turn();

   }
   public void move(){
       Grid<Actor> gr=getGrid();
       Location loc = getLocation();
       ArrayList<Actor> anth = grid.getNeighbors(loc);
       Random gen=new Random();
       int x = gen.nextInt(anth.size());
       Location local = anth.get(x).getLocation();
       removeSelfFromGrid();
       anth.get(x).removeSelfFromGrid();
       putSelfInGrid(gr, local);
       anth.get(x).putSelfInGrid(gr,loc);



       setColor(Color.RED);
       return;

   }
   public void turn(){
       setColor(Color.GREEN);
       setDirection(100*Location.FULL_CIRCLE);

       setColor(Color.BLUE);
       setDirection(100*Location.FULL_CIRCLE);

       setColor(Color.RED);
       setDirection(100*Location.FULL_CIRCLE);

       setColor(Color.YELLOW);
       setDirection(100*Location.FULL_CIRCLE);

               setColor(Color.WHITE);
       setDirection(100*Location.FULL_CIRCLE);
       return;
}}