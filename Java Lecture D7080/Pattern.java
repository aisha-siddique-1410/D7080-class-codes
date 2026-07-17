import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
    //    for(int i=1 ; i<=5; i++){
    //     // System.out.println("@");
    //     // /* @
    //     //    @
    //     //    @
    //     //    @
    //     //    @ */

    //         System.out.print("@"); 
    //         System.out.println("@");

    //         /* @ @ @ @ @ 
    //            @ @ @ @ @  
    //            @ @ @ @ @ 
    //            @ @ @ @ @  */
            
    //    }

    // for(int row = 1; row<=4; row++)
    //     {  // row = 2 , 2<=4
    //     for(int col=1; col<=4; col++)
    //     {  // col = 1 1<=4
    //         System.out.print("@ ");       // @ @ @ @ @
    //     }
    //     System.out.println();
    // }
    
    
    // how many rows?
    /// how many column should print in each row
    /* 
    @
    @@
    @@@
    @@@@
    @@@@@


     for(int row = 1; row<=5; row++)
        {  // row = 2 , 2<=4
        for(int col=1; col<=row; col++)
        {  // col = 1 1<=4
            System.out.print("@ ");       // @ @ @ @ @
        }
        System.out.println();
    }
    }
    
     */

    /* @@@@@
       @@@@
       @@@
       @@
       @ */

       
    /* 55555
       4444
       333
       22
       1 */

       
    //  for(int row = 5; row>=1; row--)
    //     {  // row = 2 , 2<=4
    //     for(int col=1; col<=row; col++)
    //     {  // col = 1 1<=4
    //         System.out.print(row);       // @ @ @ @ @
    //     }
    //     System.out.println();
    // }

    // for(int i=1; i<=3; i++){  // i = 3
    //     for(int j=1; j<=2; j++){  // 1, 2
    //         System.out.print(i + "" + j+ " ");
    //     }
    // }  /* 11 12 21 22 31 32 */  \

    // for(int i =1; i<=5; i++){
    //     if(i ==3)
    //         continue;

    //     System.out.print(i + " ");
    // }

    // Count how many numbers between 1 and 100 are divisible by 7

    //  int count = 0;
    //     for(int i=1;i<=100;i++){
    //         if(i%7==0){
    //             count++;
    //         }
    //     }
    //     System.out.println(count);


    // Strong Number

    /* 145 = 1! + 4! + 5!
        = 1 + 24 + 120
        = 145 
        
        to check whether the number is strong number or not
        // take inout from user*/


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number");
        // int num1 = sc.nextInt(); // 1 0 
        // // input buffer : /n
        

        // // System.out.println("Enter second number");
        // // int num2 = sc.nextInt();  // 20 /n

        // System.out.println("Enter you name");
        // String name = sc.next();  // /n

        // System.out.println(num1);
        // // System.out.println(num2);
        // System.out.println(name);


        System.out.print("Enter the number: ");
        int n=new Scanner(System.in).nextInt();

        if (n<=0){
            System.out.println(-1);
            return;
        }
        int temp=n;
        int sum=0;
        while (temp>0) {
            int digit=temp%10;  // last digit
            int fact = 1;
            for (int i=1;i<=digit;i++)
                fact*=i;
            sum+=fact;

            temp/=10;
        }

        if (sum==n)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");


        // // to reverse a number (12345)
        // to check whether the number is plaindrome or not
        

        
    }
    
}
