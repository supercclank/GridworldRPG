




import cs1.Keyboard;
import info.gridworld.actor.Critter;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Path;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Hero;
import info.gridworld.actor.rat;
import info.gridworld.actor.skelly;
import info.gridworld.actor.Door;
import info.gridworld.actor.Stairs;
import info.gridworld.actor.Chest;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import cs1.Keyboard;
import java.util.Random;
import java.util.StringTokenizer;
public class Read {

    public static void main(String[] args) throws InterruptedException{
        Random gen = new Random();
        StringTokenizer token; String currenttoken; String candle;
			int a, b, c, d, e, z, mana, q, w, lvl, exp, x, y, expleft, spec, checkspec,droptable,hitmultiplier,checkdrop, 
			newx, newy, oldx, oldy, oldz, olda, wallcount, chestcount, spec2, candlecount1, skullkeycount;
			double	 f, v, exptogo;
			lvl=1;
			exp=0;
			z=1000000;
			candlecount1=0;
			checkdrop=0;
			hitmultiplier=0;
			wallcount=0;
			int keycount=0;
			skullkeycount=0;
			int pitcheck=0;
			int gravedig=0;
			int gravecheck=0;
			String [] [] [] [] map = new String [51] [51] [6] [6];
			int wincount=-1;
		int newx1,oldx1,newy1,oldy1;

BoundedGrid Map=new BoundedGrid (50,50);
BoundedGrid Map1=new BoundedGrid (50,50);
        ActorWorld world = new ActorWorld(Map);
        ActorWorld world1 = new ActorWorld(Map1);
        Location start=new Location(19,14);


        
       
        

        rat r1=new rat();
        rat r2=new rat();
        r1.putSelfInGrid(Map,new Location(19,9));
        r2.putSelfInGrid(Map,new Location(20,9));

        
        Door d1=new Door();
        d1.putSelfInGrid(Map,new Location(16,9));
        
        Stairs s1=new Stairs();
        Stairs s2=new Stairs();
        s1.putSelfInGrid(Map,new Location(16,5));
        s2.putSelfInGrid(Map,new Location(13,15));        
                
		Chest c1=new Chest();
		Chest c2=new Chest();
        c1.putSelfInGrid(Map,new Location(22,10));        
        c2.putSelfInGrid(Map,new Location(23,10));

        

        Path p1= new Path();
        Path p2= new Path();
        Path p3= new Path();
        Path p4= new Path();
        Path p5= new Path();
        Path p6= new Path();
        Path p7= new Path();
        Path p8= new Path();
        Path p9= new Path();
        Path p10= new Path();
        Path p11= new Path();
        Path p12= new Path();
        Path p13= new Path();
        Path p14= new Path();
        Path p15= new Path();
        Path p16= new Path();
        Path p17= new Path();
        Path p18= new Path();
        Path p19= new Path();
        Path p20= new Path();
        Path p21= new Path();
        Path p22= new Path();
        Path p23= new Path();
        Path p24= new Path();
        Path p25= new Path();
        Path p26= new Path();
        Path p27= new Path();
        Path p28= new Path();
        Path p29= new Path();
        Path p30= new Path();
        Path p31= new Path();
        Path p32= new Path();
        Path p33= new Path();
        Path p34= new Path();
        Path p35= new Path();
        Path p36= new Path();
        Path p37= new Path();
        Path p38= new Path();
        Path p39= new Path();
        Path p40= new Path();
        Path p41= new Path();
        Path p42= new Path();
        Path p43= new Path();
        Path p44= new Path();
        Path p45= new Path();
        Path p46= new Path();
        Path p47= new Path();
        Path p48= new Path();
        Path p49= new Path();
        Path p50= new Path();
        Path p51= new Path();
        Path p52= new Path();
        Path p53= new Path();
        Path p54= new Path();
        Path p55= new Path();
        Path p56= new Path();
        Path p57= new Path();
        Path p58= new Path();
        Path p59= new Path();
        Path p60= new Path();
        Path p61= new Path();
        Path p62= new Path();
        Path p63= new Path();
        Path p64= new Path();
        Path p65= new Path();
        Path p66= new Path();
        Path p67= new Path();
        Path p68= new Path();
        Path p69= new Path();
        Path p70= new Path();
        Path p71= new Path();
        Path p72= new Path();
        Path p73= new Path();
        Path p74= new Path();
        Path p100= new Path();      
        Path p101= new Path(); 
        Path p102= new Path();
        Path p103= new Path();
        Path p104= new Path();
        Path p105= new Path();
        
        p1.putSelfInGrid(Map,new Location(15,5));

        p3.putSelfInGrid(Map,new Location(17,5));
        
        p4.putSelfInGrid(Map,new Location(15,6));
        p5.putSelfInGrid(Map,new Location(16,6));
        p6.putSelfInGrid(Map,new Location(17,6));
        
        p8.putSelfInGrid(Map,new Location(17,7));
        p9.putSelfInGrid(Map,new Location(17,7));
        p10.putSelfInGrid(Map,new Location(17,7));
        
        p11.putSelfInGrid(Map,new Location(15,8));
        p12.putSelfInGrid(Map,new Location(16,8));
        p13.putSelfInGrid(Map,new Location(17,8));
        


        
        p17.putSelfInGrid(Map,new Location(15,10));
        p18.putSelfInGrid(Map,new Location(16,10));
        p19.putSelfInGrid(Map,new Location(19,10));
        p20.putSelfInGrid(Map,new Location(20,10));

        
        p23.putSelfInGrid(Map,new Location(15,11));
        p24.putSelfInGrid(Map,new Location(19,11));
        p25.putSelfInGrid(Map,new Location(20,11));
        p26.putSelfInGrid(Map,new Location(22,11));
        p27.putSelfInGrid(Map,new Location(23,11));
        
        p100.putSelfInGrid(Map,new Location(13,12));
        p28.putSelfInGrid(Map,new Location(14,12));
        p29.putSelfInGrid(Map,new Location(15,12));
        p30.putSelfInGrid(Map,new Location(16,12));
		p31.putSelfInGrid(Map,new Location(17,12));
        p32.putSelfInGrid(Map,new Location(18,12));
        p33.putSelfInGrid(Map,new Location(19,12));
        p34.putSelfInGrid(Map,new Location(20,12));
        p35.putSelfInGrid(Map,new Location(22,12));
        p36.putSelfInGrid(Map,new Location(23,12));
        
        p37.putSelfInGrid(Map,new Location(0,13));
        p38.putSelfInGrid(Map,new Location(1,13));
        p39.putSelfInGrid(Map,new Location(2,13));
        p40.putSelfInGrid(Map,new Location(3,13));
        p41.putSelfInGrid(Map,new Location(4,13));
        p42.putSelfInGrid(Map,new Location(5,13));
        p43.putSelfInGrid(Map,new Location(6,13));
        p44.putSelfInGrid(Map,new Location(7,13));
        p45.putSelfInGrid(Map,new Location(8,13));
        p46.putSelfInGrid(Map,new Location(9,13));
        p47.putSelfInGrid(Map,new Location(10,13));
        p48.putSelfInGrid(Map,new Location(11,13));
        p101.putSelfInGrid(Map,new Location(13,13));
        p49.putSelfInGrid(Map,new Location(14,13));
        p50.putSelfInGrid(Map,new Location(15,13));
        p51.putSelfInGrid(Map,new Location(19,13));
        p52.putSelfInGrid(Map,new Location(22,13));
        p53.putSelfInGrid(Map,new Location(23,13));
        
        p54.putSelfInGrid(Map,new Location(13,14));
        p55.putSelfInGrid(Map,new Location(14,14));
        p56.putSelfInGrid(Map,new Location(16,14));
        p57.putSelfInGrid(Map,new Location(17,14));
        p58.putSelfInGrid(Map,new Location(18,14));
        p59.putSelfInGrid(Map,new Location(19,14));
        p60.putSelfInGrid(Map,new Location(20,14));
        p61.putSelfInGrid(Map,new Location(21,14));
        p62.putSelfInGrid(Map,new Location(22,14));
        p63.putSelfInGrid(Map,new Location(23,14));
        p64.putSelfInGrid(Map,new Location(23,14));
        

        p65.putSelfInGrid(Map,new Location(19,15));
        p104.putSelfInGrid(Map,new Location(15,7));
        p103.putSelfInGrid(Map,new Location(15,8));
		p105.putSelfInGrid(Map,new Location(16,7));
        
        p66.putSelfInGrid(Map,new Location(19,16));
        
        p67.putSelfInGrid(Map,new Location(19,17));
        
        p68.putSelfInGrid(Map,new Location(19,18));
        
        p69.putSelfInGrid(Map,new Location(19,19));
 //floor 2

 
 
 
 Path pp1= new Path();
        Path pp2= new Path();
        Path pp3= new Path();
        Path pp4= new Path();
        Path pp5= new Path();
        Path pp6= new Path();
        Path pp7= new Path();
        Path pp8= new Path();
        Path pp9= new Path();
        Path pp10= new Path();
        Path pp11= new Path();
        Path pp12= new Path();
        Path pp13= new Path();
        Path pp14= new Path();
        Path pp15= new Path();
        Path pp16= new Path();
        Path pp17= new Path();
        Path pp18= new Path();
        Path pp19= new Path();
        Path pp20= new Path();
        Path pp21= new Path();
        Path pp22= new Path();
        Path pp23= new Path();
        Path pp24= new Path();
        Path pp25= new Path();
        Path pp26= new Path();
        Path pp27= new Path();
        Path pp28= new Path();
        Path pp29= new Path();
        Path pp30= new Path();
        Path pp31= new Path();
        Path pp32= new Path();
        Path pp33= new Path();
        Path pp34= new Path();
        Path pp35= new Path();
        Path pp36= new Path();
        Path pp37= new Path();
        Path pp38= new Path();
        Path pp39= new Path();
        Path pp40= new Path();
        Path pp41= new Path();
        Path pp42= new Path();
        Path pp43= new Path();
        Path pp44= new Path();
        Path pp45= new Path();
        Path pp46= new Path();
        Path pp47= new Path();
        Path pp48= new Path();
        Path pp49= new Path();
        Path pp50= new Path();
        Path pp51= new Path();
        Path pp52= new Path();
        Path pp53= new Path();
        Path pp54= new Path();
        Path pp55= new Path();
        Path pp56= new Path();
        Path pp57= new Path();
        Path pp58= new Path();
        Path pp59= new Path();
        Path pp60= new Path();
        Path pp61= new Path();
        Path pp62= new Path();
        Path pp63= new Path();
        Path pp64= new Path();
        Path pp65= new Path();
        Path pp66= new Path();
        Path pp67= new Path();
        Path pp68= new Path();
        Path pp69= new Path();
        Path pp70= new Path();
        Path pp71= new Path();
        Path pp72= new Path();
        Path pp73= new Path();
        Path pp74= new Path();
        Path pp75= new Path();
        Path pp76= new Path();
        Path pp77= new Path();
        Path pp78= new Path();
        Path pp79= new Path();        
        Path pp80= new Path();        
        Path pp81= new Path();        
        Path pp82= new Path();
        Path pp83= new Path();
        Path pp84= new Path();
        Path pp85= new Path();
        Path pp86= new Path();
        Path pp87= new Path();
        Path pp88= new Path();
        Path pp89= new Path();
        Path pp100= new Path();      
        Path pp101= new Path(); 
        Path pp102= new Path();
        Path pp103= new Path();
        Path pp104= new Path();
        Path pp105= new Path();
        Path pp106= new Path();
        Path pp107= new Path();      
        Path pp108= new Path(); 
        Path pp109= new Path();
        Path pp110= new Path();
        Path pp111= new Path();
        Path pp112= new Path();
        Path pp113= new Path();
        Path pp114= new Path();      
        Path pp115= new Path(); 
        Path pp116= new Path();
        Path pp117= new Path();
        Path pp118= new Path();
        Path pp119= new Path();
        Path pp120= new Path();
        Path pp121= new Path();      
        Path pp122= new Path(); 
        Path pp123= new Path();
        Path pp124= new Path();
        Path pp125= new Path();
        Path pp126= new Path();
        Path pp127= new Path();
        Path pp128= new Path();      
        Path pp129= new Path(); 
        Path pp130= new Path();
        Path pp131= new Path();
        Path pp132= new Path();
        Path pp133= new Path();
        Path pp134= new Path();
        Path pp135= new Path();      
        Path pp136= new Path(); 
        Path pp137= new Path();
        Path pp138= new Path();
        Path pp139= new Path();
        Path pp140= new Path();
        Path pp141= new Path();
        Path pp142= new Path();
        Path pp143= new Path();
        Path pp144= new Path();
        Path pp145= new Path();
        Path pp146= new Path();      
        Path pp147= new Path(); 
        Path pp148= new Path();
        Path pp149= new Path();
        Path pp150= new Path();
        Path pp151= new Path();
        Path pp152= new Path();
        Path pp153= new Path();
        Path pp154= new Path();
        Path pp155= new Path();
        Path pp156= new Path();
        Path pp157= new Path();
        Path pp158= new Path();
        Path pp159= new Path();        
        Path pp160= new Path();
        Path pp161= new Path();
        Path pp162= new Path();
        Path pp163= new Path();
        Path pp164= new Path();
        Path pp165= new Path();
        
        Path pp166= new Path();      
        Path pp167= new Path(); 
        Path pp168= new Path();
        Path pp169= new Path();
        Path pp170= new Path();
        Path pp171= new Path();
        Path pp172= new Path();
        Path pp173= new Path();
        Path pp174= new Path();
        Path pp175= new Path();
        Path pp176= new Path();
        Path pp177= new Path();      
        Path pp178= new Path(); 
        Path pp179= new Path();
        Path pp180= new Path();
        Path pp181= new Path();
        Path pp182= new Path();
        Path pp183= new Path();
        Path pp184= new Path();
        Path pp185= new Path();
        Path pp186= new Path();
        Path pp187= new Path();
        Path pp188= new Path();
        Path pp189= new Path();
        Path pp190= new Path();        
        Path pp191= new Path();
        Path pp192= new Path();
        Path pp193= new Path();
        Path pp194= new Path();
        Path pp195= new Path();
        Path pp196= new Path();        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
               
        pp1.putSelfInGrid(Map1,new Location(15,5));
        pp2.putSelfInGrid(Map1,new Location(15,6));
        pp3.putSelfInGrid(Map1,new Location(15,7));        
        pp4.putSelfInGrid(Map1,new Location(15,8));
        pp5.putSelfInGrid(Map1,new Location(15,9));
        pp6.putSelfInGrid(Map1,new Location(15,10));
        pp8.putSelfInGrid(Map1,new Location(15,11));
        pp9.putSelfInGrid(Map1,new Location(15,12));
        pp10.putSelfInGrid(Map1,new Location(15,13)); 
        pp11.putSelfInGrid(Map1,new Location(15,14));
        pp12.putSelfInGrid(Map1,new Location(15,15));
        pp13.putSelfInGrid(Map1,new Location(15,16));
        pp14.putSelfInGrid(Map1,new Location(15,17));
        pp15.putSelfInGrid(Map1,new Location(15,18));
        pp16.putSelfInGrid(Map1,new Location(15,19));
        
        pp17.putSelfInGrid(Map1,new Location(16,5));
        pp18.putSelfInGrid(Map1,new Location(16,6));
        pp19.putSelfInGrid(Map1,new Location(16,7));
        pp20.putSelfInGrid(Map1,new Location(16,8));
        pp21.putSelfInGrid(Map1,new Location(16,9));
        pp22.putSelfInGrid(Map1,new Location(16,10));
        pp23.putSelfInGrid(Map1,new Location(16,11));
        pp24.putSelfInGrid(Map1,new Location(16,12));
        pp25.putSelfInGrid(Map1,new Location(16,13));
        pp26.putSelfInGrid(Map1,new Location(16,14));
        pp27.putSelfInGrid(Map1,new Location(16,15));
        pp100.putSelfInGrid(Map1,new Location(16,16));
        pp28.putSelfInGrid(Map1,new Location(16,17));
        pp29.putSelfInGrid(Map1,new Location(16,18));
        pp30.putSelfInGrid(Map1,new Location(16,19));
        
		pp31.putSelfInGrid(Map1,new Location(17,5));
        pp32.putSelfInGrid(Map1,new Location(17,6));
        pp33.putSelfInGrid(Map1,new Location(17,7));
        pp34.putSelfInGrid(Map1,new Location(17,8));
        pp35.putSelfInGrid(Map1,new Location(17,9));
        pp36.putSelfInGrid(Map1,new Location(17,10));
        pp37.putSelfInGrid(Map1,new Location(17,11));
        pp38.putSelfInGrid(Map1,new Location(17,12));
        pp39.putSelfInGrid(Map1,new Location(17,13));
        pp40.putSelfInGrid(Map1,new Location(17,14));
        pp41.putSelfInGrid(Map1,new Location(17,15));
        pp42.putSelfInGrid(Map1,new Location(17,16));
        pp43.putSelfInGrid(Map1,new Location(17,17));
        pp44.putSelfInGrid(Map1,new Location(17,18));
        pp45.putSelfInGrid(Map1,new Location(17,19));
        
        pp46.putSelfInGrid(Map1,new Location(18,5));
        pp47.putSelfInGrid(Map1,new Location(18,6));
        pp48.putSelfInGrid(Map1,new Location(18,7));
        pp101.putSelfInGrid(Map1,new Location(18,8));
        pp49.putSelfInGrid(Map1,new Location(18,9));
        pp50.putSelfInGrid(Map1,new Location(18,10));
        pp51.putSelfInGrid(Map1,new Location(18,11));
        pp52.putSelfInGrid(Map1,new Location(18,12));
        pp53.putSelfInGrid(Map1,new Location(18,13));
        pp54.putSelfInGrid(Map1,new Location(18,14));
        pp55.putSelfInGrid(Map1,new Location(18,15));
        pp56.putSelfInGrid(Map1,new Location(18,16));
        pp57.putSelfInGrid(Map1,new Location(18,17));
        pp58.putSelfInGrid(Map1,new Location(18,18));
        pp59.putSelfInGrid(Map1,new Location(18,19));
        
        pp60.putSelfInGrid(Map1,new Location(19,5));
        pp61.putSelfInGrid(Map1,new Location(19,6));
        pp62.putSelfInGrid(Map1,new Location(19,7));
        pp63.putSelfInGrid(Map1,new Location(19,8));
        pp64.putSelfInGrid(Map1,new Location(19,9));
        pp102.putSelfInGrid(Map1,new Location(19,10));
        pp65.putSelfInGrid(Map1,new Location(19,11));
        pp104.putSelfInGrid(Map1,new Location(19,12));
        pp103.putSelfInGrid(Map1,new Location(19,13));
		pp105.putSelfInGrid(Map1,new Location(19,14));
        pp66.putSelfInGrid(Map1,new Location(19,15));
        pp67.putSelfInGrid(Map1,new Location(19,16));
        pp68.putSelfInGrid(Map1,new Location(19,17));
        pp69.putSelfInGrid(Map1,new Location(19,18));
		pp70.putSelfInGrid(Map1,new Location(19,19));
		
        pp71.putSelfInGrid(Map1,new Location(20,5));
        pp72.putSelfInGrid(Map1,new Location(20,6));
        pp73.putSelfInGrid(Map1,new Location(20,7));
        pp74.putSelfInGrid(Map1,new Location(20,8));
        pp75.putSelfInGrid(Map1,new Location(20,9));
        pp76.putSelfInGrid(Map1,new Location(20,10));
        pp77.putSelfInGrid(Map1,new Location(20,11));
        pp78.putSelfInGrid(Map1,new Location(20,12));
        pp79.putSelfInGrid(Map1,new Location(20,13));
        pp80.putSelfInGrid(Map1,new Location(20,14));        
        pp81.putSelfInGrid(Map1,new Location(20,15));
        pp82.putSelfInGrid(Map1,new Location(20,16));
        pp83.putSelfInGrid(Map1,new Location(20,17));
        pp84.putSelfInGrid(Map1,new Location(20,18));
        pp85.putSelfInGrid(Map1,new Location(20,19));
        
        pp86.putSelfInGrid(Map1,new Location(21,5));
        pp87.putSelfInGrid(Map1,new Location(21,6));
        pp88.putSelfInGrid(Map1,new Location(21,7));
        pp89.putSelfInGrid(Map1,new Location(21,8));
		pp106.putSelfInGrid(Map1,new Location(21,9));
        pp107.putSelfInGrid(Map1,new Location(21,10));     
        pp108.putSelfInGrid(Map1,new Location(21,11));
        pp109.putSelfInGrid(Map1,new Location(21,12));
        pp110.putSelfInGrid(Map1,new Location(21,13));
        pp111.putSelfInGrid(Map1,new Location(21,14));
        pp112.putSelfInGrid(Map1,new Location(21,15));
        pp113.putSelfInGrid(Map1,new Location(21,16));
        pp114.putSelfInGrid(Map1,new Location(21,17));    
        pp115.putSelfInGrid(Map1,new Location(21,18));
        pp116.putSelfInGrid(Map1,new Location(21,19));
        
       
        pp117.putSelfInGrid(Map1,new Location(22,5));
        pp118.putSelfInGrid(Map1,new Location(22,6));
        pp119.putSelfInGrid(Map1,new Location(22,7));
        pp120.putSelfInGrid(Map1,new Location(22,8));
        pp121.putSelfInGrid(Map1,new Location(22,9));      
        pp122.putSelfInGrid(Map1,new Location(22,10)); 
        pp123.putSelfInGrid(Map1,new Location(22,11));
        pp124.putSelfInGrid(Map1,new Location(22,12));
        pp125.putSelfInGrid(Map1,new Location(22,13));
        pp126.putSelfInGrid(Map1,new Location(22,14));
        pp127.putSelfInGrid(Map1,new Location(22,15));
        pp128.putSelfInGrid(Map1,new Location(22,16));   
        pp129.putSelfInGrid(Map1,new Location(22,17));
        pp130.putSelfInGrid(Map1,new Location(22,18));
        pp131.putSelfInGrid(Map1,new Location(22,19));
        
        pp132.putSelfInGrid(Map1,new Location(23,5));
        pp133.putSelfInGrid(Map1,new Location(23,6));
        pp134.putSelfInGrid(Map1,new Location(23,7));
        pp135.putSelfInGrid(Map1,new Location(23,8));     
        pp136.putSelfInGrid(Map1,new Location(23,9)); 
        pp137.putSelfInGrid(Map1,new Location(23,10));
        pp138.putSelfInGrid(Map1,new Location(23,11));
        pp139.putSelfInGrid(Map1,new Location(23,12));
        pp140.putSelfInGrid(Map1,new Location(23,13));
        pp141.putSelfInGrid(Map1,new Location(23,14));
        pp142.putSelfInGrid(Map1,new Location(23,15));
        pp143.putSelfInGrid(Map1,new Location(23,16));
        pp144.putSelfInGrid(Map1,new Location(23,17));
        pp145.putSelfInGrid(Map1,new Location(23,18));
        pp146.putSelfInGrid(Map1,new Location(23,19));
          
        pp147.putSelfInGrid(Map1,new Location(13,11));
        pp148.putSelfInGrid(Map1,new Location(13,12));
        pp149.putSelfInGrid(Map1,new Location(13,13));
        pp150.putSelfInGrid(Map1,new Location(13,15));
        
        pp151.putSelfInGrid(Map1,new Location(12,8));
        pp152.putSelfInGrid(Map1,new Location(12,9));
        pp153.putSelfInGrid(Map1,new Location(12,11));
        pp154.putSelfInGrid(Map1,new Location(12,13));
        pp155.putSelfInGrid(Map1,new Location(12,15));
        
        pp156.putSelfInGrid(Map1,new Location(11,8));
        pp157.putSelfInGrid(Map1,new Location(11,9));
        pp158.putSelfInGrid(Map1,new Location(11,10));
        pp159.putSelfInGrid(Map1,new Location(11,11));
        pp160.putSelfInGrid(Map1,new Location(11,13));
        pp161.putSelfInGrid(Map1,new Location(11,15));
        
        pp162.putSelfInGrid(Map1,new Location(10,10));
        pp163.putSelfInGrid(Map1,new Location(10,11));
        pp164.putSelfInGrid(Map1,new Location(10,15));
        
        pp165.putSelfInGrid(Map1,new Location(9,8));
		pp166.putSelfInGrid(Map1,new Location(9,9));
		pp167.putSelfInGrid(Map1,new Location(9,10));
		pp168.putSelfInGrid(Map1,new Location(9,11));
		pp169.putSelfInGrid(Map1,new Location(9,12));
		pp170.putSelfInGrid(Map1,new Location(9,13));
		pp172.putSelfInGrid(Map1,new Location(9,14));
		pp173.putSelfInGrid(Map1,new Location(9,15));
		
		pp174.putSelfInGrid(Map1,new Location(8,15));
		
		pp175.putSelfInGrid(Map1,new Location(9,12));
		pp176.putSelfInGrid(Map1,new Location(9,13));
		pp177.putSelfInGrid(Map1,new Location(9,14));
		pp178.putSelfInGrid(Map1,new Location(9,15));
		
		pp179.putSelfInGrid(Map1,new Location(0,13));
		pp180.putSelfInGrid(Map1,new Location(9,14));
		pp181.putSelfInGrid(Map1,new Location(9,15));
		pp182.putSelfInGrid(Map1,new Location(7,15));
		pp183.putSelfInGrid(Map1,new Location(7,14));
		pp184.putSelfInGrid(Map1,new Location(7,13));


        skelly sk1=new skelly();
        skelly sk2=new skelly();
        skelly sk3=new skelly();
        skelly sk4=new skelly();
        skelly sk5=new skelly();     
        sk1.putSelfInGrid(Map1,new Location(9,8));
        sk2.putSelfInGrid(Map1,new Location(12,8));
		sk3.putSelfInGrid(Map1,new Location(10,10));
        sk4.putSelfInGrid(Map1,new Location(9,11));
        sk5.putSelfInGrid(Map1,new Location(7,12));		
		
        Stairs s3=new Stairs();
        Stairs s4=new Stairs();
        s3.putSelfInGrid(Map1,new Location(11,13));
        s4.putSelfInGrid(Map1,new Location(13,15));        
                

 //Floor Three     
        
		Hero joe= new Hero();
		joe.putSelfInGrid(Map,new Location(19,14));
		Hero joe1= new Hero();
		joe1.putSelfInGrid(Map1,new Location(22,19));


for (int add=0; add<2500; add++)
	{world.add(new Rock());
	}

for (int add1=0; add1<2500; add1++)
	{world1.add(new Rock());
	}
			
			


map [5] [15] [1] [1]="";
map [5] [16] [1] [1]="There are stairs leading down";
map [5] [17] [1] [1]="";

map [6] [15] [1] [1]="";
map [6] [16] [1] [1]="";
map [6] [17] [1] [1]="";
map [6] [18] [1] [1]="";

map [7] [15] [1] [1]="";
map [7] [16] [1] [1]="";
map [7] [17] [1] [1]="";


map [8] [15] [1] [1]="";
map [8] [16] [1] [1]="";
map [8] [17] [1] [1]="";



map [9] [16] [1] [1]="The door is locked";
map [9] [19] [1] [1]="A giant rat jumps out at you";
map [9] [20] [1] [1]="A giant rat jumps out at you";



map [10] [15] [1] [1]="";
map [10] [16] [1] [1]="";

map [10] [19] [1] [1]="";
map [10] [20] [1] [1]="";

map [10] [22] [1] [1]="You open a chest";
map [10] [23] [1] [1]="You open a chest";




map [11] [15] [1] [1]="";

map [11] [19] [1] [1]="";
map [11] [20] [1] [1]="";

map [11] [22] [1] [1]="";
map [11] [23] [1] [1]="";


map [12] [13] [1] [1]="";
map [12] [14] [1] [1]="";
map [12] [15] [1] [1]="";
map [12] [16] [1] [1]="";
map [12] [17] [1] [1]="";
map [12] [18] [1] [1]="";
map [12] [19] [1] [1]="";
map [12] [20] [1] [1]="";

map [12] [22] [1] [1]="";
map [12] [23] [1] [1]="";



map [13] [14] [1] [1]="";
map [13] [15] [1] [1]="";

map [13] [19] [1] [1]="";

map [13] [22] [1] [1]="";
map [13] [23] [1] [1]="";

map [13] [0] [1] [1]="";
map [13] [1] [1] [1]="";
map [13] [2] [1] [1]="";
map [13] [3] [1] [1]="";
map [13] [4] [1] [1]="";
map [13] [5] [1] [1]="";
map [13] [6] [1] [1]="";
map [13] [7] [1] [1]="";
map [13] [8] [1] [1]="";
map [13] [9] [1] [1]="";
map [13] [9] [1] [1]="The ground shakes and a strange rat approaches";
map [13] [10] [1] [1]="";
map [13] [11] [1] [1]="YOU HAVE BEATEN THE FIRST DUNGEON";
map [13] [13] [1] [1]="";

map [14] [13] [1] [1]="";
map [14] [14] [1] [1]="";

map [14] [16] [1] [1]="You pickup a key";
map [14] [17] [1] [1]="";
map [14] [18] [1] [1]="You walk toward a dead end\n You see a faint glimmer on the ground\n";
map [14] [19] [1] [1]="You see hallways going out in all directions\n";
map [14] [20] [1] [1]="";
map [14] [21] [1] [1]="";
map [14] [22] [1] [1]="";
map [14] [23] [1] [1]="";



map [15] [13] [1] [1]="There are stairs leading down";

map [15] [19] [1] [1]="";



map [16] [19] [1] [1]="";



map [17] [19] [1] [1]="";



map [18] [19] [1] [1]="";


map [19] [19] [1] [1]="You fall into a pit";







map [13] [0] [2] [1]="There are stairs leading up";
map [14] [0] [2] [1]="";
map [15] [0] [2] [1]="There are stairs leading down";

map [4] [15] [2] [1]="";
map [4] [16] [2] [1]="";
map [4] [17] [2] [1]="";
map [4] [18] [2] [1]="";
map [4] [19] [2] [1]="";
map [4] [20] [2] [1]="";
map [4] [21] [2] [1]="";
map [4] [22] [2] [1]="";
map [4] [23] [2] [1]="";


map [5] [15] [2] [1]="";
map [5] [16] [2] [1]="There are stairs leading up";
map [5] [17] [2] [1]="";;
map [5] [18] [2] [1]="";
map [5] [19] [2] [1]="";
map [5] [20] [2] [1]="";
map [5] [21] [2] [1]="";
map [5] [22] [2] [1]="";
map [5] [23] [2] [1]="";

map [6] [15] [2] [1]="";
map [6] [16] [2] [1]="";
map [6] [17] [2] [1]="";
map [6] [18] [2] [1]="";
map [6] [19] [2] [1]="";
map [6] [20] [2] [1]="";
map [6] [21] [2] [1]="";
map [6] [22] [2] [1]="";
map [6] [23] [2] [1]="";



map [7] [15] [2] [1]="";
map [7] [16] [2] [1]="";
map [7] [17] [2] [1]="";
map [7] [18] [2] [1]="";
map [7] [19] [2] [1]="";
map [7] [20] [2] [1]="";
map [7] [21] [2] [1]="";
map [7] [22] [2] [1]="";
map [7] [23] [2] [1]="";


map [8] [9] [2] [1]="You see a skeleton";

map [8] [11] [2] [1]="";
map [8] [12] [2] [1]="You see a skeleton";

map [8] [15] [2] [1]="";
map [8] [16] [2] [1]="";
map [8] [17] [2] [1]="";
map [8] [18] [2] [1]="";
map [8] [19] [2] [1]="";
map [8] [20] [2] [1]="";
map [8] [21] [2] [1]="";
map [8] [22] [2] [1]="";
map [8] [23] [2] [1]="";


map [9] [9] [2] [1]="";

map [9] [11] [2] [1]="";
map [9] [12] [2] [1]="";

map [9] [15] [2] [1]="";
map [9] [16] [2] [1]="";
map [9] [17] [2] [1]="";
map [9] [18] [2] [1]="";
map [9] [19] [2] [1]="";
map [9] [20] [2] [1]="";
map [9] [21] [2] [1]="";
map [9] [22] [2] [1]="";
map [9] [23] [2] [1]="";



map [10] [9] [2] [1]="";
map [10] [10] [2] [1]="You see a skeleton";
map [10] [11] [2] [1]="";
map [10] [15] [2] [1]="";
map [10] [16] [2] [1]="";
map [10] [17] [2] [1]="";
map [10] [18] [2] [1]="";
map [10] [19] [2] [1]="";
map [10] [20] [2] [1]="";
map [10] [21] [2] [1]="";
map [10] [22] [2] [1]="";
map [10] [23] [2] [1]="";



map [11] [9] [2] [1]="You see a skeleton";
map [11] [10] [2] [1]="";
map [11] [11] [2] [1]="";
map [11] [12] [2] [1]="";
map [11] [13] [2] [1]="";
map [11] [15] [2] [1]="";
map [11] [16] [2] [1]="";
map [11] [17] [2] [1]="";
map [11] [18] [2] [1]="";
map [11] [19] [2] [1]="";
map [11] [20] [2] [1]="";
map [11] [21] [2] [1]="";
map [11] [22] [2] [1]="";
map [11] [23] [2] [1]="";



map [12] [7] [2] [1]="You see a skeleton";
map [12] [9] [2] [1]="";
map [12] [13] [2] [1]="";
map [12] [15] [2] [1]="";
map [12] [16] [2] [1]="";
map [12] [17] [2] [1]="";
map [12] [18] [2] [1]="";
map [12] [19] [2] [1]="";
map [12] [20] [2] [1]="";
map [12] [21] [2] [1]="";
map [12] [22] [2] [1]="";
map [12] [23] [2] [1]="";





map [13] [7] [2] [1]="";
map [13] [9] [2] [1]="";

map [13] [11] [2] [1]="There are stairs leading down";
map [13] [12] [2] [1]="";
map [13] [13] [2] [1]="";

map [13] [15] [2] [1]="";
map [13] [16] [2] [1]="";
map [13] [17] [2] [1]="";
map [13] [18] [2] [1]="";
map [13] [19] [2] [1]="";
map [13] [20] [2] [1]="";
map [13] [21] [2] [1]="";
map [13] [22] [2] [1]="";
map [13] [23] [2] [1]="";


map [14] [0] [2] [1]="";

map [14] [7] [2] [1]="";
map [14] [8] [2] [1]="You walk into a wall";
map [14] [9] [2] [1]="";

map [14] [15] [2] [1]="";
map [14] [16] [2] [1]="";
map [14] [17] [2] [1]="";
map [14] [18] [2] [1]="";
map [14] [19] [2] [1]="";
map [14] [20] [2] [1]="";
map [14] [21] [2] [1]="";
map [14] [22] [2] [1]="";
map [14] [23] [2] [1]="";

map [15] [7] [2] [1]="";
map [15] [8] [2] [1]="";
map [15] [9] [2] [1]="";
map [15] [10] [2] [1]="";
map [15] [11] [2] [1]="";
map [15] [12] [2] [1]="";
map [15] [13] [2] [1]="There are stairs leading up";
map [15] [15] [2] [1]="";
map [15] [16] [2] [1]="";
map [15] [17] [2] [1]="";
map [15] [18] [2] [1]="";
map [15] [19] [2] [1]="";
map [15] [20] [2] [1]="";
map [15] [21] [2] [1]="";
map [15] [22] [2] [1]="";
map [15] [23] [2] [1]="";




map [16] [15] [2] [1]="";
map [16] [16] [2] [1]="";
map [16] [17] [2] [1]="";
map [16] [18] [2] [1]="";
map [16] [19] [2] [1]="";
map [16] [20] [2] [1]="";
map [16] [21] [2] [1]="";
map [16] [22] [2] [1]="";
map [16] [23] [2] [1]="";


map [17] [15] [2] [1]="";
map [17] [16] [2] [1]="";
map [17] [17] [2] [1]="";
map [17] [18] [2] [1]="";
map [17] [19] [2] [1]="You pickup a key";
map [17] [20] [2] [1]="";
map [17] [21] [2] [1]="";
map [17] [22] [2] [1]="";
map [17] [23] [2] [1]="";


map [18] [15] [2] [1]="";
map [18] [16] [2] [1]="";
map [18] [17] [2] [1]="";
map [18] [18] [2] [1]="";
map [18] [19] [2] [1]="You pickup a key";
map [18] [20] [2] [1]="";
map [18] [21] [2] [1]="";
map [18] [22] [2] [1]="";
map [18] [23] [2] [1]="";



map [19] [15] [2] [1]="";
map [19] [16] [2] [1]="";
map [19] [17] [2] [1]="You pickup a key";
map [19] [18] [2] [1]="You pickup a key";
map [19] [19] [2] [1]="";
map [19] [20] [2] [1]="You pickup a key";
map [19] [21] [2] [1]="You pickup a key";
map [19] [22] [2] [1]="";
map [19] [23] [2] [1]="";

map [13] [0] [3] [1]="There are stairs leading down";
map [14] [0] [3] [1]="";
map [15] [0] [3] [1]="There are stairs leading up";

map [1] [17] [3] [1]="You see a red-candle on the wall";
map [1] [18] [3] [1]="";
map [1] [19] [3] [1]="";
map [1] [20] [3] [1]="You see a red-candle on the wall";

map [2] [17] [3] [1]="";
map [2] [18] [3] [1]="";
map [2] [19] [3] [1]="";
map [2] [20] [3] [1]="";

map [3] [17] [3] [1]="";
map [3] [18] [3] [1]="You walk onto an alter platform";
map [3] [19] [3] [1]="You walk onto an alter platform";
map [3] [20] [3] [1]="";

map [4] [17] [3] [1]="";
map [4] [18] [3] [1]="You walk onto an alter platform";
map [4] [19] [3] [1]="You walk onto an alter platform";
map [4] [20] [3] [1]="";

map [5] [17] [3] [1]="";
map [5] [18] [3] [1]="";
map [5] [19] [3] [1]="";
map [5] [20] [3] [1]="";

map [6] [15] [3] [1]="You fall into a pit";
map [6] [17] [3] [1]="";
map [6] [18] [3] [1]="";
map [6] [19] [3] [1]="";
map [6] [20] [3] [1]="";

map [7] [15] [3] [1]="";
map [7] [17] [3] [1]="";
map [7] [18] [3] [1]="";
map [7] [19] [3] [1]="";
map [7] [20] [3] [1]="";

map [8] [15] [3] [1]="";
map [8] [17] [3] [1]="You see a red-candle on the wall";
map [8] [18] [3] [1]="A Demon materializes";
map [8] [19] [3] [1]="A Demon materializes";
map [8] [20] [3] [1]="You see a red-candle on the wall";

map [9] [15] [3] [1]="";
map [9] [18] [3] [1]="";
map [9] [19] [3] [1]="";

map [10] [15] [3] [1]="";
map [10] [18] [3] [1]="";
map [10] [19] [3] [1]="";

map [11] [15] [3] [1]="";
map [11] [18] [3] [1]="";
map [11] [19] [3] [1]="";

map [12] [10] [3] [1]="";
map [12] [11] [3] [1]="";
map [12] [12] [3] [1]="";
map [12] [15] [3] [1]="";
map [12] [18] [3] [1]="";
map [12] [19] [3] [1]="";

map [13] [10] [3] [1]="";
map [13] [11] [3] [1]="There are stairs leading up";
map [13] [12] [3] [1]="";
map [13] [13] [3] [1]="";
map [13] [14] [3] [1]="";
map [13] [15] [3] [1]="";
map [13] [16] [3] [1]="";
map [13] [17] [3] [1]="";
map [13] [18] [3] [1]="";
map [13] [19] [3] [1]="";

map [14] [10] [3] [1]="";
map [14] [11] [3] [1]="";
map [14] [12] [3] [1]="";
map [14] [15] [3] [1]="";
map [14] [16] [3] [1]="";
map [14] [17] [3] [1]="";	
map [14] [18] [3] [1]="";
map [14] [19] [3] [1]="";
			
map [15] [15] [3] [1]="";
map [15] [16] [3] [1]="";
map [15] [17] [3] [1]="";	
map [15] [18] [3] [1]="";
map [15] [19] [3] [1]="";

map [16] [15] [3] [1]="";
map [16] [16] [3] [1]="";
map [16] [17] [3] [1]="";
map [16] [18] [3] [1]="";
map [16] [19] [3] [1]="";

map [17] [15] [3] [1]="";
map [17] [16] [3] [1]="";
map [17] [17] [3] [1]="";
map [17] [18] [3] [1]="";
map [17] [19] [3] [1]="There are stairs leading down";
/*here*/

map [3] [17] [4] [1]="";
map [3] [18] [4] [1]="";
map [3] [19] [4] [1]="";

map [4] [17] [4] [1]="";
map [4] [18] [4] [1]="";
map [4] [19] [4] [1]="";

map [5] [1] [4] [1]="You walk onto a grave";
map [5] [2] [4] [1]="";
map [5] [3] [4] [1]="";
map [5] [4] [4] [1]="";
map [5] [5] [4] [1]="You walk onto a grave";
map [5] [6] [4] [1]="";
map [5] [7] [4] [1]="";
map [5] [8] [4] [1]="";
map [5] [9] [4] [1]="You walk onto a grave";
map [5] [10] [4] [1]="";
map [5] [11] [4] [1]="";
map [5] [12] [4] [1]="";
map [5] [13] [4] [1]="You walk onto a grave";
map [5] [14] [4] [1]="";
map [5] [15] [4] [1]="";
map [5] [16] [4] [1]="";
map [5] [17] [4] [1]="";

map [6] [1] [4] [1]="You walk onto a grave";
map [6] [2] [4] [1]="";
map [6] [3] [4] [1]="";
map [6] [4] [4] [1]="";
map [6] [5] [4] [1]="You walk onto a grave";
map [6] [6] [4] [1]="";
map [6] [7] [4] [1]="";
map [6] [8] [4] [1]="";
map [6] [9] [4] [1]="You walk onto a grave";
map [6] [10] [4] [1]="";
map [6] [11] [4] [1]="";
map [6] [12] [4] [1]="";
map [6] [13] [4] [1]="You walk onto a grave";

map [7] [1] [4] [1]="You walk onto a grave";
map [7] [2] [4] [1]="";
map [7] [3] [4] [1]="";
map [7] [4] [4] [1]="";
map [7] [5] [4] [1]="You walk onto a grave";
map [7] [6] [4] [1]="";
map [7] [7] [4] [1]="";
map [7] [8] [4] [1]="";
map [7] [9] [4] [1]="You walk onto a grave";
map [7] [10] [4] [1]="";
map [7] [11] [4] [1]="";
map [7] [12] [4] [1]="";
map [7] [13] [4] [1]="You walk onto a grave";
map [7] [15] [4] [1]="";
map [7] [16] [4] [1]="";
map [7] [17] [4] [1]="";
map [7] [18] [4] [1]="";
map [7] [19] [4] [1]="";

map [8] [1] [4] [1]="You walk onto a grave";
map [8] [2] [4] [1]="";
map [8] [3] [4] [1]="";
map [8] [4] [4] [1]="";
map [8] [5] [4] [1]="You walk onto a grave";
map [8] [6] [4] [1]="";
map [8] [7] [4] [1]="";
map [8] [8] [4] [1]="";
map [8] [9] [4] [1]="You walk onto a grave";
map [8] [10] [4] [1]="";
map [8] [11] [4] [1]="";
map [8] [12] [4] [1]="";
map [8] [13] [4] [1]="You walk onto a grave";
map [8] [19] [4] [1]="";

map [9] [1] [4] [1]="You walk onto a grave";
map [9] [2] [4] [1]="";
map [9] [3] [4] [1]="";
map [9] [4] [4] [1]="";
map [9] [5] [4] [1]="You walk onto a grave";
map [9] [6] [4] [1]="";
map [9] [7] [4] [1]="";
map [9] [8] [4] [1]="";
map [9] [9] [4] [1]="You walk onto a grave";
map [9] [10] [4] [1]="";
map [9] [11] [4] [1]="";
map [9] [12] [4] [1]="";
map [9] [13] [4] [1]="You walk onto a grave";
map [9] [15] [4] [1]="";
map [9] [16] [4] [1]="";
map [9] [17] [4] [1]="";
map [9] [18] [4] [1]="";
map [9] [19] [4] [1]="";

map [10] [1] [4] [1]="You walk onto a grave";
map [10] [2] [4] [1]="";
map [10] [3] [4] [1]="";
map [10] [4] [4] [1]="";
map [10] [5] [4] [1]="You walk onto a grave";
map [10] [6] [4] [1]="";
map [10] [7] [4] [1]="";
map [10] [8] [4] [1]="";
map [10] [9] [4] [1]="You walk onto a grave";
map [10] [10] [4] [1]="";
map [10] [11] [4] [1]="";
map [10] [12] [4] [1]="";
map [10] [13] [4] [1]="You walk onto a grave";
map [10] [15] [4] [1]="";

map [11] [1] [4] [1]="You walk onto a grave";
map [11] [2] [4] [1]="";
map [11] [3] [4] [1]="";
map [11] [4] [4] [1]="";
map [11] [5] [4] [1]="You walk onto a grave";
map [11] [6] [4] [1]="";
map [11] [7] [4] [1]="";
map [11] [8] [4] [1]="";
map [11] [9] [4] [1]="You walk onto a grave";
map [11] [10] [4] [1]="";
map [11] [11] [4] [1]="";
map [11] [12] [4] [1]="";
map [11] [13] [4] [1]="You walk onto a grave";
map [11] [15] [4] [1]="";
map [11] [16] [4] [1]="";
map [11] [17] [4] [1]="";
map [11] [18] [4] [1]="";
map [11] [19] [4] [1]="";

map [12] [1] [4] [1]="You walk onto a grave";
map [12] [2] [4] [1]="";
map [12] [3] [4] [1]="";
map [12] [4] [4] [1]="";
map [12] [5] [4] [1]="You walk onto a grave";
map [12] [6] [4] [1]="";
map [12] [7] [4] [1]="";
map [12] [8] [4] [1]="";
map [12] [9] [4] [1]="You walk onto a grave";
map [12] [10] [4] [1]="";
map [12] [11] [4] [1]="";
map [12] [12] [4] [1]="";
map [12] [13] [4] [1]="You walk onto a grave";
map [12] [19] [4] [1]="";

map [13] [0] [4] [1]="There are stairs leading up";
map [13] [2] [4] [1]="";
map [13] [3] [4] [1]="";
map [13] [4] [4] [1]="";
map [13] [5] [4] [1]="You walk onto a grave";
map [13] [6] [4] [1]="";
map [13] [7] [4] [1]="";
map [13] [8] [4] [1]="";
map [13] [9] [4] [1]="You walk onto a grave";
map [13] [10] [4] [1]="";
map [13] [11] [4] [1]="";
map [13] [12] [4] [1]="";
map [13] [13] [4] [1]="You walk onto a grave";
map [13] [15] [4] [1]="";
map [13] [16] [4] [1]="";
map [13] [17] [4] [1]="";
map [13] [18] [4] [1]="";
map [13] [19] [4] [1]="";

map [14] [0] [4] [1]="";
map [14] [2] [4] [1]="";
map [14] [3] [4] [1]="";
map [14] [4] [4] [1]="";
map [14] [5] [4] [1]="You walk onto a grave";
map [14] [6] [4] [1]="";
map [14] [7] [4] [1]="";
map [14] [8] [4] [1]="";
map [14] [9] [4] [1]="You walk onto a grave";
map [14] [10] [4] [1]="";
map [14] [11] [4] [1]="";
map [14] [12] [4] [1]="";
map [14] [13] [4] [1]="You walk onto a grave";
map [14] [15] [4] [1]="";

map [15] [0] [4] [1]="";
map [15] [1] [4] [1]="The door is bolted shut";
map [15] [2] [4] [1]="";
map [15] [3] [4] [1]="";
map [15] [4] [4] [1]="";
map [15] [5] [4] [1]="";
map [15] [6] [4] [1]="";
map [15] [7] [4] [1]="";
map [15] [8] [4] [1]="";
map [15] [9] [4] [1]="";
map [15] [10] [4] [1]="";
map [15] [11] [4] [1]="";
map [15] [12] [4] [1]="";
map [15] [13] [4] [1]="";
map [15] [15] [4] [1]="";
map [15] [16] [4] [1]="";
map [15] [17] [4] [1]="";
map [15] [18] [4] [1]="";
map [15] [19] [4] [1]="";

map [16] [19] [4] [1]="";
map [17] [19] [4] [1]="";



			
			//map [row] [collumn] [floor] [dungeon number]
			oldx=14; oldy=19; oldz=1; olda=1;
			newx=14; newy=19; oldx1=14; oldy1=14; newy1=14; newx1=19;
			String[] Drop = new String[] {"Battle Axe","Plate Armour","Plate Legs","Helmet"};
			int[] drop = new int[] {0,0,0,0};
			String fire, attack, choice, thunder, ice, direction, quit;
			fire="F";
			attack="A";
			thunder="T";
			ice="I";
			quit="Q";
			choice="";
	while (true)
	{
	z=1000000000;
	droptable=gen.nextInt(4);
	c=100+lvl*10;
	mana=100+lvl*5;
	if (choice.equalsIgnoreCase(quit))
		break;
		 if (oldz==1) world.show();
		 if (oldz==2) world1.show();		
			
			wallcount=0;
			chestcount=0;	
			if (map [newx][newy][oldz][olda]==null)
				{map [newx][newy][oldz][olda]="You walk into a wall";
				System.out.println("You walk into a wall");}
			
					
			token = new StringTokenizer (map [newx][newy][oldz][olda]);	
			while (token.hasMoreTokens())
			{currenttoken = token.nextToken();	
			if (currenttoken.equalsIgnoreCase("skeleton")){ z=8; map[newx][newy][oldz][olda]="";}
			if (currenttoken.equalsIgnoreCase("wall")) wallcount++;
			if (currenttoken.equalsIgnoreCase("chest")){ chestcount++; map[newx][newy][oldz][olda]="";}
			if (currenttoken.equalsIgnoreCase("pit")) oldz++;
			if (currenttoken.equalsIgnoreCase("giant")){ z=6; map[newx][newy][oldz][olda]="";}
			if (currenttoken.equalsIgnoreCase("key")){ keycount++; map[newx][newy][oldz][olda]="";}
			if (currenttoken.equalsIgnoreCase("demon")){ z=7; map[newx][newy][oldz][olda]="";}
			if (currenttoken.equalsIgnoreCase("alter")){}
			if (currenttoken.equalsIgnoreCase("red-candle"))
				{System.out.println("Would you like to light the candle? (Y to do so)");
				candle=Keyboard.readString();
				if (candle.equalsIgnoreCase("Y"))
					candlecount1++;}
			
			
			if (currenttoken.equalsIgnoreCase("locked"))
			{
				if (keycount<=0)
					{System.out.println("You need a key to open the door");
					wallcount++;
					}
			if (keycount>0) 
				{
				System.out.println("You walk through the door");
				map[newx][newy][oldz][olda]="";}}	
			
			if (currenttoken.equalsIgnoreCase("down"))
				{System.out.println("Would you like to go down the stairs");
				System.out.println("Enter Y to go down");
				String yes=Keyboard.readString();
				if (yes.equalsIgnoreCase("Y"))
					oldz++;}
			if (currenttoken.equalsIgnoreCase("up"))
				{System.out.println("Would you like to go up the stairs");
				System.out.println("Enter Y to go up");
				String yes=Keyboard.readString();
				if (yes.equalsIgnoreCase("Y"))
					oldz--;}
				
			if (currenttoken.equalsIgnoreCase("grave"))
				{System.out.println("Would you like to dig up the grave");
				System.out.println("Enter Y to go dig");
				String yes=Keyboard.readString();
				if (yes.equalsIgnoreCase("Y"))
					{gravedig++;
					}}
					
			if (currenttoken.equalsIgnoreCase("bolted"))
			{if (skullkeycount<=0)
					{System.out.println("You need a skullkey to open the door");
					wallcount++;}
					if (skullkeycount>0); 
					{skullkeycount--;
					System.out.println("You walk through the door");}}	
				
			if (currenttoken.equalsIgnoreCase("shakes")){
				if (map[newx][newy][oldz][olda].equals("The ground shakes and a strange rat approaches"))
					{z=9;}
			
			map[newx][newy][oldz][olda]="";}
			
			
			if (currenttoken.equalsIgnoreCase("BEATEN")){Thread.sleep(2000); 
			for (int star=0; star<100; star++)	{System.out.println("********************************************************************************");
			Thread.sleep(50);}wincount++;
			}
					
			
			if (candlecount1==4)
			{map [3] [18] [3] [1]="You fall into a pit";
			 map [3] [19] [3] [1]="You fall into a pit";	
			 map [4] [18] [3] [1]="You fall into a pit";
			 map [4] [19] [3] [1]="You fall into a pit";
			 if (pitcheck==0)
			 {System.out.println("The alter in the center of the room opens, revealing a pit");
			 pitcheck++;}}	
				}
				
				
			if (wallcount>0)
			{oldx=oldx; oldy=oldy; oldx1=oldx1; oldy1=oldy1;}
			if (wallcount<1) {oldx=newx; oldy=newy; oldy1=newy1; oldx1=newx1;}
			if (chestcount>0) {System.out.println("You find a "+Drop[droptable]+"!");
						drop[droptable]=drop[droptable]+1;}
			newx=oldx; newy=oldy;
			newx1=oldx1; newy1=oldy1;	
			
			
			if (gravedig==1) {gravecheck=gen.nextInt(6);
				if (gravecheck==0) {System.out.println("You break into a casket and a skeleton jumps out"); z=8;}
				if (gravecheck==1) {System.out.println("You break into a casket and a spider jumps out"); z=4;}
				if (gravecheck>=2&&gravecheck<=4) {System.out.println("The grave is empty, probably already been looted");}
				if (gravecheck==5)
					{System.out.println("You dig up the grave, finding a skull key");
					skullkeycount++;}
					gravedig=0;}
		if (oldz==1) joe.Walk(newx1,newy1);
		if (oldz==2) joe1.Walk(newx1,newy1);	

			
		if (z==0)
		{System.out.println("A wolf approaches");
			d=150;
			while(c>0&&d>0)
			{for (int check=0; check<4; check++)
				{
				checkdrop=checkdrop+drop[check];
				hitmultiplier=2+checkdrop;}
			System.out.println(hitmultiplier);
			a=gen.nextInt(10*hitmultiplier+1);
			b=gen.nextInt(11);
			System.out.println("Hit A to use a normal attack, F to use fire blast, T to use thunder,\n I to use ice, and Q to Quit");
			choice=Keyboard.readString();
			if (choice.equalsIgnoreCase(fire))
			{a=gen.nextInt(21)+20;
			mana=mana-20;}
			if (choice.equalsIgnoreCase(attack))
				a=gen.nextInt(21);
			if (choice.equalsIgnoreCase(thunder))
			{a=gen.nextInt(21)+30;
			mana=mana-30;
			System.out.println(a);}
			if (choice.equalsIgnoreCase(ice))
			{a=((gen.nextInt(21))+10);
			mana=mana-10;}
			if (choice.equalsIgnoreCase(quit))
				break;
			if (choice.equalsIgnoreCase("hax"))
			 a=1000000000;
			System.out.println("You hit a "+a);
			d=d-a;
			Thread.sleep(2000);
			System.out.println("The wolf has "+d+" hp left");
			Thread.sleep(2000);
			if(d>0)
			{System.out.println("The wolf hits a "+b);
			c=c-b;
			Thread.sleep(2000);
			System.out.println("You have "+c+" hp left");
			System.out.println("You have "+mana+" mana left");
			checkdrop=0;
			Thread.sleep(2000);}}
			if(c<=0)
			System.out.println("You lose!");
			if(d<=0)
			{System.out.println("You win!");
				exp=exp+51;
				x=0;
				while (true)
  						{y=x-1;
  						f=Math.pow(x,3)+150*x;
  						v=Math.pow(y,3)+150*y;
  						if (v<=exp&&exp<f)
  						break;
  						x++;}
						System.out.println("You are level: "+(x));
						exptogo=(Math.pow(x+1,3)+150*(x+1))-exp;
						expleft= (int) exptogo;	
						System.out.println("You have: "+expleft+" exp to level!");							
						System.out.println("The monster drops a "+Drop[droptable]+"!");
						drop[droptable]=drop[droptable]+1;
						}}


		if (z==1)
		{System.out.println("A bear approaches");
			d=500;
			while(c>0&&d>0)
			{for (int check=0; check<4; check++)
				{
				checkdrop=checkdrop+drop[check];
				hitmultiplier=2+checkdrop;}
			a=gen.nextInt(10*hitmultiplier+1);
			b=gen.nextInt(6);
			System.out.println("Hit A to use a normal attack, F to use fire blast, T to use thunder,\n I to use ice, and Q to Quit");
			choice=Keyboard.readString();
			if (choice.equalsIgnoreCase(fire))
			{a=(gen.nextInt(21))+20;
			mana=mana-20;}
			if (choice.equalsIgnoreCase(attack))
				a=gen.nextInt(21);
			if (choice.equalsIgnoreCase(thunder))
			{a=(gen.nextInt(21))+30;
			mana=mana-30;}
			if (choice.equalsIgnoreCase(ice))
			{a=(gen.nextInt(21))+10;
			mana=mana-10;}
			if (choice.equalsIgnoreCase(quit))
				break;
			if (choice.equalsIgnoreCase("hax"))
			 a=1000000000;	
			System.out.println("You hit a "+a);
			d=d-a;
			Thread.sleep(2000);
			System.out.println("The bear has "+d+" hp left");
			Thread.sleep(2000);
			if(d>0)
			{System.out.println("The bear hits a "+b);
			c=c-b;
			Thread.sleep(2000);
			System.out.println("You have "+c+" hp left");
			System.out.println("You have "+mana+" mana left");
			checkdrop=0;
			Thread.sleep(2000);}}
			if(c<=0)
			System.out.println("You lose!");
			if(d<=0)
			{System.out.println("You win!");
				exp=exp+51;
				x=0;
				while (true)
  						{y=x-1;
  						f=Math.pow(x,3)+150*x;
  						v=Math.pow(y,3)+150*y;
  						if (v<=exp&&exp<f)
  						break;
  						x++;}
						System.out.println("You are level: "+(x));
						exptogo=(Math.pow(x+1,3)+150*(x+1))-exp;
						expleft= (int) exptogo;	
						System.out.println("You have: "+expleft+" exp to level!");
						System.out.println("The monster drops a "+Drop[droptable]+"!");
						drop[droptable]=drop[droptable]+1;
					}}

		if (z==2)
		{System.out.println("A scorpion approaches");
			d=100;
			while(c>0&&d>0)
			{for (int check=0; check<4; check++)
				{
				checkdrop=checkdrop+drop[check];
				hitmultiplier=2+checkdrop;}
			a=gen.nextInt(10*hitmultiplier+1);
			b=gen.nextInt(51);
			System.out.println("Hit A to use a normal attack, F to use fire blast, T to use thunder,\n I to use ice, and Q to Quit");
			choice=Keyboard.readString();
			if (choice.equalsIgnoreCase(fire))
			{a=(gen.nextInt(21))+20;
			mana=mana-20;}
			if (choice.equalsIgnoreCase(attack))
				a=gen.nextInt(21);
			if (choice.equalsIgnoreCase(thunder))
			{a=(gen.nextInt(21))+30;
			mana=mana-30;}
			if (choice.equalsIgnoreCase(ice))
			{a=(gen.nextInt(21))+10;
			mana=mana-10;}
			if (choice.equalsIgnoreCase(quit))
				break;
			if (choice.equalsIgnoreCase("hax"))
			 a=1000000000;	
			System.out.println("You hit a "+a);
			d=d-a;
			Thread.sleep(2000);
			System.out.println("The scorpion has "+d+" hp left");
			Thread.sleep(2000);
			if(d>0)
			{System.out.println("The scorpion hits a "+b);
			c=c-b;
			Thread.sleep(2000);
			System.out.println("You have "+c+" hp left");
			System.out.println("You have "+mana+" mana left");
			checkdrop=0;
			Thread.sleep(2000);}}
			if(c<=0)
			System.out.println("You lose!");
			if(d<=0)
			{System.out.println("You win!");
				exp=exp+51;
				x=0;
				while (true)
  						{y=x-1;
  						f=Math.pow(x,3)+150*x;
  						v=Math.pow(y,3)+150*y;
  						if (v<=exp&&exp<f)
  						break;
  						x++;}
						System.out.println("You are level: "+(x));
						exptogo=(Math.pow(x+1,3)+150*(x+1))-exp;
						expleft= (int) exptogo;	
						System.out.println("You have: "+expleft+" exp to level!");
						System.out.println("The monster drops a "+Drop[droptable]+"!");
						drop[droptable]=drop[droptable]+1;	
					}}


		if (z==3)
		{System.out.println("A bandit approaches");
			d=200;
			while(c>0&&d>0)
			{for (int check=0; check<4; check++)
				{
				checkdrop=checkdrop+drop[check];
				hitmultiplier=2+checkdrop;}
			a=gen.nextInt(10*hitmultiplier+1);
			b=gen.nextInt(21);
			System.out.println("Hit A to use a normal attack, F to use fire blast, T to use thunder,\n I to use ice, and Q to Quit");
			choice=Keyboard.readString();
			if (choice.equalsIgnoreCase(fire))
			{a=(gen.nextInt(21))+20;
			mana=mana-20;}
			if (choice.equalsIgnoreCase(attack))
				a=gen.nextInt(21);
			if (choice.equalsIgnoreCase(thunder))
			{a=(gen.nextInt(21))+30;
			mana=mana-30;}
			if (choice.equalsIgnoreCase(ice))
			{a=(gen.nextInt(21))+10;
			mana=mana-10;}
			if (choice.equalsIgnoreCase(quit))
				break;
			if (choice.equalsIgnoreCase("hax"))
			 a=1000000000;
			System.out.println("You hit a "+a);
			d=d-a;
			Thread.sleep(2000);
			System.out.println("The bandit has "+d+" hp left");
			Thread.sleep(2000);
			if(d>0)
			{System.out.println("The bandit hits a "+b);
			c=c-b;
			Thread.sleep(2000);
			System.out.println("You have "+c+" hp left");
			System.out.println("You have "+mana+" mana left");
			checkdrop=0;
			Thread.sleep(2000);}}
			if(c<=0)
			System.out.println("You lose!");
			if(d<=0)
			{System.out.println("You win!");
				exp=exp+51;
				x=0;
				while (true)
  						{y=x-1;
  						f=Math.pow(x,3)+150*x;
  						v=Math.pow(y,3)+150*y;
  						if (v<=exp&&exp<f)
  						break;
  						x++;}
						System.out.println("You are level: "+(x));
						exptogo=(Math.pow(x+1,3)+150*(x+1))-exp;
						expleft= (int) exptogo;	
						System.out.println("You have: "+expleft+" exp to level!");
						System.out.println("The monster drops a "+Drop[droptable]+"!");
						drop[droptable]=drop[droptable]+1;	
					}}


		if (z==4)
		{System.out.println("A giant spider approaches");
			d=300;
			while(c>0&&d>0)
			{for (int check=0; check<4; check++)
				{
				checkdrop=checkdrop+drop[check];
				hitmultiplier=2+checkdrop;}
			a=gen.nextInt(10*hitmultiplier+1);
			b=gen.nextInt(11);
			System.out.println("Hit A to use a normal attack, F to use fire blast, T to use thunder,\n I to use ice, and Q to Quit");
			choice=Keyboard.readString();
			if (choice.equalsIgnoreCase(fire))
			{a=(gen.nextInt(21))+20;
			mana=mana-20;}
			if (choice.equalsIgnoreCase(attack))
				a=gen.nextInt(21);
			if (choice.equalsIgnoreCase(thunder))
			{a=(gen.nextInt(21))+30;
			mana=mana-30;}
			if (choice.equalsIgnoreCase(ice))
			{a=(gen.nextInt(21))+10;
			mana=mana-10;}
			if (choice.equalsIgnoreCase(quit))
				break;
			if (choice.equalsIgnoreCase("hax"))
			 a=1000000000;	
			System.out.println("You hit a "+a);
			d=d-a;
			Thread.sleep(2000);
			System.out.println("The giant spider has "+d+" hp left");
			Thread.sleep(2000);
			if(d>0)
			{System.out.println("The giant spider hits a "+b);
			c=c-b;
			Thread.sleep(2000);
			System.out.println("You have "+c+" hp left");
			System.out.println("You have "+mana+" mana left");
			checkdrop=0;
			Thread.sleep(2000);}}
			if(c<=0)
			System.out.println("You lose!");
			if(d<=0)
			{System.out.println("You win!");
				exp=exp+51;
				x=0;
				while (true)
  						{y=x-1;
  						f=Math.pow(x,3)+150*x;
  						v=Math.pow(y,3)+150*y;
  						if (v<=exp&&exp<f)
  						break;
  						x++;}
						System.out.println("You are level: "+(x));
						exptogo=(Math.pow(x+1,3)+150*(x+1))-exp;
						expleft= (int) exptogo;	
						System.out.println("You have: "+expleft+" exp to level!");
						System.out.println("The monster drops a "+Drop[droptable]+"!");
						drop[droptable]=drop[droptable]+1;
					}}


		if (z==5)
		{System.out.println("A DRAGON approaches");
			d=1000;
			while(c>0&&d>0)
			{for (int check=0; check<4; check++)
				{
				checkdrop=checkdrop+drop[check];
				hitmultiplier=2+checkdrop;}
			a=gen.nextInt(1);
			b=gen.nextInt(201);
			System.out.println("Hit A to use a normal attack, F to use fire blast, T to use thunder,\n I to use ice, and Q to Quit");
			choice=Keyboard.readString();
			if (choice.equalsIgnoreCase(fire))
			{a=(gen.nextInt(2))+20;
			mana=mana-20;}
			if (choice.equalsIgnoreCase(attack))
				a=gen.nextInt(2);
			if (choice.equalsIgnoreCase(thunder))
			{a=(gen.nextInt(21))+30;
			mana=mana-30;}
			if (choice.equalsIgnoreCase(ice))
			{a=(gen.nextInt(2000))+500;
			mana=mana-10;}
			if (choice.equalsIgnoreCase(quit))
				break;
			if (choice.equalsIgnoreCase("hax"))
			 a=1000000000;
			System.out.println("You hit a "+a);
			d=d-a;
			Thread.sleep(2000);
			System.out.println("The DRAGON has "+d+" hp left");
			Thread.sleep(2000);
			if(d>0)
			{System.out.println("The DRAGON hits a "+b);
			c=c-b;
			Thread.sleep(2000);
			System.out.println("You have "+c+" hp left");
			System.out.println("You have "+mana+" mana left");
			checkdrop=0;
			Thread.sleep(2000);}}
			if(c<=0)
			System.out.println("You lose!");
			if(d<=0)
			{System.out.println("You win!");
				exp=exp+101;
				x=0;
				while (true)
  						{y=x-1;
  						f=Math.pow(x,3)+150*x;
  						v=Math.pow(y,3)+150*y;
  						if (v<=exp&&exp<f)
  						break;
  						x++;}
						System.out.println("You are level: "+(x));
						exptogo=(Math.pow(x+1,3)+150*(x+1))-exp;
						expleft= (int) exptogo;	
						System.out.println("You have: "+expleft+" exp to level!");
						System.out.println("The monster drops a "+Drop[droptable]+"!");
						drop[droptable]=drop[droptable]+1;
					}}


		if (z==6)
		{System.out.println("A giant rat approaches");
			d=100;
			while(c>0&&d>0)
			{for (int check=0; check<4; check++)
				{
				checkdrop=checkdrop+drop[check];
				hitmultiplier=2+checkdrop;}
			a=gen.nextInt(10*hitmultiplier+1);
			b=gen.nextInt(6);
			System.out.println("Hit A to use a normal attack, F to use fire blast, T to use thunder,\n I to use ice, and Q to Quit");
			choice=Keyboard.readString();
			if (choice.equalsIgnoreCase(fire))
			{a=(gen.nextInt(21))+20;
			mana=mana-20;}
			if (choice.equalsIgnoreCase(attack))
				a=gen.nextInt(11);
			if (choice.equalsIgnoreCase(thunder))
			{a=(gen.nextInt(21))+30;
			mana=mana-30;}
			if (choice.equalsIgnoreCase(ice))
			{a=(gen.nextInt(21))+10;
			mana=mana-10;}
			if (choice.equalsIgnoreCase(quit))
				break;
			if (choice.equalsIgnoreCase("hax"))
			 	a=1000000000;		
			System.out.println("You hit a "+a);
			d=d-a;
			Thread.sleep(2000);
			System.out.println("The giant rat has "+d+" hp left");
			Thread.sleep(2000);
			if(d>0)
			{System.out.println("The giant rat hits a "+b);
			c=c-b;
			Thread.sleep(2000);
			System.out.println("You have "+c+" hp left");
			System.out.println("You have "+mana+" mana left");
			checkdrop=0;
			Thread.sleep(2000);}}
			if(c<=0)
			System.out.println("You lose!");
			if(d<=0)
			{System.out.println("You win!");
				exp=exp+51;
				x=0;
				while (true)
  						{y=x-1;
  						f=Math.pow(x,3)+150*x;
  						v=Math.pow(y,3)+150*y;
  						if (v<=exp&&exp<f)
  						break;
  						x++;}
						System.out.println("You are level: "+(x));
						exptogo=(Math.pow(x+1,3)+150*(x+1))-exp;
						expleft= (int) exptogo;	
						System.out.println("You have: "+expleft+" exp to level!");
						System.out.println("The monster drops a "+Drop[droptable]+"!");
						drop[droptable]=drop[droptable]+1;
						
						
					}}
					
					
		if (z==7)
		{System.out.println("A DEMON approaches");
			d=300;
			while(c>0&&d>0)
			{for (int check=0; check<4; check++)
				{
				checkdrop=checkdrop+drop[check];
				hitmultiplier=2+checkdrop;}
			a=gen.nextInt(10*hitmultiplier+1);
			b=gen.nextInt(11);
			spec=gen.nextInt(51);
			System.out.println("Hit A to use a normal attack, F to use fire blast, T to use thunder,\n I to use ice, and Q to Quit");
			choice=Keyboard.readString();
			if (choice.equalsIgnoreCase(fire))
			{a=(gen.nextInt(21))-60;
			mana=mana-20;}
			if (choice.equalsIgnoreCase(attack))
				a=gen.nextInt(21);
			if (choice.equalsIgnoreCase(thunder))
			{a=(gen.nextInt(21))-50;
			mana=mana-30;}
			if (choice.equalsIgnoreCase(ice))
			{a=(gen.nextInt(21))+30;
			mana=mana-10;}
			if (choice.equalsIgnoreCase(quit))
				break;
			if (choice.equalsIgnoreCase("hax"))
			 	a=1000000000;		
			System.out.println("You hit a "+a);
			d=d-a;
			Thread.sleep(2000);
			System.out.println("The DEMON has "+d+" hp left");
			Thread.sleep(2000);
			if(d>0)
			{checkspec=gen.nextInt(2);
			if (checkspec==0)
			{System.out.println("The DEMON hits a "+b);
			c=c-b;
			Thread.sleep(2000);}
			if (checkspec==1){System.out.println("THE DEMON ATTACKS YOU WITH A FIRE BLAST; HITTING A "+spec+"!");
				c=c-spec;
				Thread.sleep(2000);}
			System.out.println("You have "+c+" hp left");
			System.out.println("You have "+mana+" mana left");
			checkdrop=0;
			Thread.sleep(2000);}}
			if(c<=0)
			System.out.println("You lose!");
			if(d<=0)
			{System.out.println("You win!");
				exp=exp+151;
				x=0;
				while (true)
  						{y=x-1;
  						f=Math.pow(x,3)+150*x;
  						v=Math.pow(y,3)+150*y;
  						if (v<=exp&&exp<f)
  						break;
  						x++;}
						System.out.println("You are level: "+(x));
						exptogo=(Math.pow(x+1,3)+150*(x+1))-exp;
						expleft= (int) exptogo;	
						System.out.println("You have: "+expleft+" exp to level!");
						System.out.println("The monster drops a "+Drop[droptable]+"!");
						drop[droptable]=drop[droptable]+1;	
					}}	
					
		if (z==8)
		{System.out.println("A skeleton approaches");
			d=100;
			while(c>0&&d>0)
			{for (int check=0; check<4; check++)
				{
				checkdrop=checkdrop+drop[check];
				hitmultiplier=2+checkdrop;}
			a=gen.nextInt(10*hitmultiplier+1);
			b=gen.nextInt(11);
			spec2=gen.nextInt(21);
			System.out.println("Hit A to use a normal attack, F to use fire blast, T to use thunder,\n I to use ice, and Q to Quit");
			choice=Keyboard.readString();
			if (choice.equalsIgnoreCase(fire))
			{a=(gen.nextInt(21))+20;
			mana=mana-20;
			System.out.println("The fire scorches the decaying bones");}
			if (choice.equalsIgnoreCase(attack))
				a=gen.nextInt(31);
			if (choice.equalsIgnoreCase(thunder))
			{a=(gen.nextInt(2));
			mana=mana-30;
			System.out.println("The skeleton lacks the bodily fluids to be affected");}
			if (choice.equalsIgnoreCase(ice))
			{a=(gen.nextInt(1));
			mana=mana-10;
			System.out.println("The skeleton has no organs to chill");}
			if (choice.equalsIgnoreCase(quit))
				break;
			if (choice.equalsIgnoreCase("hax"))
				 a=1000000000;	
			System.out.println("You hit a "+a);
			d=d-a;
			Thread.sleep(2000);
			System.out.println("The skeleton has "+d+" hp left");
			Thread.sleep(2000);
			if(d>0)
			{checkspec=gen.nextInt(2);
			if (checkspec==0)
			{System.out.println("The skeleton hits a "+b);
			c=c-b;
			Thread.sleep(2000);}
			if (checkspec==1){System.out.println("The skeleton dislodges and throws its skull at you\n Sapping "+spec2+" hp to keep as his own!");
				c=c-spec2;
				d=d+spec2;
				Thread.sleep(2000);}
			System.out.println("You have "+c+" hp left");
			System.out.println("You have "+mana+" mana left");
			checkdrop=0;
			Thread.sleep(2000);}}
			if(c<=0)
			System.out.println("You lose!");
			if(d<=0)
			{System.out.println("You win!");
				exp=exp+151;
				x=0;
				while (true)
  						{y=x-1;
  						f=Math.pow(x,3)+150*x;
  						v=Math.pow(y,3)+150*y;
  						if (v<=exp&&exp<f)
  						break;
  						x++;}
						System.out.println("You are level: "+(x));
						exptogo=(Math.pow(x+1,3)+150*(x+1))-exp;
						expleft= (int) exptogo;	
						System.out.println("You have: "+expleft+" exp to level!");
						System.out.println("The monster drops a "+Drop[droptable]+"!");
						drop[droptable]=drop[droptable]+1;	
					}}					
					

	if (z==9)
		{System.out.println("A very peculiar rat wobbles toward you");
			d=100;
			while(c>0&&d>0)
			{for (int check=0; check<4; check++)
				{
				checkdrop=checkdrop+drop[check];
				hitmultiplier=2+checkdrop;}
			a=gen.nextInt(10*hitmultiplier+1);
			b=gen.nextInt(11);
			spec2=gen.nextInt(21);
			System.out.println("Hit A to use a normal attack, F to use fire blast, T to use thunder,\n I to use ice, and Q to Quit");
			choice=Keyboard.readString();
			if (choice.equalsIgnoreCase(fire))
			{a=(gen.nextInt(11))+5;
			mana=mana-20;
			System.out.println("The fire burns the rat");}
			if (choice.equalsIgnoreCase(attack))
			a=gen.nextInt(10*hitmultiplier+1);
			if (choice.equalsIgnoreCase(thunder))
			{a=(gen.nextInt(15))+5;
			mana=mana-30;
			System.out.println("The thunder electricutes the rat");}
			if (choice.equalsIgnoreCase(ice))
			{a=(gen.nextInt(1));
			mana=mana-10;
			System.out.println("The ice has no effect on the rat");}
			if (choice.equalsIgnoreCase(quit))
				break;
			if (choice.equalsIgnoreCase("hax"))
				 a=1000000000;	
			System.out.println("You hit a "+a);
			d=d-a;
			Thread.sleep(2000);
			System.out.println("The rat has "+d+" hp left");
			Thread.sleep(2000);
			if(d>0)
			{System.out.println("The rat hits a "+b);
			c=c-b;
			Thread.sleep(2000);}
			System.out.println("You have "+c+" hp left");
			System.out.println("You have "+mana+" mana left");
			checkdrop=0;
			Thread.sleep(2000);}
			if(c<=0)
			System.out.println("You lose!");
			if(d<=0)
			{System.out.println("You kill the rat!");
				exp=exp+151;
				x=0;
				while (true)
  						{y=x-1;
  						f=Math.pow(x,3)+150*x;
  						v=Math.pow(y,3)+150*y;
  						if (v<=exp&&exp<f)
  						break;
  						x++;}
						System.out.println("You are level: "+(x));
						exptogo=(Math.pow(x+1,3)+150*(x+1))-exp;
						expleft= (int) exptogo;	
						System.out.println("You have: "+expleft+" exp to level!");
						System.out.println("The monster drops a "+Drop[droptable]+"!");
						drop[droptable]=drop[droptable]+1; z=10;
					}}				
					
				
					
	if (z==10)
		{System.out.println("The skin of the rat peels back, revealing undead flesh");
			d=200;
			while(c>0&&d>0)
			{for (int check=0; check<4; check++)
				{
				checkdrop=checkdrop+drop[check];
				hitmultiplier=2+checkdrop;}
			a=gen.nextInt(10*hitmultiplier+1);
			b=gen.nextInt(11);
			spec2=gen.nextInt(21);
			System.out.println("Hit A to use a normal attack, F to use fire blast, T to use thunder,\n I to use ice, and Q to Quit");
			choice=Keyboard.readString();
			if (choice.equalsIgnoreCase(fire))
			{a=(gen.nextInt(11))+5;
			mana=mana-20;
			System.out.println("The fire burns the rat");}
			if (choice.equalsIgnoreCase(attack))
			a=gen.nextInt(10*hitmultiplier+1);
			if (choice.equalsIgnoreCase(thunder))
			{a=(gen.nextInt(15))+5;
			mana=mana-30;
			System.out.println("The thunder electricutes the rat");}
			if (choice.equalsIgnoreCase(ice))
			{a=(gen.nextInt(1));
			mana=mana-10;
			System.out.println("The ice has no effect on the rat");}
			if (choice.equalsIgnoreCase(quit))
				break;
			if (choice.equalsIgnoreCase("hax"))
				 a=1000000000;	
			System.out.println("You hit a "+a);
			d=d-a;
			Thread.sleep(2000);
			System.out.println("The rat has "+d+" hp left");
			Thread.sleep(2000);
			if(d>0)
			{checkspec=gen.nextInt(2);
			if (checkspec==0)
			{System.out.println("The rat hits a "+b);
			c=c-b;
			Thread.sleep(2000);}
			if (checkspec==1)
			{System.out.println("The rat bites you, leaving you paralyzed");
			for (int para=5; para>0; para--)
			{System.out.println("The rat hits a "+10);
			c=c-10;
			System.out.println("You have "+c+" hp left");
			System.out.println("You have "+mana+" mana left"+"\n");
			Thread.sleep(2000);
			if (c<=0) break;}
			Thread.sleep(2000);}
			System.out.println("You have "+c+" hp left");
			System.out.println("You have "+mana+" mana left");
			checkdrop=0;
			Thread.sleep(2000);
			}
		if(c<=0)
			System.out.println("You lose!");
			if(d<=0)
			{System.out.println("You win!");
				exp=exp+151;
				x=0;
				while (true)
  						{y=x-1;
  						f=Math.pow(x,3)+150*x;
  						v=Math.pow(y,3)+150*y;
  						if (v<=exp&&exp<f)
  						break;
  						x++;}
						System.out.println("You are level: "+(x));
						exptogo=(Math.pow(x+1,3)+150*(x+1))-exp;
						expleft= (int) exptogo;	
						System.out.println("You have: "+expleft+" exp to level!");
						System.out.println("The monster drops a "+Drop[droptable]+"!");
						drop[droptable]=drop[droptable]+1;	
					}}}						
					
					
			if (wincount==0) break;		
			if (oldz==1) world.show();		
			if (oldz==2) world1.show();
						
			System.out.println("Pick a direction to walk: A for left, D for right, W for foward, or S for back");
			direction=Keyboard.readString();
			if (direction.equalsIgnoreCase("A"))
				{newx=oldx-1;
				newy1=oldy1-1;}
			if (direction.equalsIgnoreCase("D"))
				{newx=oldx+1;
				newy1=oldy1+1;}
			if (direction.equalsIgnoreCase("W"))
				{newy=oldy-1;
				newx1=oldx1-1;}
			if (direction.equalsIgnoreCase("S"))
				{newy=oldy+1;
				newx1=oldx1+1;}
			if (newx<0)
				{System.out.println("You walk into a wall");
				newx=0;
				}
			if (newy<0)
				{System.out.println("You walk into a wall");
				newy=0;
				}
			if (oldz==1) world.show();
			if (oldz==2) world1.show();		
			if (map [newx][newy][oldz][olda]!=null)			
			System.out.println(map [newx][newy][oldz][olda]+"\n");		
			if (s1.getLocation()==null)
			{if ((newx==5)&&(newy==16))
			System.out.println("");
        		else
					s1.putSelfInGrid(Map,new Location(16,5));}
			if (oldz==1) world.show();
			if (oldz==2) world1.show();
        	if (s2.getLocation()==null)
        	{if ((newx==15)&&(newy==13))
        	System.out.println("");
        		else
        			s2.putSelfInGrid(Map,new Location(13,15));}
			if (oldz==1) world.show();
			if (oldz==2) world1.show();
			if (joe.getLocation()==null)
				joe.putSelfInGrid(Map, new Location(newy,newx));		
					
			if (s3.getLocation()==null)
			{if ((newx==13)&&(newy==15))
			System.out.println("");
        		else
					s3.putSelfInGrid(Map1,new Location(13,15));}
			if (oldz==1) world.show();
			if (oldz==2) world1.show();
			
        	if (s4.getLocation()==null)
        	{if ((newx==11)&&(newy==13))
        	System.out.println("");
        		else
        			s4.putSelfInGrid(Map1,new Location(11,13));}
			if (oldz==1) world.show();
			if (oldz==2) world1.show();
			if (joe1.getLocation()==null)
				joe1.putSelfInGrid(Map1, new Location(newy,newx));						
					
					
					
					}}}
