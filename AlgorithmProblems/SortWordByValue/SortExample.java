package AlgorithmProblems.SortWordByValue;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortExample{
    public static <T> void main(String[] args) throws FileNotFoundException{
        Map<Character, Integer> unOrderedmap=new HashMap<>();
        
        String name="Merhaba, Benim Adım Yağız";
        
        for(char letter: name.toCharArray()){
            if(Character.isLetter(letter)){
                if(Character.isUpperCase(letter)){
                    letter=Character.toLowerCase(letter);
                }               
                unOrderedmap.put(letter, unOrderedmap.getOrDefault(letter, 0)+1);
            }
        }    

        Map<Character, Integer> orderedMap=unOrderedmap.entrySet().stream().sorted(
            (entry1,entry2)-> entry2.getValue().compareTo(entry1.getValue())
            ).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
                ));
                
        for(Map.Entry<Character,Integer> entries: orderedMap.entrySet()){
            char letter=entries.getKey();
            int count=entries.getValue();

            System.out.println("Letter:" + letter +"\tCount :"+ count);
        }
    }
}