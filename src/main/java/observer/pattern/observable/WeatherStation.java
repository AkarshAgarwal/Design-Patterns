package observer.pattern.observable;

import observer.pattern.observer.IObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class WeatherStation implements IObservable {

    List<IObserver> observers;
    double temperature;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void delete(IObserver observer) {
        this.observers.remove(observer);
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public void notifyObservers() {

        System.out.println();
        System.out.println();

        Properties props = new Properties();
        props.setProperty("Temperature", String.valueOf(getTemperature()));
        for (IObserver observer : this.observers)
            observer.update(props);

    }
}
