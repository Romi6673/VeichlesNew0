public class bicycle extends Veichle{
    @Override
    public void start() {
        System.out.println("bicycle start");
    }

    @Override
    public void stop() {
        System.out.println("bicycle stop");
    }

    @Override
    public void accelerate() {
        System.out.println("bicycle accelerate");
    }
}
