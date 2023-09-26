// package String;

public class basics {
    public static void main(String[] args) {

        // String s1="hello";
        // String str1=new String("hello");
        // String s2="hello";
        // String str2=new String("hello");
         
        // //== checks only addresses
        // System.out.println(s1==s2);
        // System.out.println(s1==str1);
        // System.out.println(str1==str2);

        // //returns the character at given index
        // System.out.println(s1.charAt(2));

        // //return the length of given string
        // System.out.println(str1.length());


        // //s1.equals()-> check the of both the string
        // System.out.println(s1.equals(str2));
        // System.out.println(s2.equals(str1));

        //Concatenation
        String s1="hello";
        String s2="hey";
        String str1=new String("abcd");
        String str2=new String("hello");

        String s3=s1+s2;
        System.out.println(s3);
        s1=s1+s2;
        System.out.println(s1);


        
    }
}
