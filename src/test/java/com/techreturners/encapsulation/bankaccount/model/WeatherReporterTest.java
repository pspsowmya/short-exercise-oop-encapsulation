package com.techreturners.encapsulation.bankaccount.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherReporterTest {

    @Test
    public void testDisplayTemperature() {
        WeatherReporter reporter = new WeatherReporter("London", 9);
        assertEquals("I am in London and it is 🌦. It's too cold 🥶!. The temperature in Fahrenheit is 48.2.", reporter.displayTemperature());

        WeatherReporter reporter1 = new WeatherReporter("California", 35);
        assertEquals("I am in California and it is 🌅. It's too hot 🥵!. The temperature in Fahrenheit is 95.", reporter1.displayTemperature());

        WeatherReporter reporter2 = new WeatherReporter("India", 50);
        assertEquals("I am in India and it is 🔆. It's too hot 🥵!. The temperature in Fahrenheit is 122.", reporter2.displayTemperature());

        WeatherReporter reporter3 = new WeatherReporter("Cape Town", 20);
        assertEquals("I am in Cape Town and it is 🌤. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 68.", reporter3.displayTemperature());
    }

    @Test
    public void testCheckWeather() {
        WeatherReporter reporter = new WeatherReporter("London", 9);
        assertEquals("🌦", reporter.checkWeather());

        WeatherReporter reporter1 = new WeatherReporter("California", 35);
        assertEquals("🌅", reporter1.checkWeather());

        WeatherReporter reporter2 = new WeatherReporter("India", 50);
        assertEquals("🔆", reporter2.checkWeather());

        WeatherReporter reporter3 = new WeatherReporter("Cape Town", 20);
        assertEquals("🌤", reporter3.checkWeather());
    }

    @Test
    public void testCheckTemperature() {

        WeatherReporter reporter = new WeatherReporter("London", 9);
        assertEquals("It's too cold 🥶!", reporter.checkTemperature());

        WeatherReporter reporter1 = new WeatherReporter("California", 35);
        assertEquals("It's too hot 🥵!", reporter1.checkTemperature());

        WeatherReporter reporter2 = new WeatherReporter("India", 50);
        assertEquals("It's too hot 🥵!", reporter2.checkTemperature());

        WeatherReporter reporter3 = new WeatherReporter("Cape Town", 20);
        assertEquals("Ahhh...it's just right 😊!", reporter3.checkTemperature());
    }

}
