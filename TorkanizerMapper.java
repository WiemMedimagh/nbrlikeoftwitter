package tn.isima.tp2;
 import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
 import org.apache.hadoop.io.Text;
 import org.apache.hadoop.mapreduce.Mapper;
 import java.io.IOException;
 import java.util.StringTorkanizer;
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
 public void map(LongWritable key, Text value, Mapper.Context context ) throws IOException, InterruptedException {
 String line=value toString();
	 String[] data= linesplit.('/t');
	 Integer.followers=Integer parseInt(data[1]);
	 User like=followersPriortyQueue.peek();

 while (itr.hasMoreTokens()) {
 v=itr.nextToken();
 if (i==2){
 influenceurs=v.toString();}
if (i>2 && isNumeric(v.toString())){
 like=Double.parseDouble(v.toString());
context.write(new Text(influenceurs), new DoubleWritable( like));}
	 
System.out.println("influenceurs="+influenceurs+"like="+ like);
 i++;
	 
	 
 }
	 
	 
 }
}
