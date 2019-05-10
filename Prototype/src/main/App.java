package main;

public class App {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Ovelha original = new Ovelha("Ovelha original");
		System.out.println(original.getName()); 

		// Clona e modifica o que for necessario
		Ovelha cloned = original.clone();
		cloned.setName("Ovelha clonada");
		System.out.println(cloned.getName()); 
	}

}
