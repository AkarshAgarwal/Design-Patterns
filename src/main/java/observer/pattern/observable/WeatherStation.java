package observer.pattern.observable;

import observer.pattern.observer.IObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable, IObservablePublicProperties {

    public static final Logger LOGGER = LoggerFactory.getLogger(WeatherStation.class);

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

    @Override
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void notifyObservers() {
        LOGGER.info("Notifying Observers...");
        for (IObserver observer : this.observers)
            observer.update(this);
    }
}
