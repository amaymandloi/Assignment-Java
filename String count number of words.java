import java.io.*;
public class Simple{
 	public static void main(String[] args) throws IOException{
	StreamTokenizer streamTokenizer = new StreamTokenizer(
        new StringReader("12,RutherFord Building,100 Lake Street,Chichago 451001"));
    	
	int word=0,number=0;
    	
	while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
        	if(streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
            		word++;
        	} 
        	if(streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
            		number++;
        	}
    	}
	System.out.println("Word = "+word+" & Number = "+number);  
	}
} 