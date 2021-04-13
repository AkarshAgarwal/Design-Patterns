package observer.pattern.observer;

import observer.pattern.observable.IObservablePublicProperties;

public interface IObserver {

    void update(IObservablePublicProperties props);
}
