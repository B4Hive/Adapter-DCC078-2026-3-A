package b4hive;

public class TemperaturaCelsius implements ITemperatura {
    private double temperatura;

    @Override
    public String getEscala() {
        return "Celsius";
    }

    @Override
    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
