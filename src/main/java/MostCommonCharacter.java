import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i < str.length(); i++){
            Character a = str.charAt(i);
            if(!map.containsKey(a)){
                    map.put(a, 1);
            } else {
                map.put(a, map.get(a)+1);
            } 
        }
       char mostCommon = ' ';
       int highestCount = 0;

       for(Map.Entry<Character, Integer> entry : map.entrySet()){
          char currentCharacter = entry.getKey();
          int currentCount = entry.getValue();

          if (currentCount > highestCount) {
            highestCount = currentCount;
            mostCommon = currentCharacter;
          }
       }

        return mostCommon;
    }
}
