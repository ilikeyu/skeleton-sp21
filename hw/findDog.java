/**Class that use a specific method to find a doy in an array
 */
import java.util.Random;

public class findDog{

	public static Dog[] largerThanFourNeighbors(Dog[] dogs){
		//record nums selected
		int selecNum = 0;
		int map =1;
		Dog[] dogsSelec = new Dog[10];

		for (int i=0; i<dogs.length ;i++ ) {
			// compare whit 4 neighbors
			map = 1;
			for (int k=i-2; k<=i+2 ;k++ ) {
				if (k<0) {
					continue;
				}
				if (k>=dogs.length) {
					break;
				}
				if (k == i){
					continue;
				}
				else{
					if (dogs[i].size <= dogs[k].size) {
						map = 0;
						break;
					}
				}
			}

			if(map == 1){
				dogsSelec[selecNum] = dogs[i];
				selecNum++;
				i = i+2;
			}
		}

		return dogsSelec;
	}

	public static void printDog(Dog[] dogs){
		for (int i=0; i<dogs.length; i++ ) {
			if (dogs[i] == null) {
				break;
			}
			System.out.print(dogs[i].size + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// initialize dog
		Dog[] dogs = new Dog[10];

		// create an random list
		/*
		Random rn = new Random();
		int maximum = 100;
		int minimum = 10;
		int n = maximum - minimum + 1;

		 */
		int[] sizeDog= { 10, 15, 20, 15, 10, 5, 10, 15, 22, 20};

		//attribut size
		for (int i=0; i<dogs.length; i++ ) {
//			int mm = minimum + rn.nextInt()%n;
//			dogs[i] = new Dog(mm);
			dogs[i] = new Dog(sizeDog[i]);
		}
		printDog(dogs);

		//find the specific dog
		Dog[] dogsSelec = largerThanFourNeighbors(dogs);
		printDog(dogsSelec);
	}
}