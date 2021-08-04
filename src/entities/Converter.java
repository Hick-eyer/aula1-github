package entities;

public class Converter {
	
	public static double DOLLAR = 3.10;
	
	public static double ConvertDol(double vlr) {
		return vlr * (DOLLAR + (DOLLAR*6/100));
	}
}
