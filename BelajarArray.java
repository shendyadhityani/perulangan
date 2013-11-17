public class BelajarArray{
	public static void main (String[] args){
		String[] namaBulan = new String[12];
		namaBulan[0] = "Januari";
		namaBulan[1] = "Februari";
		namaBulan[2] = "Maret";
		namaBulan[3] = "April";
		namaBulan[4] = "Mei";
		namaBulan[5] = "Juni";
		namaBulan[6] = "Juli";
		namaBulan[7] = "Agustus";
		namaBulan[8] = "September";
		namaBulan[9] = "Oktober";
		namaBulan[10] = "November";
		namaBulan[11] = "Desember";
		
		for(int i = 0; i < namaBulan.length; i++){
			System.out.println(namaBulan[i]);
			}
		
		int[] bilGenap = new int[10];
		for (int i=0; i < bilGenap.length; i++){
			bilGenap[i] = i*2;
			System.out.println(bilGenap[i]);
		}
			
		int[] bilGanjil = new int[10];
		for (int i=0; i < bilGanjil.length; i++){
			bilGanjil[i] = (i*2)-1;
		}
			
		for (int i=0; i < bilGanjil.length ; i++){
			System.out.println(bilGanjil[i]);
		}
		
		
		int baris = 3;
		int kolom = 2;
		int[][] array2d = new int[baris][kolom]; // array dimensi sebanyak 3 baris 2 kolom
		
		array2d[0][0] = 1;
		array2d[0][1] = 2;
		array2d[1][0] = 3;
		array2d[1][1] = 4;
		array2d[2][0] = 5;
		array2d[2][1] = 6;
		
		for(int i = 0; i < baris; i++){
			for(int j = 0; j < kolom; j++){
				System.out.print(array2d[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(" ");
		
		int x = 3;
		int y = 3;
		int z = 1;
		int[][] array2dgenap = new int[x][y];
		for (int i=0; i < x; i++){
			for(int j=0; j < y; j++){
			array2dgenap[i][j] = z*2;
			z=z+1;
			
			System.out.print(array2dgenap[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
