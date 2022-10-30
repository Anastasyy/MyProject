package org.itmo.lab2;
import ru.ifmo.se.pokemon.*;
public class Chansey extends Pokemon{
	public Chansey(String name, int level){
		super(name,level);
		setType(Type.DRAGON,Type.STEEL);
		setStats(2,3,6,2,6,3);
		setMove(new FireBlast(),new Psychic(),new MudBomb());
	}

}