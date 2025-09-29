package Day_2;

import java.util.*;
public class sort_character_freq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] freq=new int[256];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        ArrayList<Character> li=new ArrayList<>();
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                li.add((char)i); //since charcter is to be added

            }

        }
        Collections.sort(li,(a,b)->freq[b]-freq[a]); // sort arraylist on basis of freq since in arraylist only character are store
        StringBuilder sb=new StringBuilder();
        for(char ch:li){
            for(int i=0;i<freq[ch];i++){ //kyuki jitni br bo aya utni bri append krna hai
                sb.append(ch);

            }
        }
        System.out.println(sb.toString());



    }
}
