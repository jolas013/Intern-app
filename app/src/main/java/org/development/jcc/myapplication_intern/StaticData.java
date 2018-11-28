package org.development.jcc.myapplication_intern;

import java.util.ArrayList;
import java.util.List;

public class StaticData  {
    public static List<Country> countries;

    static {
        countries = new ArrayList<>();

        addCountry(new Country("ph","ph.png"));
        addCountry(new Country("India","india.png"));
        addCountry(new Country("Indonesia","indonesia.png"));
        addCountry(new Country("Japan","japan.png"));
        addCountry(new Country("China","china.png"));
        addCountry(new Country("Us","us.png"));
        addCountry(new Country("Russia","russia.png"));

    }

    static void addCountry(Country country)
    {
        countries.add(country);
    }
}
