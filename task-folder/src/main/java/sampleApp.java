import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class sampleApp {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("SampleApp");
        System.out.println("Hello this is a task ");
    }
}
