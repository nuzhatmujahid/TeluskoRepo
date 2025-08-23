package source;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//After java 14 ne switch syntax
		int dayNum1 = 1;
		switch(dayNum1){
		case 1 -> System.out.println("-> Monday");
			
		case 2 -> System.out.println("-> Tuesday");
		
		case 3 -> System.out.println("-> Wednesday");
		
		case 4 -> System.out.println("-> Thursday");
		
		case 5 -> System.out.println("-> Friday");
		
		case 6 -> System.out.println("-> Saturday");
		
		case 7 -> System.out.println("-> Sunday");
		
	}

	
		//Switch expression
		int dayNum2 = 2;
		String result = "";
		result = switch(dayNum2){
			case 1 -> "Switch expression :  Monday";
				
			case 2 -> "Switch expression :  Tuesday";
			
			case 3 -> "Switch expression :  Wednesday";
			
			case 4 -> "Switch expression :  Thursday";
			
			case 5 -> "Switch expression :  Friday";
			
			case 6 -> "Switch expression :  Saturday";
			
			case 7 -> "Switch expression :  Sunday";
			default -> "Default";
	};
		System.out.println(result);

		
		int dayNum = 5;
		
		switch(dayNum){
			case 1: System.out.println("Monday");
			break;
				
			case 2: System.out.println("Tuesday");
			break;
			
			case 3: System.out.println("Wednesday");
			break;
			
			case 4: System.out.println("Thursday");
			break;
			
			case 5: System.out.println("Friday");
			break;
			
			case 6: System.out.println("Saturday");
			break;
			
			case 7: System.out.println("Sunday");
			break;
			
		}
	}

}
