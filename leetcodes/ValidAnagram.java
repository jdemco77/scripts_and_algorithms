package leetcodes;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ValidAnagram{
    public static boolean isAnagram(String s, String t) {
        int[] charArr= new int[26];

        if(s.length() != t.length()) return false;

        for(int i=0;i<s.length();i++){
            int schar=(int) s.charAt(i)-97;
            int tchar=(int) t.charAt(i)-97;

            charArr[schar]++;
            charArr[tchar]--;
        }
        for(int i=0;i<charArr.length;i++){
            if(charArr[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramV2(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sorteds=s.toCharArray();
        char[] sortedt=t.toCharArray();
        Arrays.sort(sorteds);
        Arrays.sort(sortedt);
        for(int i=0;i<s.length();i++){
            if(sorteds[i]!=sortedt[i]) return false;
        }
        return true;
    }
   

}