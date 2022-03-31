package observer;

public class Laptop extends Device{

    @Override
    public void update() {
        System.out.println("Laptop firmware updated");
    }
}
