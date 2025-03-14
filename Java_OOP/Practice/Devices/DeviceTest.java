// DeviceTest.java
public class DeviceTest {
    public static void main(String[] args) {
        Phone myPhone = new Phone(50);
        myPhone.status();
        myPhone.makeCall();
        myPhone.makeCall();
        myPhone.makeCall();
        myPhone.playGame();
        myPhone.playGame();
        myPhone.charge(50);
        myPhone.status();
    }
}
