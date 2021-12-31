package tn.isima.tp2;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public  class TokenizerMapper
extends Mapper<LongWritable, Text, Text, IntWritable>{


private IntWritable nbrlike= new IntWritable();

private Text Key=new Text();
public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

    String line = value.toString();

	String[] data=line.split("\t");
	
	Key.set(data[0]);
	int like= Integer.parseInt(data[1]);
	nbrlike.set(like);
	
		
	System.out.println("author="+Key+"Nombre de like="+ nbrlike);
	context.write(Key,Max);
		
}
}
