package Day_3;

import java.util.Scanner;

public class flipping_image {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int m=sc.nextInt();
        int[] []image =new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                image[i][j]=sc.nextInt();
            }
        }
        //  int n=image.length;
        for(int i=0;i<n;i++){
            int a=0;
            int b=n-1;
            while(a<=b){
                int temp=image[i][a];
                image[i][a]=image[i][b];
                image[i][b]=temp;
                a++;
                b--;
            }

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }
            }
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
}
