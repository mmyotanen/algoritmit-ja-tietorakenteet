

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharacterCount {

    public String maxChar(String text) {


        HashMap<String, Integer> characterMap = map(text);


        return max(characterMap);
    }

    private HashMap<String, Integer> map(String text) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        char[] chars = text.toCharArray();


        for (int i=0; i < chars.length; i++) {
            String letter = String.valueOf(chars[i]);


            if (map.containsKey(letter)) {
                Integer currentCount = map.get(letter);
                map.put(letter, currentCount + 1);
            } else {
                map.put(letter, 1);
            }
        }

        return map;
    }

    private String max(HashMap<String, Integer> map) {
        int maxCount = 0;
        String maxLetter = "";


        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {

            Map.Entry pair = (Map.Entry)it.next();
            int value = (Integer)pair.getValue();

            if (value > maxCount) {
                maxLetter = (String)pair.getKey();
                maxCount = (Integer)pair.getValue();
            }

            it.remove();
        }

        return maxLetter;
    }
}
