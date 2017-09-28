class Subject {
    private List<Observer> observers = new ArrayList<>();
    private Bid state;

    public void add(Observer o) {
        observers.add(o);
    }

    public void remove(Observer o) {
        observers.remove(o);
    }

    public Bid getState() {
        return state;
    }

    public void setState(Bid value) {
        this.state = value;
        execute();
    }

    private void execute() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}