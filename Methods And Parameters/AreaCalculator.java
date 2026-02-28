public class AreaCalculator {

    // Method to calculate the area of a square
    int calculateArea(int side){
        return side*side;
    }

    // Method to calculate the area of a rectangle
    int calculateArea(int length,int width){
        return length*width;
    }
    
    public static void main(String[] args){
        AreaCalculator calculator=new AreaCalculator();
        System.out.println("Area of square: " + calculator.calculateArea(5)); // Calls the first calculateArea method
        System.out.println("Area of rectangle: " + calculator.calculateArea(5, 10)); // Calls the second calculateArea method
        }
}
