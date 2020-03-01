package observer.pattern.observer;

import observer.pattern.observable.WeatherStation;

import java.util.Properties;


public class PhoneScreen implements IObserver {

    @Override
    public void update(Properties props) {
        System.out.println("Temperature received as " + props.getProperty("Temperature"));
    }
}
