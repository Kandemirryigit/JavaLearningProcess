public class CircleArea{

    public static double calculateArea(double radius){
        if(radius<0){
            return -1;
        }
        return Math.PI*radius*radius;
    }

    public static void main(String[] args){
        double area=calculateArea(5.0);
        if(area==-1){
            System.out.println("Invalid radius!");
        }else{
            System.out.println("The area of the circle is: " + area);
        }
    }



}