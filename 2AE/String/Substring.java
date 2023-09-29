public class Substring {

    public static void main(String[] args) {
        
        String s1="hello";
       int count=0;
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<=s1.length();j++){
                if(isplaindrome(s1.substring(i, j))){
                    System.out.println(s1.substring(i,j));
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isplaindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
