package polymorphism;

public class Zoo {
		
	private Cat[] cats= new Cat[10];
	private Dog[] dogs=new Dog[20];
	
	private Animal[] animals=new Animal[30];
	
	protected void addAnimal(Animal animal,int index) {
		System.out.println("Added : "+ animal);
		animals[index]=animal;
	}
	
	public void showAnimal() {
		
		int i=1;
		for(final Animal animal: animals) {
			if(animal== null) continue;
			System.out.println("  animal # " + i + " - "+animal);
			animal.makeSound();
			animal.eat();
			animal.walk();
			System.out.println("");
			i++;
		}
	
	}
	
	protected void addCat(Cat cat,int index) {
		System.out.println("Added : "+ cat);
		cats[index]=cat;
	}
	
	public void showCat() {
		
		int i=1;
		for(final Cat cat: cats) {
			if(cat == null) continue;
			System.out.println(" Cat # " + i + " - "+cat);
			cat.makeSound();
			cat.eat();
			cat.walk();
			System.out.println("");
			i++;
		}
	
	}
	
	protected void addDog(Dog dog,int index) {
		System.out.println("Added : "+ dog);
		dogs[index]=dog;
	}
	
	public void showDog() {
		
		int i=1;
		for(final Dog dog: dogs) {
			if(dog == null) continue;
			System.out.println(" Dog # " + i + " - "+dog);
			dog.makeSound();
			dog.eat();
			dog.walk();
			System.out.println("");
			i++;
		}
	
	}
	
}
