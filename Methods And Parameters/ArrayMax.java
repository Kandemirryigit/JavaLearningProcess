public class ArrayMax {
    public static int findMax(int[] numbers){
        if(numbers==null || numbers.length==0){
            return Integer.MIN_VALUE;  // Return the smallest possible integer if the array is invalid
        }

        int max=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums={3,7,1,9,4};
        int maxValue=findMax(nums);
        System.out.println("The maximum value in the array is: " + maxValue);
    }



    
}
