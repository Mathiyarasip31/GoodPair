import java.util.Scanner;

public class GoodPair {
    public static int Check(int n, int array[],int k)
    {
        int result=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(array[i]+array[j]==k)
                {
                    result=1;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n= scanner.nextInt();
        System.out.println("Enter elements in an array");
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        int k= scanner.nextInt();
        System.out.println("Is there any pair in the given array?");
        System.out.println(Check(n,array,k));
    }
}
//time complex n^2