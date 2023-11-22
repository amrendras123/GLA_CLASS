class Poly{


    public int sum(int a,int b){
        return a+b;
    }
     public int sum(int a,int b,int c){
        return a+b+c;
    }
    public int sum(float a,int b){
        return (int)(a+b);
    }

    public static void main(String[] args) {
        Poly p1=new Poly();
        System.out.println(p1.sum(2,5, 5));
        
    }
}