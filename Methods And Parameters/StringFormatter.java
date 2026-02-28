public class StringFormatter {

    public static String formatString(String input){
        if(input==null || input.isEmpty()){
            return "";  // Return an empty string if the input is invalid
        }
        return input.trim().toUpperCase();
    }

    public static void main(String[] args){
        String formatted = formatString("  hello world  ");
        System.out.println("Formatted string: " + formatted);
    }
    
}
