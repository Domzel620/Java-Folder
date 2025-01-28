import java.util.ArrayList;
import java.util.Scanner;
public class DataInput {
    private ArrayList<Double> dataset;
    private int size;
    
    public DataInput(){
        dataset = new ArrayList<>();
        size = 0;
    }
    public ArrayList<Double> dataInput(){
        Scanner scanner = new Scanner(System.in);
            // Now initialize the array
            System.out.print("What is the size of your dataset? ");
            size = scanner.nextInt();
            

            // Now put in your data set values
            System.out.println("Enter your data here (One value at a time): ");
            for (int i = 0; i < size; i++) {
                dataset.add(scanner.nextDouble());
            }         
            
            return dataset;
        }
    public void printDataSet(){
        System.out.println("The Data set is: ");
            for (double data : dataset){
                System.out.print(data + ", ");
            }
            System.out.println(); // Move to a new line after printing the dataset
    }
}
