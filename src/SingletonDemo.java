/**
 * Created by Wei Shi on 2017/2/23.
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton1 inst1 = Singleton1.getInstance();
        inst1.showMessage();

        Singleton2 inst2 = Singleton2.getInstance();
        inst2.showMessage();
    }
}
