package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World w = new World();
		w.show();
		
		Bug b1 = new Bug();
		Location bugloc1 = new Location(2,3);
		w.add(bugloc1, b1);
		
		Bug b2 = new Bug();
		b2.setColor(Color.BLUE);
		Location bugloc2 = new Location(7,4);
		b2.turn();
		w.add(bugloc2, b2);
		
		Flower f1 = new Flower();
		Location flowerloc1 = new Location(7,5);
		w.add(flowerloc1, f1);
	
		Flower f2 = new Flower();
		Location flowerloc2 = new Location(7,3);
		w.add(flowerloc2, f2);





		
		
		
	}

}
