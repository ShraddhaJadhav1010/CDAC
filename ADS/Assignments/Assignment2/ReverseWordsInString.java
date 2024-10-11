package Assignment2;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String sentence = "Hello World"; // You can change this string to test with different inputs
        String reversed = reverseWords(sentence);
        
        System.out.println("Reversed sentence: " + reversed);
    }

    // Function to reverse words in a sentence
    public static String reverseWords(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.split(" ");
        
        StringBuilder reversedSentence = new StringBuilder();
        
        // Traverse the words array from the end to the beginning
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" "); // Add space between words
            }
        }
        
        return reversedSentence.toString();
    }
}
