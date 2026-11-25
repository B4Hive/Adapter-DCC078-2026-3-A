package b4hive;

public class Termometro {
    private final ITemperatura temperatura;
    private final TemperaturaAdapter adaptador;

    public Termometro() {
        temperatura = new TemperaturaCelsius();
        adaptador = new TemperaturaAdapter(temperatura);
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) {
        temperatura.setTemperatura(temperaturaCelsius);
        adaptador.salvarTemperatura();
    }

    public double getTemperaturaCelsius() {
        return temperatura.getTemperatura();
    }

    public double getTemperaturaFahrenheit() {
        adaptador.salvarTemperatura();
        return adaptador.getTemperatura();
    }

    public void setTemperaturaFahrenheit(double temperaturaFahrenheit) {
        adaptador.setTemperatura(temperaturaFahrenheit);
        adaptador.recuperarTemperatura();
    }

    public String getEscala() {
        return temperatura.getEscala();
    }
}
