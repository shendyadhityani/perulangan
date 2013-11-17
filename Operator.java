import static java.lang.Math.*;
import static java.lang.System.*;
public class Operator{
  public static void main(String[] args){
	int a = 10;
	int b = 4;
	
	int c = a + b;
	int d = a - b;
	int e = a * b;
	float x = (float) a;
	float y = (float) b;
	float f = x / y;
	int g = a % b;
	double h = Math.pow(b, 2);
	double ii = sqrt(b);
	
	out.println(c);
	out.println(d);
	out.println(e);
	out.println(f);
	out.println(g);
	out.println(h);
	out.println(ii);
	
	// operator logika
	int i = 1; 
	int j = 0;
	// < > <= >= != == && ||
	out.println(i > j); //true
	out.println(i < j); //false
	out.println(i <= j); //false
	out.println(i >= j); //true
	out.println(i !=  j); //true
	out.println(i == j); //false
	out.println(true && false); //false
	out.println(true || false); //true
	
  }
}
