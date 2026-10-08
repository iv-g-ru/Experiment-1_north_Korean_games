package org.a_kerman.game1.base;

/**
 *
 * @author iv-g-ru
 */
public class Resource {

    private final String name;

    private final double efficien_extract;

    public double getEfficien_extract() {
        return efficien_extract;
    }

    public String getName() {
        return name;
    }

    public Resource(String name, double efficien_extract) {
        this.name = name;
        this.efficien_extract = efficien_extract;
    }

}
