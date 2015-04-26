package de.ko.designPatterns.observerPattern.selfMade.subjects;

import de.ko.designPatterns.observerPattern.selfMade.observers.Observer;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
