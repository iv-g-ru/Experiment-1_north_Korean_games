package org.a_kerman.game1.base;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iv-g-ru
 */
public class Region {

    public Region(Regiontype regiontype, Residents residents, Country country, Mail mail) {
        this.regiontype = regiontype;
        this.residents = residents;
        this.country = country;
        this.mail = mail;
    }

    private final List<Structure> structurs = new ArrayList<>();

    private final Regiontype regiontype;
    private Residents residents;
    private Country country;
    private Mail mail;

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    public List<Structure> getStructurs() {
        return structurs;
    }

    public Regiontype getRegiontype() {
        return regiontype;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Residents getResidents() {
        return residents;
    }

    public void setResidents(Residents residents) {
        this.residents = residents;
    }

    public int size() {
        return structurs.size();
    }

    public boolean contains(Object o) {
        return structurs.contains(o);
    }

    public Object[] toArray() {
        return structurs.toArray();
    }

    public boolean add(Structure e) {
        return structurs.add(e);
    }

    public boolean remove(Object o) {
        return structurs.remove(o);
    }

    public Structure get(int index) {
        return structurs.get(index);
    }

    public Structure remove(int index) {
        return structurs.remove(index);
    }

    public int indexOf(Object o) {
        return structurs.indexOf(o);
    }

}
