public class Substring {
    public static void main(String[] args) {
        
        String s1="hello";
        Substr(s1);
    }
    public static void Substr(String s1){
    int cnt=0;
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<=s1.length();j++){
                String str1=s1.substring(i, j);
                boolean ans=isPalindrome(str1);
                if(ans==true){
                    cnt++;
                    System.out.println(str1);
                }
                
            }
        }
        System.out.println(cnt);
    }
    public static boolean isPalindrome(String s1){
        int i=0;
        int j=s1.length()-1;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
