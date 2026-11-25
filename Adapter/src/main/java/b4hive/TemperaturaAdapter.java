package b4hive;

public class TemperaturaAdapter extends TemperaturaFahrenheit {
    private final ITemperatura temperaturaCelsius;

    public TemperaturaAdapter(ITemperatura temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public void salvarTemperatura() {
        double celsius = temperaturaCelsius.getTemperatura();
        setTemperatura(celsius * 9.0 / 5.0 + 32.0);
    }

    public double recuperarTemperatura() {
        double celsius = (getTemperatura() - 32.0) * 5.0 / 9.0;
        temperaturaCelsius.setTemperatura(celsius);
        return celsius;
    }
}
