package fcu.iecs.oop.pokemon;

public class Main {

	public static void main(String[] args) {
		Pokemon pkm1 = new Bulbasaur(123,"I am Bulbasaur", PokemonType.GRASS );
	    Pokemon pkm2 = new Charmander(456,"I am Charmander", PokemonType.FIRE);
	    Pokemon pkm3 = new Psyduck(89,"I am Psyduck", PokemonType.WATER);
	    GYM gym = new GYM();
	    gym.fight(pkm1);
	    gym.fight(pkm2);
	    gym.fight(pkm3);


	}

}
