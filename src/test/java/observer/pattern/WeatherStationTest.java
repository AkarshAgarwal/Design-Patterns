package observer.pattern;

import observer.pattern.observable.WeatherStation;
import observer.pattern.observer.IObserver;
import observer.pattern.observer.PhoneScreen;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationTest {

    static WeatherStation weatherStation;


    @BeforeClass
    public static void initialize() {
        weatherStation = new WeatherStation();
    }

    @Test
    public void WeatherTest() {

        List<PhoneScreen> observers = new ArrayList<>();

        observers.add(new PhoneScreen());
        observers.add(new PhoneScreen());
        observers.add(new PhoneScreen());
        observers.add(new PhoneScreen());
        observers.add(new PhoneScreen());

        for(IObserver observer : observers)
            weatherStation.add(observer);

        weatherStation.setTemperature(10);
        weatherStation.notifyObservers();

        weatherStation.delete(observers.get(2));
        observers.remove(2);

        weatherStation.setTemperature(20);
        weatherStation.notifyObservers();


    }

}
