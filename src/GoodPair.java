import java.util.Scanner;

public class GoodPair {
    public static int goodPair(int arr[],int find){
        boolean flag=false;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==find){
                flag=true;
                break;
            }
        }
    }
    if(flag){
        return 1;
    }
    return 0;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int n=sc.nextInt();
        sc.nextLine();

        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to  find");
        int f=sc.nextInt();
        int goodPair=goodPair(arr,f);
        System.out.println(goodPair);


    }
}