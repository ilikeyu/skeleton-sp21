/** Class that print out a graph of triangle of stars with a given nature integer N
 *  @author likeyu
 *  @source CS61B
 */

public class DrawTriangle {

	/** Pass a number N, print out a triangle. */
	public static void drawTri(int n){
		if (n <= 0) {
			System.out.println("Input Error!");
		}

		for (int i=1; i<=n ;i++ ) {
			int k = i;
			while(k > 0){
				System.out.print("* ");
				k = k-1;
			}
			System.out.println();	
		}

	}

	public static void main(String[] args) {
		int n = 10;
		drawTri(n);
	}
}