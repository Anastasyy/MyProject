package org.itmo.lab2;
import ru.ifmo.se.pokemon.*;
public class Scizor extends Pokemon{
	public Scizor(String name, int level){
		super(name,level);
		setType(Type.GRASS,Type.POISON);
		setStats(1,2,2,5,6,3);
		setMove(new Rest(),new XScissor(),new Leer(),new Venoshock ());
	}
}