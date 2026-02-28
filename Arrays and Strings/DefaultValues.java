public class DefaultValues {
    public static void main(String[] args){
        int[] intArray=new int[3];
        double[] doubleArray=new double[3];
        boolean[] booleanArray=new boolean[3];
        String[] stringArray=new String[3];


        System.out.println("Integer array default values:");
        for(int i=0;i<intArray.length;i++){
            System.out.println("intArray[" + i + "] = " + intArray[i]);
        }

        System.out.println("\nDouble array default values:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("doubleArray[" + i + "] = " + doubleArray[i]);
        }


        System.out.println("\nBoolean array default values:");
        for (int i = 0; i < booleanArray.length; i++) {
            System.out.println("booleanArray[" + i + "] = " + booleanArray[i]);
        }

        
        System.out.println("\nString array default values:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("stringArray[" + i + "] = " + stringArray[i]);
        }
    }
    
}
