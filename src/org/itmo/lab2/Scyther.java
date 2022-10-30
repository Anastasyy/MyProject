package org.itmo.lab2;
import ru.ifmo.se.pokemon.*;
public class Scyther extends Pokemon{
	public Scyther(String name, int level){
		super(name,level);
		setType(Type.ICE,Type.DARK);
		setStats(2,2,3,5,4,5);
		setMove(new Rest(),new XScissor(),new Leer());
	}
}


