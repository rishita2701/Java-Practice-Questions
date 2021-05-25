package volumeOfPrism;
import java.util.*;
public class UsingCommandLineArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base = Double.parseDouble(args[0]);
		double height = Double.parseDouble(args[1]);
		double area = base * height;
        System.out.println("Area of prism is: " + area);
	}

}
