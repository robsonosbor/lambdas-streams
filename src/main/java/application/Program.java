package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import entities.User;

public class Program {

	public static void main(String[] args) {
		User user1 = new User("Paul Green", 150);
		User user2 = new User("Robert Blue", 120);
		User user3 = new User("Mary Brown", 190);

		List<User> usuarios = Arrays.asList(user1, user2, user3);
		
		// Running the list with for
		System.out.println("Running the list with for");
		for (User user : usuarios) {
			System.out.println(user.getName());
		}

		// Using anonimous class
		System.out.println("\nUsing anonimous class");
		Consumer<User> mostrador = new Consumer<User>() {
			public void accept(User user) {
				System.out.println(user.getName());
			}
		};
		
		for (User user : usuarios) {
			mostrador.accept(user);
		}
		
		// Introducing the Lambda concept
		System.out.println("\nIntroducing the Lambda concept");
		usuarios.forEach(u -> System.out.println(u.getName()));
		
		// Changing properties with Lambda
		System.out.println("\nChanging properties with Lambda");
		System.out.println("Before:");
		usuarios.forEach(u -> System.out.println(u.isModerator()));
		
		usuarios.forEach(u -> u.changeModerator());
		
		System.out.println("After:");
		usuarios.forEach(u -> System.out.println(u.isModerator()));

	}

}
