public class Cetakan{
	public static void main (String [] args){
	System.out.print("Nama : ");
	System.out.println("Agung");
	System.out.println("Ganteng");
	System.out.println();
	
	byte tipeByte = -128;
	System.out.println(tipeByte);
	int tipeInt = 5000000;
	System.out.println(tipeInt);
	long tipeLong = 9000000000000l;
	System.out.println(tipeLong);
	float tipeFloat = 3.33333f;
	System.out.println(tipeFloat);
	double tipeDouble = 4.4597905d;
	System.out.println(tipeDouble);
	
	char tipeChar = 'a';
	String tipeString = "agung sayang shendy";
	System.out.println(tipeChar);
	System.out.println(tipeString);
	boolean agungSayangShendy = true;
	
	int[] intArray = new int[10];
	String[] stringArray = new String[3];
	float[] floatArray = new float[5];
	
	stringArray[0] = "agung";
	stringArray[1] = "shendy";
	stringArray[2] = "sayang";
	
	for(int i = 0; i < stringArray.length; i++){
	  System.out.println(stringArray[i]);
	}
	
	String[] namaHari = new String[]{"senin", "selasa", "rabu"};
	for(int i = 0; i < namaHari.length; i++){
	  System.out.println(namaHari[i]);
	}
	}
}
