import java.util.Scanner;

public class Vowel {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        vowel(s1);
        Count_vowel(s1);
        Printindexofvowel(s1);

    }
    public static void vowel(String s){

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                System.out.print(ch+" ");
            }
        }
        System.out.println();
    }
      public static void Count_vowel(String s){
        int count=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
    }
      public static void Printindexofvowel(String s){

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
