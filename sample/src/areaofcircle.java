
	import java.util.Scanner;
	public class areaofcircle {
	   public static void main(String args[]){
	      int radius;
	      double area;
	      var sc = new Scanner(System.in);
	      System.out.println("Enter the radius of the circle ::");
	      radius = sc.nextInt();
	      area = (radius*radius)*Math.PI;
	      System.out.println("Area of the circle is ::"+area);
	   }
	}

