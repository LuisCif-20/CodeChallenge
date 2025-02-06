import java.util.HashMap;
import java.util.Map;

public class CC1 {

    public static void main(String[] args) {
        final String[] words = {"amor", "roma"};
        System.out.println("El par de palabras es un anagrama: " + CC1.isAnagram(words[0], words[1]));

    }

    private static boolean isAnagram(String word1, String word2) {
        Map<Character, Integer> w1 = new HashMap<Character, Integer>();
        Map<Character, Integer> w2 = new HashMap<Character, Integer>();
        for (char character : word1.toCharArray()) {
            w1.put(character, w1.getOrDefault(character, 0) + 1);
        }
        for (char character : word2.toCharArray()) {
            w2.put(character, w2.getOrDefault(character, 0) + 1);
        }
        if (w1.size() != w2.size()) {
            return false;
        }
        for (char character : word1.toCharArray()) {
            if (!w1.containsKey(character) && !w2.containsKey(character) || (w1.get(character) != w2.get(character))) {
                return false;
            }
        }
        return true;
    }

}