package Day1;

public class AnimalMain {

	public static void main(String[] args) 
	{
		Dog d = new Dog(2.5,3,"Rockey");
		Lion l = new Lion(4.1,7);
		
		System.out.println(d.age);
		System.out.println(d.height);
		System.out.println(d.petName);
		d.eat();
		d.sleep();
		d.bark();
		
		System.out.println("---------------------------------");
		System.out.println(l.age);
		System.out.println(l.height);
		l.height = 6.3;
		System.out.println(l.height);
		l.eat();
		l.sleep();
		l.roar();
 
	}

}
