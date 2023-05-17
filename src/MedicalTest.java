public class MedicalTest implements Runnable{
    @Override
    public void run() {
        System.out.println("Medical Test of "+Thread.currentThread().getName()+" Started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Medical Test of "+Thread.currentThread().getName()+" End");
    }
}
