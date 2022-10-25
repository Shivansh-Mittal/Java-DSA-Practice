package arrays;
// leetcode - https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class SentenceIsPangramleetcode {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) {
        // int size  = (sentence.toCharArray()).length;
        if((sentence.toCharArray()).length < 26)
            return false;
        for(char c='a'; c<='z'; c++){
            if(sentence.indexOf(c) == -1)
                return false;
        }
        return true;
    }

}
