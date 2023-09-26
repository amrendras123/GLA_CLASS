// package String;

public class Basics {
    public static void main(String[] args) {
        
        String s1="hello";
        String str1=new String("hello");
        String s2="hello";
        String str2=new String("hello");
        System.out.println(s1==s2);
        System.out.println(str1==s1);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(str2));
        System.out.println(s1.charAt(4));
        System.out.println(s1.length());
        String s23="             abcd           cderftgt";
        System.out.println(s23);
        System.out.println(s23.trim());

    }
    
}
