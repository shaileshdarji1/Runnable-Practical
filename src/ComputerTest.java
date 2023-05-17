public class ComputerTest implements Runnable{
    @Override
    public void run() {
        System.out.println("Computer Test of Started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Computer Test of End");
    }
}
