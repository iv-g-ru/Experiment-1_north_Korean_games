package org.a_kerman.game1.base;

/**
 *
 * @author iv-g-ru
 */
public class Regiontype {

    private final org.a_kerman.game1.base.Resource[] resourcs;

    public Regiontype(Resource... resourcs) {
        this.resourcs = resourcs;
    }

    public org.a_kerman.game1.base.Resource[] getResourcs() {
        return resourcs;
    }

    public org.a_kerman.game1.base.Resource getResource(int index) {
        return this.resourcs[index];
    }

}
