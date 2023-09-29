import java.util.Scanner;

public class Football {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.contains("1111111")||str.contains("0000000")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        // Dangerous(str);
    }
    public static void Dangerous(String str){
        int count0=0;
        int max0=0;
        int max1=0;
        int count1=0;

        for(int i=0;i<str.length();i++){

            char  ch=str.charAt(i);
            if(ch=='0'){
                count0++;
                max0=Math.max(max0,count0);
                count1=0;
            }else{
                count1++;
                max1=Math.max(max1,count1);
                count0=0;
            }
        }
        if(max0>=7||max1>=7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
