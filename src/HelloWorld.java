
public class HelloWorld {

	public static void main(String[] args) {
		
		Person lab_rat = new Person();
		
		lab_rat.setName("John");
		lab_rat.setAge(23);
		lab_rat.setGender('M');
		
		lab_rat.personInfo();
		lab_rat.happyBirthday();
		
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
