package org.itmo.lab2;
import ru.ifmo.se.pokemon.*;
public class Happiny extends Pokemon{
	public Happiny(String name, int level){
		super(name,level);
		setType(Type.ROCK,Type.WATER);
		setStats(1,3,6,5,6,3);
		setMove(new FireBlast(),new Psychic());
	}

}