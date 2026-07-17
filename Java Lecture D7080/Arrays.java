import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int marks[] = {10, 20, 30};  
        // for(int i=1; i<marks.length; i++){ // i=0, 1, 2, 3
        //     System.out.println(marks[i]);
        // }

        // create an array by taking input from user then print it

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array");
        // int size = sc.nextInt();

        // System.out.println("Enter the elements of array");
        // int arr[] = new int[size];

        // for(int i=0; i<size ; i++){
        //     arr[i] = sc.nextInt();

        // }

        // System.out.println("The values are : ");
        // for(int i=0; i<size; i++){
        //     System.out.println(arr[i]);
        // }

        // linear search
        /*  ask user to search for an element if it exist or not, if yes then
         print "Element found at index _ "*/

        //  System.out.print("Enter the Element to search: ");
        // int ele=sc.nextInt();  // 30
        
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==ele){  // arr[2] = 50, 30 , 30 == 30
        //         System.out.println("Element found at: "+i);
        //         return;
        //     }
        // }
        // System.out.println("Element not Found: ");\

          // int[] arr = {5, 2, 8, 1, 9, 3};
          // for(int i=0; i<arr.length; i++){  // i =5
          //   for(int j= i+1; j<arr.length; j++){

          //       if(arr[i] < arr[j]){
          //           int temp = arr[i];
          //           arr[i] = arr[j];
          //           arr[j] = temp;
          //       }

          //   }

          // }

          // for(int num : arr){
          //   System.out.println(num + " ");
          // }


          // 2D Array
          // int arr[][] = new int[2][3];  // creates memory in heap

          // arr[0][0] = 10;
          // arr[0][1] = 20;
          // arr[0][2] = 30;

          // arr[1][0] = 40;
          // arr[1][1] = 50;
          // arr[1][2] = 60;

          // System.out.println(arr[1][2]);

        //   int arr[][] = {
        //     {10, 20, 30},
        //     {40, 50, 60},
        //     {70, 80, 90}
        //   };

        //   for(int i=0; i<arr.length; i++){
        //  for(int j=0; j<arr.length; j++){
        //   System.out.print(arr[i][j]+ " ");
        //  }
        //  System.out.println();
        //   }

         // Adition on 2 arrays

  //        int a[][] = {
  //         {1, 2, 3},
  //         {4, 5, 6},
  //         {7, 8, 9}
  //        };

  //        int b[][] ={
  //         {10, 20, 30},
  //         {40, 50, 60},
  //         {70, 80, 90}
        
  //        };

  //        int result[][] = new int[a.length][a[0].length];  

        
  // for(int i=0; i<a.length; i++){  
  //        for(int j=0; j<a[0].length; j++){  
  //         result[i][j] = a[i][j] + b[i][j];
         
  //        }
  //        System.out.println();


  //       }

  //         for(int i=0; i<result.length; i++){
  //        for(int j=0; j<result.length; j++){
  //         System.out.print(result[i][j]+ " ");
  //        }
  //        System.out.println();
  //         }

          // int arr[][] = {
          //  {1, 2, 3, 4, 5},
          //  {6, 7, 8, 9, 10},
          //  {11, 12,13, 14, 15}
            
          // };

          // System.out.println(arr.length); // 3
          // System.out.println(arr[0].length); //5

          // print transpose of a matrix

          /* { 1, 2, 3}
             {4, 5, 6,} */

             // transpose 

             Scanner sc = new Scanner(System.in);
             int row = sc.nextInt();
             int col = sc.nextInt();

             int arr[][] = new int[row][col];

             for(int i=0; i<row; i++){
              for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
              }
             }

             

             // to print transpose

             for(int j=0; j<col; j++){
              for(int i=0; i<row; i++){
                System.out.print(arr[i][j] + " ");

              }
              System.out.println();
             }

           

  //            {10, 20, 30},
  // //         {40, 50, 60},
  // //         {70, 80, 90}

    // 1. print only the primary diagonal : 10 50 90
  //2. print only the secondary diagonal : 30 50 70


 


    }
  }
    
