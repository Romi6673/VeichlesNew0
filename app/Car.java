public  class Car extends Veichle{
    @Override
    public void start() {
        System.out.println("car start");
    }

    @Override
    public void stop() {
        System.out.println("car stop");
    }

    @Override
    public void accelerate() {
        System.out.println("car accelerate");
    }
}
