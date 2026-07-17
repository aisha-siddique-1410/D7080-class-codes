public class StringLecture {

    // WHEN WE USE NEW KEYWORD TO CREATE STRING THEN IS OBJECT CREATED
    // ONLY IN HEAP AREA OR IN SCP AS WELL?

    public static void main(String[] args) {
        // String s1 = "Java"; // scp  // 1 object

        // String s2 = new String("Java");  // heap // 1 object

        // String s3 = new String("program");  // 2 object

        // String name = "Aisha";
        // // String new_name = name + "Siddique";
        // name = name.concat(" siddique"); 
        // System.out.println(name);

        
        // String methods 

        /* 1. length()
           2. isEmpty() / inBlank() */

        //    String str1 = "Aisha Siddique";
        //    String str2 = "       ";
        //    System.out.println(str2.isEmpty());  // counts spaces  // false
        //    System.out.println(str2.length());  // 7
        //    System.out.println(str2.isBlank());  // not consider spaces

        //    String str3 = " Aisha Siddique ";
        //    System.out.println(str3.trim()); // removes starting and ending spaces

        //    String email = "aisha@anudip.org";
        //    String password = "aisha123";

        //    if(email.equals("aisha") && password.equals("aisha123")){
        //     System.out.println("Login Successfully");
        //    } else {
        //     System.out.println("Incorrect email and password");
        //    }

        String str1 = new String("Aisha");
        String str2 = new String("Aisha");

        System.out.println(str1 == str2);  // false
        System.out.println(str1.equals(str2));  // true


  
           



      
      


    }
    
}
