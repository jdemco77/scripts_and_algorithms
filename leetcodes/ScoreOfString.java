package leetcodes;

public class ScoreOfString {
    public static int scoreOfString(String s) {
        int score=0;
        int i=0,j=1;

        while(i<j && j<s.length()){
            int val1= s.charAt(i);
            int val2= s.charAt(j);
            score= score + Math.abs(val2-val1);
            i++;
            j++;
        } 
        return score;
    }


    public static void main(String[] args) {
        String s= "JamesDem";
        System.out.println(scoreOfString(s));
    }
    
}
