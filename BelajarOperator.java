import static java.lang.Math.*;
import static java.lang.System.*;
public class BelajarOperator {
	public static void main(String[] args){
		int a = 20;
		int b = 6;
		int c = -10;
		double d = 1.4999999;
		// jumlah, kurang, kali, bagi, mod, kuadrat, akar, absolut c, pembulatan kebawah c, pembulatan keatas c
		
		int x = a + b;
		int y = a - b;
		int z = a * b;
		float xx = (float) a / (float) b;
		int yy = a%b;
		double zz = pow(b,2);
		double re = sqrt(zz);
		int cc = abs(c);
		double bb = floor(d);
		double nn = ceil(d);

		out.println(x);
		out.println(y);
		out.println(z);
		out.println(xx);
		out.println(yy);
		out.println(zz);
		out.println(re);
		out.println(cc);
		out.println(bb);
		out.println(nn);
	}
}
