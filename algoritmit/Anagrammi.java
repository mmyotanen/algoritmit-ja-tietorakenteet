

import java.util.Arrays;

public class Anagrammi {

    public boolean Anagram(String text1, String text2) {
        char[] chars1 = text1.toCharArray();
        Arrays.sort(chars1);

        char[] chars2 = text2.toCharArray();
        Arrays.sort(chars2);


        return Arrays.equals(chars1, chars2);
    }
}
