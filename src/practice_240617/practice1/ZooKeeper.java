package practice_240617.practice1;

import practice_240614.practice5.Herbivore;

public class ZooKeeper {

	// void feed(Tiger tiger) {
	// 	System.out.println("feed meat");
	// }
	//
	// void feed(Lion lion) {
	// 	System.out.println("feed fish");
	// }
	void feed(Predator predator) {
		System.out.println(predator.getFood());
	}

	void feed2(Herbivore herbivore) {
		System.out.println("feed grace");
	}
}
