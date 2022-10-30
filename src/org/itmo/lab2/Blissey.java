package org.itmo.lab2;
import ru.ifmo.se.pokemon.*;
public class Blissey extends Pokemon{
	public Blissey(String name, int level){
		super(name,level);
		setType(Type.PSYCHIC,Type.BUG);
		setStats(1,1,6,4,6,3);
		setMove(new FireBlast(),new Psychic(),new MudBomb(),new Minimize());
	}

}