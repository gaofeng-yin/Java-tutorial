import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		
		BluePen pen = new BluePen();
		
		pen.setColor("blue");
		
		pen.printColor();
		
		pen.write();
		
		pen.earse();
		
		
		/* array and sort array 
		int[] numbers = {89,23,2,9,5,4,7,1,34};
		
		int temp;

		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++ ) {
				if(numbers[i]>numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		//loop array
		System.out.println("First form:\n");
		for(int d = 0; d < numbers.length; d++) {
			System.out.println(numbers[d]);
		}
		//simple way to loop array
		System.out.println("Second form:\n");
		for(int integers: numbers) {
			System.out.println(integers);
		}
		*/
		/* Drink Game
		John j = new John();
		
		j.setGender('M');
		j.setName("Joao");
		j.setAge(18);
		
		j.drinkAlcool("whisky");
		j.drinkAlcool("Gin");
		j.drinkAlcool("whisky");
		j.drinkAlcool("Gin");
		j.drinkAlcool("whisky");
		j.drinkAlcool("cola");
		*/
		/* credit cards
		Date date = new Date();
		
		DebitCard card = new DebitCard("yin",3122333,date,151);	
		
		DebitCard gold = new DebitCard("Lobo", 31232133,date,90);
		*/
		
		/* class person
		Person lab_rat = new Person();
		
		lab_rat.setName("John");
		lab_rat.setAge(23);
		lab_rat.setGender('M');
		
		lab_rat.personInfo();
		lab_rat.happyBirthday();
		*/
		
		/* Print hello world
		System.out.println("Hello world!");
		*/
		
		/* create a variable and then print it in console
		int number = 23;
		
		String str = "This is string!";
		
		char ch = 'c';
		
		System.out.println(number);
		System.out.println(str);
		System.out.println(ch);
		*/
		
		/* cicle for 
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		*/
		
		/* if and else statement
		int number = 7;
		
		if(number < 4) {
			System.out.println("Number is greater than 4!");
		}else {
			System.out.println("Chose other number!");
		}
		*/
		
		/* while statement
		int i = 0;
		
		while(i < 10) {
			System.out.println("I'm too small, i need level up!");
			i++;
		}
		
		System.out.println("Finally i'm level " + i +"!!");
		*/
		
		/* do while statement
		int d = 0;
		
		do {
			d++;
		} while(d < 10);
		
		System.out.println("Ups, i'm level " + d + "!!");
		*/
	}

}
