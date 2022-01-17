package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;
    private final int MIN_FARENHEIT_TEMPERATURE = 32;
    private final double FARENHEIT_CONVERSION_VALUE = (9.0 / 5.0);
    private final int HOT_THRESHOLD = 30;
    private final int COLD_THRESHOLD = 10;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String displayTemperature() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, checkWeather(), checkTemperature(), convertCelciusToFarenheit());
    }

    public String checkWeather() {
        if (location == "London") {

            return "🌦";

        } else if (location == "California") {

            return "🌅";

        } else if (location == "Cape Town") {

            return "🌤";

        }
        return "🔆";
    }

    public String checkTemperature() {
        if (temperature > HOT_THRESHOLD) {

            return "It's too hot 🥵!";

        } else if (temperature < COLD_THRESHOLD) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

    private double convertCelciusToFarenheit() {
        double farenheitTemperature = FARENHEIT_CONVERSION_VALUE * temperature + MIN_FARENHEIT_TEMPERATURE;
        return farenheitTemperature;
    }

}
