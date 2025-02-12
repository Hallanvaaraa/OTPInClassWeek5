import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    // Tests by Tommi Halla
    static TemperatureConverter temperatureConverter = new TemperatureConverter();

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        assertEquals(0, temperatureConverter.fahrenheitToCelsius(32));
        assertEquals(100, temperatureConverter.fahrenheitToCelsius(212));
        assertEquals(-40, temperatureConverter.fahrenheitToCelsius(-40));
        assertEquals(37.77777777777778, temperatureConverter.fahrenheitToCelsius(100));
    }

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        assertEquals(32, temperatureConverter.celsiusToFahrenheit(0));
        assertEquals(212, temperatureConverter.celsiusToFahrenheit(100));
        assertEquals(-40, temperatureConverter.celsiusToFahrenheit(-40));
        assertEquals(100, temperatureConverter.celsiusToFahrenheit(37.77777777777778));
    }

    @org.junit.jupiter.api.Test
    void isExtremeTemperature() {
        assertTrue(temperatureConverter.isExtremeTemperature(-41));
        assertTrue(temperatureConverter.isExtremeTemperature(-40.1));
        assertTrue(temperatureConverter.isExtremeTemperature(50.1));
        assertTrue(temperatureConverter.isExtremeTemperature(51));
        assertFalse(temperatureConverter.isExtremeTemperature(0));
        assertFalse(temperatureConverter.isExtremeTemperature(-40));
        assertFalse(temperatureConverter.isExtremeTemperature(50));
    }
}