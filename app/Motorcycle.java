public class Motorcycle extends Veichle{
    @Override
    public void start() {
        System.out.println("Motorcycle start");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerate");
    }
}
