import java.util.ArrayList;

public class StatsLibrary {
    DataInput data = new DataInput();
    private double sum;
    private double mean;
    private double sqrsum;
    private double variance;
    private double stnddev;
    private int n;
    private int x;
    private ArrayList<Double> dataset;
    private ArrayList<Double> deviation;
    private ArrayList<Double> sqrdeviation;

    //Constructor
    public StatsLibrary(){
        sum = 0;
        mean = 0;
        sqrsum = 0;
        variance = 0;
        stnddev = 0;
        n = 0;
        x = 0;
        dataset = new ArrayList<>();
        deviation = new ArrayList<>();
        sqrdeviation = new ArrayList<>();
    }
    //Gets the dataset from DataInput Class
    public ArrayList<Double> getDataSet(){
        dataset = data.dataInput();
        n = dataset.size();
        return dataset;
    }

    public void printDataset(){
        if(n<1){
            getDataSet();
        }
        System.out.println("This is your dataset: ");
        for(double num : dataset){
            System.out.print(num + ", ");
        }
        System.out.println();
    }
    
    //Finds the mean of your dataset
    public double mean(){
        if (n<1){
            getDataSet();
        }
        sum = 0;
        for (double numbers : dataset){
            sum += numbers;
        }
        mean = sum/n;
        return mean;
    }

    //Prints the Mean
    public void printMean(){
        System.out.println("This is your Mean: " + mean());
    }

    public double variance(){
        if(mean == 0){
            mean = mean();
        }
        deviation.clear();
        sqrdeviation.clear();
        //This subtracts the mean
        for(double numbers : dataset){
            numbers = numbers - mean;
            deviation.add(numbers); 
        }
        //Squares the subtracted values and adds them to a new list
        for(double num : deviation){
            num = Math.pow(num, 2);
            sqrdeviation.add(num);
        }
        //This adds squared balues together
        sqrsum = 0;
        for(double num : sqrdeviation){
            sqrsum += num;
        }
        //This finds the Variance
        x = n - 1;
        variance = sqrsum/x;
        return variance;
    }

    //This prints the variance
    public void printVariance(){
        System.out.println("This is your variance: " + variance());
    }

    //This finds the Standard Deviation
    public double standardDev(){
        if (mean == 0){
            variance = variance();
        }else if (variance == 0) {
            variance = variance();
        }
        stnddev = Math.sqrt(variance);
        return stnddev;
    }

    //This prints the standard deviation
    public void printStandardDev(){
        System.out.println("This is your standard Deviation: " + standardDev());
    }
}