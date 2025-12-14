public class CountWords {
    public static void main(String[] args) {
        String sentence = "Java is a programming Language";

        
            String[] word = sentence.trim().split(" ");
        System.out.println(word.length);
    }
}
