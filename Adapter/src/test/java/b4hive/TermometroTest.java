package b4hive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TermometroTest {

    @Test
    void deveConverterCelsiusParaFahrenheit() {
        Termometro termometro = new Termometro();

        termometro.setTemperaturaCelsius(100.0);

        assertEquals(212.0, termometro.getTemperaturaFahrenheit());
    }

    @Test
    void deveConverterFahrenheitParaCelsius() {
        Termometro termometro = new Termometro();

        termometro.setTemperaturaFahrenheit(32.0);

        assertEquals(0.0, termometro.getTemperaturaCelsius(), 0.0001);
    }

    @Test
    void deveManterATemperaturaEmCelsius() {
        Termometro termometro = new Termometro();

        termometro.setTemperaturaCelsius(-40.0);

        assertEquals(-40.0, termometro.getTemperaturaCelsius());
    }

    @Test
    void deveConverterPontoDeFusaoDaAgua() {
        Termometro termometro = new Termometro();

        termometro.setTemperaturaCelsius(0.0);

        assertEquals(32.0, termometro.getTemperaturaFahrenheit());
    }
}
