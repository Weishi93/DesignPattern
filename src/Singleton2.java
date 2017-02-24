/**
 * Created by Wei Shi on 2017/2/23.
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Successfully get instance2.");
    }
}
