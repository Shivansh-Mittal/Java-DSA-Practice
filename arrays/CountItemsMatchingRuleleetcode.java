package arrays;
import java.util.*;
// leetcode - https://leetcode.com/problems/count-items-matching-a-rule/
public class CountItemsMatchingRuleleetcode {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(Arrays.asList("phone","blue","pixel"), 
                                                 Arrays.asList("computer","silver","lenovo"), 
                                                 Arrays.asList("phone","gold","iphone"));
        // for(String[] s: item){
            // items.add(s);
        // }
        String ruleKey = "type"; 
        String ruleValue = "phone";
        System.out.println(countMatches(items, ruleKey, ruleValue));        
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> item: items){
            // System.out.println(item);
            if(ruleKey.equals("type"))
            {
                // System.out.println("type");
                if(ruleValue.equals(item.get(0)))
                    count++;
            } 
            else if(ruleKey.equals("color"))
            {
                if(ruleValue.equals(item.get(1)))
                    count++;
            } 
            else if(ruleKey.equals("name"))
            {
                if(ruleValue.equals(item.get(2)))
                    count++;
            }
        }
        return count;
    }

}
