public class Example6 {

    public static int sumArray(int[] numbers){
        int sum=0;
        for(int number:numbers){
            sum+=number;
        }
        return sum;
    }
    
    public static void main(String[] args){
        int[] myArray={1,2,3,4,5};
        int result=sumArray(myArray);
        System.out.println("The sum of the array is: " + result);
    }
}
