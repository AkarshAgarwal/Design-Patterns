package observer.pattern;

import observer.pattern.observable.WeatherStation;
import observer.pattern.observer.IObserver;
import observer.pattern.observer.PhoneScreen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ObserverMain {
    public static final Logger LOGGER = LoggerFactory.getLogger(ObserverMain.class);

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        List<PhoneScreen> observers = new ArrayList<>();

        observers.add(new PhoneScreen());
        observers.add(new PhoneScreen());
        observers.add(new PhoneScreen());
        observers.add(new PhoneScreen());
        observers.add(new PhoneScreen());

        LOGGER.info("Added 5 Observers");

        for (IObserver observer : observers)
            weatherStation.add(observer);

        weatherStation.setTemperature(10);
        weatherStation.notifyObservers();

        weatherStation.delete(observers.get(2));

        LOGGER.info("Deleted Third Observer");

        observers.remove(2);

        weatherStation.setTemperature(20);
        weatherStation.notifyObservers();

    }
}
