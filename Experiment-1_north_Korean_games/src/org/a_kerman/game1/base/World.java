package org.a_kerman.game1.base;

/**
 *
 * @author iv-g-ru
 */
public class World {

    private final Region regions[][];

    public World(int r) {
        this.regions = new Region[r][r];
    }

    public Region getRegions(int x, int y) {
        return regions[(x + regions.length)%regions.length][(y + regions[0].length)%regions[0].length];
    }

}
