import java.util.ArrayList;

public class Pokemon {
    private String name;
    private int number;
    private int combat_power;
    private int health_points;

    public Pokemon(String pName, int pNumber, int pCombat_Power, int pHealth_Points) {
        name = pName;
        number = pNumber;
        combat_power = pCombat_Power;
        health_points = pHealth_Points;
    }

    public void power_up() {
        combat_power += 30;
        health_points += 2;
    }

    public String toString() {
        return "Name: " + name + "; " + "Number: 1" + Integer.toString(number) + "; " + "Combat Power: " + Integer.toString(combat_power) + "; " + "Health Points: " + Integer.toString(health_points);
    }

    public static void main(String[] args) {
        ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();

        Pokemon pokemon1;
        pokemon1 = new Pokemon("Bulbasaur", 1, 252, 43);
        Pokemon pokemon2 = new Pokemon("Eevee", 133, 567, 78);

        pokedex.add(pokemon1);
        pokedex.add(pokemon2);

        for (Pokemon p: pokedex) {
            System.out.println(p.toString());
        }

        pokemon1.power_up(); // notice that this refers to the same Pokemon that pokedex[0] refers to

        System.out.println("After powering up:");

        for (Pokemon p: pokedex) {
            System.out.println(p.toString());
        }

    }

}