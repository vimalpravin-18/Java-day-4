public class EvenOdd {
    void CheckNum(int num) {
        if(num%2==0) {
            System.out.println(num+ " is Even");
        
        } else {
            System.out.println(num+" is Odd");
        }
    }

     static void Largest(int a, int b) {
        if(a>b) {
            System.out.println(a+ " is the Largest");
        } else {
            System.out.println(b+" is the Largest");
        }
    }  

    void Square(int a) {
        System.out.println(a*a);
    }

    void Palindrome(int num) {
        int original = num;
        int reversed = 0;

        while(num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        if(original == reversed) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    static void factorial(int num) {
        int fact = 1;

        for(int i=1; i<=num; i++) {
            fact = fact * i;
        } 
        System.out.println(fact);
    }   

    public static void main(StringMethods[] args) {
        EvenOdd sc = new EvenOdd();
        sc.CheckNum(20);
        Largest(29, 49);
        sc.Square(4);
        sc.Palindrome(12121);
        factorial(5);
    }
}
