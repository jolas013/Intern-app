package org.development.jcc.myapplication_intern;

public class Country  {
    String countryname;
    String image;

    public Country(String countryname, String image) {
        this.countryname = countryname;
        this.image = image;
    }

    public Country() {
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
