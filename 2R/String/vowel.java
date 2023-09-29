import java.util.Scanner;

public class vowel {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();
        String s1="Abeiou";
        count(s1);

    }
    public static void count(String s1){

        int cnt=0;
        for(int i=0;i<s1.length();i++){

            char ch=s1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
        public static void PrintIndex(String s1){
            
        for(int i=0;i<s1.length();i++){

            char ch=s1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.print(i+" ");
            }
        }
        // System.out.println(cnt);
    }

}
