public class CountDigit {
    public static void main(StringMethods[] args) {
        int num = 123456;
        int reverse = 0;
        
        for(int i=1; i<num; i++) {
            if(num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }
        }
        System.out.println(reverse);
    }
}
