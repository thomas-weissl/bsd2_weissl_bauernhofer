package at.campus02.at;

/**
 * Represents a liquid ingredient used in drinks
 * Contains basic properties like name, volume and alcohol percentage
 */
public class Liquid {

    /**
     * The name of the liquid
     */
    private String name;

    /**
     * The volume of the liquid in liters
     */
    private double volume;

    /**
     * The alcohol content of the liquid in percent
     */
    private double alcoholPercent;

    /**
     * Constructs a new Liquid with specified name, volume and alcohol content
     *
     * @param name the name of the liquid
     * @param volume the volume in liters
     * @param alcoholPercent the alcohol content as a percentage
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Gets the name of the liquid
     *
     * @return the name of the liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the liquid
     *
     * @param name the new name of the liquid
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the volume of the liquid in liters
     *
     * @return the volume in liters
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the liquid in liters
     *
     * @param volume the new volume in liters
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Gets the alcohol content of the liquid in percent
     *
     * @return the alcohol percentage
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets the alcohol content of the liquid in percent
     *
     * @param alcoholPercent the new alcohol percentage
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
