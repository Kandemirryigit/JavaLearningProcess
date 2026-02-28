public class StudentGrades {

    public static void main(String[] args){
        // Declare and initialize an array to store student grades
        int[] grades=new int[5];

        // Assign grades to each student
        grades[0]=85;
        grades[1]=90;
        grades[2]=78;
        grades[3]=92;
        grades[4]=88;


        System.out.println("Student Grades:");
        for(int i=0;i<grades.length;i++){
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }


    }
    
}
