public class ArrayAverage {

    public static void main(String[] args){
        double[] numbers={5.5,7.2,9.1,6.8,8.3};
        double sum=0;

        for(double number:numbers){
            sum+=number;
        }

        double average=sum/numbers.length;
        System.out.println("The average is: "+average);
    }
    
}
