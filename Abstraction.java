public interface Abstraction {

    void applyBrakes();
    void startCar();

    public static void main(String[] args) {
        Abstraction c = new CarImplementation();
        c.applyBrakes();
        c.startCar();
    }
}
