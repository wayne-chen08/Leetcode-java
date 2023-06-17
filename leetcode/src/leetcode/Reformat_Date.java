package leetcode;
import java.util.HashMap;
public class Reformat_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date = "20th Oct 2052";
		System.out.print(reformatDate(date));
	}
	
	public static String reformatDate(String date) {
        String year = date.split(" ")[2];
        String month = date.split(" ")[1];
        String day = date.split(" ")[0];
        
        var month_map = new HashMap<String, String>();{
        	{
        		month_map.put("Jan", "01");
        		month_map.put("Feb", "02");
        		month_map.put("Mar", "03");
        		month_map.put("Apr", "04");
        		month_map.put("May", "05");
        		month_map.put("Jun", "06");
        		month_map.put("Jul", "07");
        		month_map.put("Aug", "08");
        		month_map.put("Sep", "09");
        		month_map.put("Oct", "10");
        		month_map.put("Nov", "11");
        		month_map.put("Dec", "12");
        	}
        }
        
        month = month_map.get(month);
        String result_day = "";
        for(int i = 0; i < 2; i++) {
        	if(Character.isDigit(day.charAt(i))) {
        		result_day += day.charAt(i);
        	}
        }
        
        if(result_day.length() == 1) {
        	result_day = "0" + result_day;
        }
        
        return year + "-" + month + "-" + result_day;
    }

}
