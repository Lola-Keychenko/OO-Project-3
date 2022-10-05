public interface Subject {
    // THIS IS THE SUBJECT INTERFACE FOR ALL PUBLISHERS
    public void registerObserver();
    public void removeObserver();
    public void notifyObserver();
}
