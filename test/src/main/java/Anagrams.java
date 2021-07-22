import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    private static boolean checkIfAnagram(String s1,String s2){
        if(s1.length()!=s2.length())return false;


        Map<Character, Integer> freq1=new HashMap<>();
        Map<Character, Integer> freq2=new HashMap<>();

        int l1=s1.length();
        int l2=s2.length();

        for(int i=0;i<l1;i++){
            freq1.put(s1.charAt(i),freq1.getOrDefault(s1.charAt(i),0)+1);
        }

        for(int i=0;i<l2;i++){
            freq2.put(s2.charAt(i),freq1.getOrDefault(s2.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> entry:freq1.entrySet()){
            char c1=entry.getKey();
            int freq=entry.getValue();

            if(!freq2.containsKey(c1)||freq2.get(c1)!=freq)return false;
        }


        return true;

    }
}
