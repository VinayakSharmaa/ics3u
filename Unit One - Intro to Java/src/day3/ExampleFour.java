package day3;

public class ExampleFour {
    public static void main(String[] args) {
        int mark1 = 87, mark2 = 97, mark3 = 63;
        int numMarks = 3; 
    
        // explicit cast on numMarks to convert to a double temporary
        // double average = (mark1 + mark2 + mark3) / (double)numMarks; // 82.33333
        // double average = (mark1 + mark2 + (double)mark3) / numMarks; // 82.33333
        double average = (double)((mark1 + mark2 + mark3) / numMarks); // useless explicit cast
        // average = (mark1 + mark2 + mark3 / numMarks); // same as above but this is implicit
        
        int x = 38;
        int y = 13;
        int sum = x + y;
        double avg =  (sum / (double) 2);   


        int w = 10;
        int z = w / 3;
        System.out.println(z);
            
        


        System.out.println(avg);
    
    
        }
}
