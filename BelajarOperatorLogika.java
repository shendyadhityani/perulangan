import static java.lang.System.*;
public class BelajarOperatorLogika{
  public static void main(String... args){
	out.println("belajar");
	
	boolean r1 = (1 > 0) || (5 > 8);
	boolean r2 = (true && false) && (-9 > 9);
	boolean r3 = (true && (1 > 9));
	boolean r4 = (( 1 != 1 ) && (9 > 1) && (true && false));
	boolean r5 = ((( 2 / 2 ) > 9) || (false || true));
	boolean r6 = (new String[]{}).length > 9 || true;
	
	out.println(r1); // true
	out.println(r2); // false
	out.println(r3); // false
	out.println(r4); // false
	out.println(r5); // true
	out.println(r6); // true
  }
}
