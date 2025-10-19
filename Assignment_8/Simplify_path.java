package Assignment_8;
import java.util.*;
public class Simplify_path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="/a/./b/../../c/";
        System.out.println(func(s));
    }
    public static String func(String path){
        String[] p=path.split("/");
        Stack<String> st=new Stack<>();
        for(String part:p){
            if(part.equals("")|| part.equals(".")){
                continue;
            }
            else if(part.equals("..")){
                if(!st.isEmpty()){
                    st.pop();


                }
                else{
                    st.push(part);
                }
            }
        }
        StringBuilder res=new StringBuilder();
        for(String dir:st){
            res.append("/").append(dir);
        }
        return res.length()>0?res.toString(): "/";

    }
}
