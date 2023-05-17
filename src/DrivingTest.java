public class DrivingTest implements Runnable{
    @Override
    public void run() {
        System.out.println("Driving Test of "+Thread.currentThread().getName()+" Started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Driving Test of "+Thread.currentThread().getName()+" End");
    }
}
