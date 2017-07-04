package example.codeclan.com.wordcount;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;


/**
 * Created by user on 03/07/2017.
 */

public class Wordcount {

    private HashMap<String, Integer> Wordoccurences = new HashMap<String, Integer>();

    public int getWordCount(String input) {
        int count = 0;
        for (String word : input.split(" ")) {
            count += 1;
        }
        return count;
    }

    public String getWordCountString(String input) {
        return Integer.toString(getWordCount(input));
    }

    public HashMap<String, Integer> getWordOccurences(String input) {
        for (String word : input.split(" ")) {
            Integer count = Wordoccurences.get(word);
            if(count == null){
                count = 0;
            }
            count += 1;
            Wordoccurences.put(word, count);
        }
        HashMap<String, Integer> results = new HashMap<>(Wordoccurences);
        Wordoccurences.clear();
        return results;
    }


    public String getWordOccurencesSorted(HashMap<String, Integer> map) {
        LinkedHashMap<String, Integer> results = new LinkedHashMap<>();
        ArrayList<Integer> array = new ArrayList<>();

        for (HashMap.Entry entry: map.entrySet()){
            array.add(entry.getValue().hashCode());
        }
        Collections.sort(array);
        for (int i = 0; i < array.size(); i++){
            int value = array.get(i);
            for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
                if (map.get(entry.getKey()).equals(value)) {
                    results.put(entry.getKey(), value);
                }
            }
        }
        return results.toString();
    }


    public String getWordOccurencesString(String input) {
    return getWordOccurences(input).toString();
    }
}
