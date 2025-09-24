package leetcodes;

public class leetcode2486 {

    public static int appendCharacters(String s, String t) {
        int count=0;
        int s_iter=0,t_iter=0;
        int s_len=s.length()-1,t_len=t.length()-1;

        while(s_iter<=s_len && t_iter<=t_len){
            if(s.charAt(s_iter) == t.charAt(t_iter)){
                s_iter++;
                t_iter++;
                count++;
            }else{
                s_iter++;
            }
        }
        return t.length()-count;
    }

    public static void main(String[] args) {
        String s="coaching",t= "coding";
        System.out.println(appendCharacters(s, t));

        String s2 = "abcde", t2 = "a";
        System.out.println(appendCharacters(s2, t2));

        String s3 = "z", t3 = "abcde";
        System.out.println(appendCharacters(s3, t3));
        
    }
}
