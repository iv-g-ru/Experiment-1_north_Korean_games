package org.a_kerman.game1.base;

/**
 *
 * @author iv-g-ru
 */
public abstract class Structure {

    protected final Region region;

    public Structure(Region region) {
        this.region = region;
    }

    public Region getRegion() {
        return region;
    }

    public abstract void action();

}
