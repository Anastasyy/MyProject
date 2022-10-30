package org.itmo.lab2;
import ru.ifmo.se.pokemon.*;
public class Virision extends Pokemon {
		public Virision(String name, int level){
			super(name,level);
			setType(Type.FIRE,Type.FLYING);
			setStats(3, 4, 5, 4, 5, 6);
			setMove(new AerialAce(),new CalmMind(),new GigaDrain(), new Leer());

        }
    }
		



