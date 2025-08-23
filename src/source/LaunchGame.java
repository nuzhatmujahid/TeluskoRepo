package source;

import java.util.Scanner;
/*
 * 1. Umpire will initiate the game
 * 2. Player1, Player2 and Player3 will give 1 number each
 * 3. Guesser will guess the number
 * 4. If guesser number matches with any player that player will win*/

class Guesser{
	int guessedNum ;
	
	int guissingNumber(){
		System.out.println("Guesser ! Guess the Number Between 1 to 10 ----->>>>> ");
		Scanner s = new Scanner(System.in);
		guessedNum = s.nextInt();
		if(guessedNum >=1 && guessedNum <=10) {
			return guessedNum;
		}
		else {
			guissingNumber();
		}
		return 0;
	}
}

class Players{
	int guessedNum ;
	
	int guissingNumber(int playerNum){
		System.out.println("Player : "+playerNum+" ! Guess the Number ----->>>>> ");
		Scanner s = new Scanner(System.in);
		guessedNum = s.nextInt();
		if(guessedNum >=1 && guessedNum <=10) {
			return guessedNum;
		}
		else {
			guissingNumber(playerNum);
		}
		return 0;		
	}	
}

class Umpire{
	int guesserNumber;
	int playerOneNum; 
	int playerTwoNum; 
	int playerThreeNum; 
	
	void collectNumberFromGuesser(){
		Guesser g  = new Guesser();
		guesserNumber = g.guissingNumber();
	}
	
	void collectNumberFromPlayer() {
		Players p1 = new Players();
		Players p2 = new Players();
		Players p3 = new Players();
		
		playerOneNum = p1.guissingNumber(1);
		playerTwoNum = p2.guissingNumber(2);
		playerThreeNum = p3.guissingNumber(3);
	}
	void compare() {
		if(guesserNumber == playerOneNum && guesserNumber == playerTwoNum && guesserNumber == playerThreeNum) {
			System.out.println("Hurray!! All Players won the game.......");
		}
		else if(guesserNumber != playerOneNum && guesserNumber != playerTwoNum && guesserNumber != playerThreeNum) {
			System.out.println("OOPS All Players loss the game...");
		}	
		else if(guesserNumber == playerOneNum) {
			if(guesserNumber == playerTwoNum) {
				System.out.println("Player 1 and 2 are Winner!!!!");
			}else if(guesserNumber == playerThreeNum) {
				System.out.println("Player 1 and 3 are Winner!!!!");
			}else {
				System.out.println("Player 1 is Winner!!!!");
			}
		}
		else if(guesserNumber == playerTwoNum) {
			if(guesserNumber == playerThreeNum) {
				System.out.println("Player 2 and 3 are Winner!!!!");
			}else {
				System.out.println("Player 2 is Winner!!!!");
			}
		}
		else if (guesserNumber == playerThreeNum){
			System.out.println("Player 3 is Winner!!!!");

		}
	}
}

public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exit = 1;
		
		do {
			if(exit == 1) {
				System.out.println("\n ************* Game Started ****************\n ");
				Umpire um = new Umpire();
				um.collectNumberFromGuesser();
				um.collectNumberFromPlayer();
				
				um.compare();
				
				System.out.println("\n ************* Game Completed ****************\n");
				System.out.println("Press 1 to continue and 0 to exit!!!");
				Scanner s = new Scanner(System.in);
				exit = s.nextInt();
			}
		}while(exit == 1);
		System.out.println("************* Game ENDS ****************");
		
	}

}
