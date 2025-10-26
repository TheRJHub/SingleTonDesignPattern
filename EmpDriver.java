public class EmpDriver {
    public static void main(String[] args) {
        Emp e1 = Emp.getInstance();
        Emp e2 = Emp.getInstance();

        System.out.println("Object 1: " + e1);
        System.out.println("Object 2: " + e2);

        // Confirming both references point to the same object
        if (e1 == e2) {
            System.out.println("Both references are the same. Singleton works!");
        } else {
            System.out.println("Different objects exist. Singleton failed.");
        }

        //the below line will fail:
        // Emp e3 = new Emp(); // Cannot access private constructor
    }
}
