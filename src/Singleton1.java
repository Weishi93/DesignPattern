/**
 * Created by Wei Shi on 2017/2/23.
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance() {
        return instance;
    }
    public void showMessage() {
        System.out.println("Successfully get instance1.");
    }
}
