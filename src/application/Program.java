package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class Program {
	public static void main(String[] args) throws ParseException {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	Date a = data1.parse("30/06/2021");
	Date b = data2.parse("30/06/2021 15:42:07");
	Date c = new Date();
	System.out.println(data1.format(a));
	System.out.println(data2.format(b));
	System.out.println(data2.format(c));
	
	sc.close();
	}
}