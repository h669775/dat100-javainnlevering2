package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) {
			for (int element : rad) {
				System.out.println(element + " ");
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		StringBuilder streng = new StringBuilder();
		
		for (int i = 0; i < matrise.length; i++) {
			for (int  j = 0; j < matrise[i].length; j++) {
				streng.append(matrise[i][j]);
				
				if (j < matrise[i].length) {
					streng.append(" ");
				}
			}
			if (i < matrise.length) {
				streng.append("\n");
			}
		}
		return streng.toString();
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nymatrise = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nymatrise[i][j] = matrise[i][j] * tall;
			}
		}
		
		return nymatrise;

	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		 boolean liktabell = true;

		 if (a.length != b.length) {
		        liktabell = false;
		    } else {
		        for (int i = 0; i < a.length; i++) {
		            if (a[i].length != b[i].length) {
		                liktabell = false;
		                break; 
		            }
		            for (int j = 0; j < a[i].length; j++) {
		                if (a[i][j] != b[i][j]) {
		                    liktabell = false;
		                    break; 
		                }
		            }
		        }
		    }

		    return liktabell;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		int n = matrise.length;
		int[][] speila = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				speila[i][j] = matrise[j][i];
				
			}
			
		}
	return speila;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] result = new int[a.length][b[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
	                result[i][j] += a[i][k] * b[k][j];
	            }
			}
			
		}
		return result;
	}
}
