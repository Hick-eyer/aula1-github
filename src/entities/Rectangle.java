package entities;

public class Rectangle {
	public double height;
	public double width;
	
	public double Area() {
		return height *width;
	}
	public double Perimeter() {
		return (height*2)+(width*2);
	}
	public double Diagonal() {
		return Math.sqrt((height*height) + (width*width));
	}
	
	public String toString() {
		return "Altura" + height +"\nLargura"+ width + "\nPerimetro:" + this.Perimeter()+"\nArea:"+this.Area()+"\nDiagonal:" + this.Diagonal();
	}
}
