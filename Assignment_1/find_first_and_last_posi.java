package Assignment_1;

public class find_first_and_last_posi {
    public static void main(String[] args){
        int [] a={5,5,6,6,7,7,8,8,9};
        int target=8;
        int[] arr=new int[2];
        arr[0]=func_first(a,target);
        arr[1]=func_last(a,target);
        System.out.print(arr[0]+" "+arr[1]);

    }
    public static int func_first(int[] a,int target){
        int f=0;
        int l=a.length-1;
        int ans=-1;
        while(f<=l){
            int mid=f+(l-f)/2;
            if(a[mid]==target){
                ans=mid;
                l=mid-1;
            }
            else if(a[mid]<target){
                f=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        return ans;
    }
    public static int func_last(int[] a,int target){
        int f=0;
        int l=a.length-1;
        int ans=-1;
        while(f<=l){
            int mid=f+(l-f)/2;
            if(a[mid]==target){
                ans=mid;
                f=mid+1;
            }
            else if(a[mid]<target){
                f=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        return ans;
    }
}
