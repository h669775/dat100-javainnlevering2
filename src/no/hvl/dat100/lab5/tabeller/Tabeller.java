package no.hvl.dat100.lab5.tabeller;


public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		 for (int i = 0; i < tabell.length; i++) {
			 System.out.println(tabell[i]);
		 }
		

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		 StringBuilder streng = new StringBuilder("[");
		    for (int i = 0; i < tabell.length; i++) {
		        streng.append(tabell[i]);
		        if (i < tabell.length - 1) {
		            streng.append(","); 
		        }
		    }
		    streng.append("]");
		    
		    return streng.toString();
		
	}

	// c)
	public static int summerFor(int[] tabell) {
		
		int sum = 0;
		for (int  i = 0; i < tabell.length; i++) {
			sum +=tabell[i];
		}
		System.out.println(sum);
		
		return sum;
	}
	public static int summerWhile(int[] tabell) {

		int sum = 0;
		int i = 0;
		
		while(i<tabell.length) {
			sum += tabell[i];
			i++;
		}
		System.out.println(sum);
		
		return sum;
	}
	public static int summer(int[] tabell) {
		
		int sum = 0;
		for (int tall : tabell) {
			sum += tall;
		}
		System.out.println(sum);

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean found = false;
		
		for (int i = 0; i <tabell.length; i++) {
			if (tabell[i] == tall) {
				found = true;
				break;
			}
			if (found) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
		
		return found;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i++) {
	        if (tabell[i] == tall) {
	            return i; 
	        }
	    }
	    return -1; 
	}
	

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reversertTabell = new int[tabell.length];

	    for (int i = 0; i < tabell.length; i++) {
	        reversertTabell[i] = tabell[tabell.length - 1 - i];
	    }
		return reversertTabell;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		boolean found = true;
		for (int i = 0; i < tabell.length-1; i++) {
			if (tabell[i] > tabell[i+1]) {
				found = false;
				break;
			}
		}
		if (found) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		return found;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		 int lengde1 = tabell1.length;
		 int lengde2 = tabell2.length;
		 int totalLengde = lengde1 + lengde2;
		 
		int[] sammensattTabell = new int[totalLengde];
		
		for (int i = 0; i < lengde1; i++) {
	        sammensattTabell[i] = tabell1[i];
	    }

	    
	    for (int i = 0; i < lengde2; i++) {
	        sammensattTabell[lengde1 + i] = tabell2[i];
	    }
			
		return sammensattTabell;
	}
}
