public class Methods {

    void Greet() {
            System.out.println("Hello, World");
        }

    static void Display() {
            System.out.println("This is Methods");
        }

    public static void main(StringMethods[] args) {
        Methods sc = new Methods();  //non-static methods
        sc.Greet(); 

        Display(); // static methods
    }
}
