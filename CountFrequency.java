public class CountFrequency {
    public static void main(String[] args) {
        String Var = "java is a programming language";
        char target = 'g';
        int count = 0;

        for(int i=0; i<Var.length(); i++) {
            if(Var.charAt(i) == (target)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
