interface Subject {
    void addObserver(Observer newObserver);
    void notifyObservers();
}