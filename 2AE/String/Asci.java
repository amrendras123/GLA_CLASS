public class Asci {
    public static void main(String[] args) {
        char ch='a';
        char ch1='A';
        // System.out.println((int)ch);
        // System.out.println((int)ch1);
        // for(int i=0;i<26;i++){
        //     System.out.println(ch+i);
        // }
        //AbcDef->aBCdEF
        // System.out.println(Character.toUpperCase(ch));
        // System.out.println();

        // String s1="AbCDe";
        // String s2="";

        // for(int i=0;i<s1.length();i++){
        //     char ch3=s1.charAt(i);
        //     if(Character.isUpperCase(ch3)){
        //         s2=s2+Character.toLowerCase(ch3);

        //     }else{
        //         s2=s2+Character.toUpperCase(ch3);
        //     }

        // }
        // System.out.println(s2);



        String s1="Hellooooow";
        System.out.println(s1.substring(0, 5));
        System.out.println(s1.substring(0));
        System.out.println(s1.substring(5));
    }
}
