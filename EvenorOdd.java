
package evenorodd;

import java.util.Scanner;


public class EvenorOdd {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("the no. is Even");
        }else
        {
            System.out.println("the no. is Odd");
        }
    }
    
}

    
    

