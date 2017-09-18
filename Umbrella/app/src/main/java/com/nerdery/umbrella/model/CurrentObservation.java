package com.nerdery.umbrella.model;

import com.google.gson.annotations.SerializedName;

public class CurrentObservation {
    @SerializedName("display_location")
    public DisplayLocation displayLocation;

    @SerializedName("temp_f")
    public float tempFahrenheit;

    @SerializedName("temp_c")
    public float tempCelsius;

    public String weather;

    public String icon;
}