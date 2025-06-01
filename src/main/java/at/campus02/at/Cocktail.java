package at.campus02.at;

import java.util.List;

public class Cocktail extends Drink {

    private List<Liquid> ingredients;


    /**
     * Creates a Cocktail object with given name and
     * ingredients
     *
     * @param name name of drink
     * @param ingredients list of ingredients
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    /**
     * Returns total amount (in litres) of a cocktail
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return ingredients.stream().mapToDouble(Liquid::getVolume).sum();
    }

    /**
     * Returns alcohol volume percent in relation to the total volume
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        if (totalVolume == 0) return 0;
        double alcoholVolume = ingredients.stream().mapToDouble(l -> l.getVolume() * l.getAlcoholPercent() / 100).sum();
        return (alcoholVolume / totalVolume) * 100;
    }

    /**
     * Gives information if an ingredient is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        return ingredients.stream().anyMatch(l -> l.getAlcoholPercent() > 0);
    }
}
