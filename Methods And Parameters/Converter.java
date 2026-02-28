public class Converter {
    
    // Method to convert from Celsius to Fahrenheit
    double convert(int celsius,char to){
        if(to=='F' || to=='f'){
            return (celsius*9.0/5.0)+32;  // Returns fahrenheit if f is passed
        }
        return celsius;  // Returns celsius if 'F' is not passed
    }


    // Method to convert from Fahrenheit to Celsius
    double convert(char from,int fahrenheit){
        if(from=='F' || from=='f'){
            return (fahrenheit-32)*5.0/9.0;   // Returns celcius if f is passed
        }
        return fahrenheit; //Returns fahrenheit if 'F' is not passed.
    }


    public static void main(String[] args){
        Converter converter=new Converter();
        System.out.println("Celsius to Fahrenheit: " + converter.convert(25, 'F')); // Calls the first convert method
        System.out.println("Fahrenheit to Celsius: " + converter.convert('F', 77)); // Calls the second convert method
    }




}
