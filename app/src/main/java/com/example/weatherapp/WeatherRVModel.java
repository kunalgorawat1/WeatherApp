package com.example.weatherapp;

public class WeatherRVModel {
    private String time;
    private String temperatuere;
    private String icon;
    private String windSpeed;

    public WeatherRVModel(String time, String temperatuere, String icon, String windSpeed) {
        this.time = time;
        this.temperatuere = temperatuere;
        this.icon = icon;
        this.windSpeed = windSpeed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperatuere() {
        return temperatuere;
    }

    public void setTemperatuere(String temperatuere) {
        this.temperatuere = temperatuere;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }
}
