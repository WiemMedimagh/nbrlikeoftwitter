package tn.isima.tp2;
 import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
 import org.apache.hadoop.io.Text;
 import org.apache.hadoop.mapreduce.Mapper;
 import java.io.IOException;
 import java.util.StringTokenizer;
 public class TorkanizerMapper extends Mapper<LongWritable, Text, NullWritbale, text>{
 
 public static boolean isNumeric(String string) {
 Double intValue;
 System.out.println(String.format("Parsing string: \"%s\"", string));
 if(string == null || string.equals("")) {
 System.out.println("String cannot be parsed, it is null or empty.");
 return false;
 }
 
 try {
 intValue = Double.parseDouble(string);
 return true;
 } catch (NumberFormatException e) {
 System.out.println("Input String cannot be parsed to Integer.");
 }
 return false;
}
 
 private Text word = new Text();
public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

    //According to my knowledge we are using this to set the line as a string
    String line = value.toString();

    //each string is now divided into indovidual words 
    StringTokenizer tokenizer = new StringTokenizer(line);

    //How are we setting the end limit of the loop ?
    while (tokenizer.hasMoreTokens()) {
        //what is word.set operation is doing here?
        word.set(tokenizer.nextToken());
    }

    //What is context ? and how are we giving the output to the reducer?
    context.write(word, one);
}
}
