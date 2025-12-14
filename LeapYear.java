public class LeapYear {
    public static void main(StringMethods[] args) {
        int year = 2024;

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("this is Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
