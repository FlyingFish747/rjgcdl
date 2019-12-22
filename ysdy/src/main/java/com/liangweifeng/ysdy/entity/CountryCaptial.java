package com.liangweifeng.ysdy.entity;

import javax.persistence.*;

@Table(name = "cdt.country_captial")
public class CountryCaptial {
    @Id
    private String country1;

    private String country2;

    private String captial1;

    private String captial2;

    private String area;

    /**
     * @return country1
     */
    public String getCountry1() {
        return country1;
    }

    /**
     * @param country1
     */
    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    /**
     * @return country2
     */
    public String getCountry2() {
        return country2;
    }

    /**
     * @param country2
     */
    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    /**
     * @return captial1
     */
    public String getCaptial1() {
        return captial1;
    }

    /**
     * @param captial1
     */
    public void setCaptial1(String captial1) {
        this.captial1 = captial1;
    }

    /**
     * @return captial2
     */
    public String getCaptial2() {
        return captial2;
    }

    /**
     * @param captial2
     */
    public void setCaptial2(String captial2) {
        this.captial2 = captial2;
    }

    /**
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }
}