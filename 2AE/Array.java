/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        
        int[] array={1,2,3,4,5};
         
        for(int i=0;i<=array.length-1;i++){
        System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse order");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }

        


    }
}