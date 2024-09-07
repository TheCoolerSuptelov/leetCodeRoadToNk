package RelatedDNASequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> findRepeatedDnaSequences(String dnaString) {
        Map<String, Integer> uniqueSequenceCounter = new HashMap<>(dnaString.length() / 10);
        for (int i = 0; i < dnaString.length(); i++) {
            var curSequence = dnaString.substring(i, i + 10);
            uniqueSequenceCounter.put(curSequence, uniqueSequenceCounter.getOrDefault(curSequence,0)+1);

        }
        List<String> listOfRepeatedSequence = new ArrayList<>();
        for (Map.Entry<String, Integer> item:uniqueSequenceCounter.entrySet()) {
            if (item.getValue() > 1){
                listOfRepeatedSequence.add(item.getKey());
            }
        }
        return listOfRepeatedSequence;
    }
}
