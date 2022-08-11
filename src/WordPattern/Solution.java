package WordPattern;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        var xx = s.split(" ");
        if (pattern.length() != xx.length) return false;
        Map indx = new HashMap();
        for (Integer i = 0; i < xx.length; i++) {
            if (indx.put(pattern.charAt(i),i)!=indx.put(xx[i],i))return false;
        }

        return true;
    }
}
