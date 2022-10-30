package org.itmo.lab2;
import ru.ifmo.se.pokemon.*;
class BattlePok{
	public static void main(String[] args){
		Battle b = new Battle();
		Pokemon p1 = new Pokemon("Чужой",1);
		Pokemon p2 = new Pokemon("Хищник",1);
		Pokemon p3 = new Virision("Халк",2);
		Pokemon p4 = new Scyther("Дикарь",2);
		Pokemon p5 = new Scizor("Силач",1);
		Pokemon p6 = new Happiny("Цветочек",2);
		Pokemon p7 = new Blissey("Гуру",1);
		Pokemon p8 = new Chansey("Ветерок",2);
		b.addAlly(p1);
		b.addFoe(p2);
		b.addAlly(p3);
		b.addFoe(p4);
		b.addAlly(p5);
		b.addFoe(p6);
		b.addFoe(p7);
		b.addAlly(p8);
		b.go();



	}
}