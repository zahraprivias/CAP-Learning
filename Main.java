public class Main {
    int x = 5;

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

        myMethod();
    }

}