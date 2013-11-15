public class TrianglePatternToy{
  private int number;
  
  public TrianglePatternToy(){} // default konstruktor
   
  // konstruktor dg argument utk inisialisasi variable number
  public TrianglePatternToy(int number){ 
    this.number = number;
  }
  
  public void printFirstPattern(){
	for (int i = 0 ; i < number ; i ++) {
		for (int j = 0 ; j <= i ;  j++) {
			System.out.print(j);
		}	
		System.out.println();
	}
		
  }
  
  public static void main(String[] args){
	TrianglePatternToy x = new TrianglePatternToy(10);
	x.printFirstPattern();
	
  }

}
