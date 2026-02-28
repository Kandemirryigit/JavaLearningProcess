public class ArrayReverse {
    public static void main(String[] args){
        int[] original={1,2,3,4,5};
        int[] reversed= new int[original.length];

        for(int i=0;i<original.length;i++){
            reversed[original.length-1-i]=original[i];
        }

       System.out.println("Original array:");
        for (int value : original) {
            System.out.print(value + " ");
        }
        System.out.println("\nReversed array:");
        for (int value : reversed) {
            System.out.print(value + " ");
        }

    }
    
}
