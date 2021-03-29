package observer.pattern.observer;

import observer.pattern.observable.IObservablePublicProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PhoneScreen implements IObserver {
    public static final Logger LOGGER = LoggerFactory.getLogger(PhoneScreen.class);

    @Override
    public void update(IObservablePublicProperties props) {
        LOGGER.info("Temperature received as " + props.getTemperature());
    }
}
