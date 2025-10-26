// Singleton class: only one Employee object can exist
public class Emp {
    private int a;

    // Private constructor prevents instantiation from outside
    private Emp() {}

    // Optional: constructor with initial value
    private Emp(int a) {
        this.a = a;
    }

    // Getter & Setter
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    // Static variable to hold the single instance
    private static Emp obj = null;

    // Public method to provide access to the instance
    public static Emp getInstance() {
        if (obj == null) {
            obj = new Emp(); // lazy initialization
        }
        return obj;
    }
}
