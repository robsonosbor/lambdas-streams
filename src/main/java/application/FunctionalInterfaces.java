package application;

import entities.validators.Validator;

public class FunctionalInterfaces{

	public static void main(String[] args) {
		
		// Using Runnable interface
		/*Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Using Rannable and Thread separatly");
				for (int i = 1; i <= 10; i++) {
					System.out.printf("%d ", i);
				}
				
			}
		};

		new Thread(r).start();
		
		// Using Thread direct
		Thread t1 = new Thread(() -> {
			System.out.println("\nUsing code inside Thread");
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%d ", i);
			}
		});
		
		t1.start();*/
		
		
		// Own functional interfaces
		new Thread(() -> {
			System.out.println();
			System.out.println("Using own validators");
			Validator<String> validatorCEP = 
					valor -> valor.matches("[0-9]{5}-[0-9]{3}");		
			System.out.println("Validando o CEP: 04101-300");
			System.out.println(validatorCEP.valida("04101-300"));
		}).start();
		
		Runnable o = () -> {
			System.out.println("Who am I? What Lambda?");
		};
		 System.out.println(o);
		 System.out.println(o.getClass());
		 
		 // Captura	de	variáveis	locais
		 /*
		  * A variável deve	 ser  efetivamente final. Isso é, apesar de	 não
		  * precisar declarar as variáveis locais como final,	você não pode
		  * alterá-las se estiver utilizando-as dentro do lambda.
		  */
		 System.out.println("Captura de variáveis locais");
		 final int numero = 5;
		 new Thread(() -> System.out.println(numero)).start();
	}

}
