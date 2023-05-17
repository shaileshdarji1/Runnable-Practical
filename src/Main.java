public class Main {

    public static void main(String[] args) throws InterruptedException {

        MedicalTest medicalTest = new MedicalTest();
        Thread eyeTest = new Thread(medicalTest, "Eyes Test");
        Thread bodyCheckup = new Thread(medicalTest, "Body Checkup");
        eyeTest.start();
        eyeTest.join();

        bodyCheckup.start();
        bodyCheckup.join();

        ComputerTest computerTest = new ComputerTest();
        Thread test = new Thread(computerTest);
        test.start();
        test.join();

        DrivingTest drivingTest = new DrivingTest();
        Thread bike = new Thread(drivingTest,"Bike");
        Thread cars = new Thread(drivingTest,"Cars");

        bike.start();
        bike.join();
        cars.start();
        cars.join();

        System.out.println("Process of Driving License Successfully Completed");
        System.out.println("You will receive Your Driving license withing 15 days.....Thank you");
    }
}
