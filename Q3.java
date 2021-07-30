import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
public class Q3
{
   public static void main(String[] args)
   {
      String input = "06:32:43 PM";
      DateFormat formattgl = new 
      
      SimpleDateFormat("hh:mm:ss aa");
      DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
      Date tgl = null;
      String result = null;
      try{
    	 tgl= formattgl.parse(input);
    	 result = outputformat.format(tgl);
         System.out.println(input + " = ");
    	 System.out.println(result);
      }catch(ParseException pe){
         pe.printStackTrace();
       }
   }
}