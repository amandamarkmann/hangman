package se.lexicon.amanda.hangman_game;

import java.util.Scanner;

public class App 
{

	private static final Scanner scanner = new Scanner (System.in);


    public static void main( String[] args )
    {
		 
		 boolean notPlaying = false; //för att spelet ska fortsätta 

		 
		 
		 while(!notPlaying) {
			
			 //get input
			 //check input
			 //return input
	
		 
		 
    	 for(int guess=1; guess<=amountOfGuesses; guess++) {  //first try gör som metod
    		 if(guess == 1) {
    			 System.out.println("Welcome to the game, you have ten guesses!");
    			 theWord = getStringFromArray(randomWord);
    			 wordArrays = new char [theWord.length()];
    			 
    			 }
    			 
    			 
    		 if(guess => 10) {
    			 System.out.println("Sorry you lost! The word was " + theWord);
    			
    			 
    			 
    			 System.out.println("Do you want to play again? y/n");
    			   question = scanner.next().charAt(0);
    			    if(question == 'n' || question == 'N') { 
    			    	notPlaying = false;	
    			    }
    			    else (question == 'y' || question == 'Y'){
    			    	notPlaying = true;
    			    	//till ny omgång
    			    }
    		 }
    		 
    		 
    		 } 
    		 
    		 
    		 
    		 }
    		 
    		 
    		 
    	 }
    		 
   
    
    	
    }
    	
    public boolean showLetters() {
    	boolean goodGuess = false;
    	for (int cl=0; cl<theWord.lenght(); cl++) //cl = correct letter{
    		if
    	
    	
    	
    }
    
    
    
    	//array
    	//strings
    	//Stringbuilder för alla felgissningar
    	//10 gissningar - annars game over
    	//ska finnas flera ord att "välja" mellan som slumpas, ca 5 st
    	//correct guesses inside a char array
    	//unrevealed letters represented with a lower dash _
    	//ska kunna gå att gissa både bokstäver och ord
    	//loop
    	
    	 	
   
    
    }

    


