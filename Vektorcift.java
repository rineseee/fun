/**
*Shkrunai nje funsion ne java qe kthen si rezultat shumen e anetareve
*cift ne pozitat tek te vektorit A(n).
*/

public class Detyra_3_Vektor_Cift{
	public static void main(String[] args) {
		int[] v = { 1, 2 , 3 , 4 , 5 , 6 , 7, 8, 9, 10};
		int sum = 0;
		for (int i=0; i <.length; i++) {
			if (v[i] % 2== 0) {
				sum += v[i];
				
			}
		}
		System.out.println(sum);
	}
}

			