package observer.pattern.observable;

import observer.pattern.observer.IObserver;

public interface IObservable {

    void add(IObserver observer);
    void delete(IObserver observer);
    void notifyObservers();
}
