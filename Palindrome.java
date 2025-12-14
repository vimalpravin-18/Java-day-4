public class Palindrome {
    public static void main(String[] args) {
        String  str ="madam";
        String reversed = "";

        str = str.toLowerCase();

        for(int i=str.length()-1; i>=0; i--) {
            reversed = reversed + str.charAt(i);
        }
        if(reversed.equals(str)) {
                System.out.println("It is Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
    }
}
