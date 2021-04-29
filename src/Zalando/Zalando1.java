package Zalando;


import java.util.Random;


public class Zalando1 {
    public String solution(String S) {
        // write your code in Java SE 8
        char[] chars = S.toCharArray();
        int i = 0,j = chars.length - 1;
        Random rand = new Random();
        while( i <= j ){
            if(chars[i] == '?' && chars[j] == '?'){
                chars[i] = (char) ('a' + rand.nextInt( 26));
                chars[j] = (char) ('a' + rand.nextInt( 26));
            }
            else if(chars[i] == '?' && chars[j] != '?'){
                chars[i] = chars[j];
            }
            else if(chars[i] != chars[j]){
                return "NO";
            }
            else if(chars[i] != '?' && chars[j] == '?'){
                chars[j] = chars[i];
            }
            i++;
            j--;
        }
        System.out.println(chars);
        return String.valueOf( chars );

    }
}
