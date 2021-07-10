/** class that calculate whether Achille could reach totoise
 * @author likeyu
 * @source CS61B
 */


public class AchiReachTort{

	/** buggy implementation of AchiReachTort
	 * 1. we assume speed of Achi is twice of Tort
	 * 2. Achi begin at pos 0 while Tort at 100
	 */
	public static void main(String[] args) {
		double apos = 0;
		double tpos = 100.0;
		double aspeed = 20.0;
		double tspeed = 10.0;
		double alltime = 0;
		double reachtime;

		do{

			System.out.println("time has passed: " + alltime);
			System.out.println("Archilies is at position: " + apos);
			System.out.println("Tortoise is at position: "+ tpos);
			System.out.println("------------------");

			reachtime = (tpos - apos) / aspeed;
			alltime += reachtime;
			apos = tpos;
			tpos = tpos + reachtime * tspeed;

		}while(apos < tpos);
	}
	
}