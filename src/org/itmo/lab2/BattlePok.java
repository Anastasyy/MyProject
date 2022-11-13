package org.itmo.lab2;
import ru.ifmo.se.pokemon.*;
class BattlePok{
	public static void main(String[] args){
		Battle battlePokemons = new Battle();
		Pokemon onePok = new Pokemon("Чужой",1);
		Pokemon twoPok = new Pokemon("Хищник",1);
		Pokemon thrPok = new Virision("Халк",2);
		Pokemon thoPok = new Scyther("Дикарь",2);
		Pokemon fivPok = new Scizor("Силач",1);
		Pokemon sixPok = new Happiny("Цветочек",2);
		Pokemon sevPok = new Blissey("Гуру",1);
		Pokemon eigPok = new Chansey("Ветерок",2);

		battlePokemons.addAlly(onePok);
		battlePokemons.addAlly(thrPok);
		battlePokemons.addAlly(fivPok);
		battlePokemons.addAlly(eigPok);

		battlePokemons.addFoe(twoPok);
		battlePokemons.addFoe(thoPok);
		battlePokemons.addFoe(sixPok);
		battlePokemons.addFoe(sevPok);
		battlePokemons.go();



	}
}