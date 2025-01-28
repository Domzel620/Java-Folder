public class TestStatsLibrary {
    public static void main(String[] args) {
        StatsLibrary stats = new StatsLibrary();
        stats.printDataset();
        stats.printMean();
        stats.printVariance();
        stats.printStandardDev();
        stats.printSortedDataset();
        stats.printMedian();
        stats.printMode();
        System.out.println(stats.printedMedian());
    }
}
