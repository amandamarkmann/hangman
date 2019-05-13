package se.lexicon.amanda.hangman_game;

public class Hangmangame {
	
	private String[] randomWord = new String[]{"syntax","arrays","logic","method","coverage"};
	private String theWord = ""; 
	private char[] wordArray; //array av antal bokstäver i valt ord
	private StringBuilder allGuesses = new StringBuilder(); 
	private int amountOfGuesses = 10;
	
	public Hangman(String theWord) {
		this.theWord = theWord;
		wordArray = new char[this.theWord.length()];
		allGuesses = new StringBuilder();
		amountOfGuesses = 1;
		
		for (int i = 0; i < wordArray.length; i++) {
			 wordArray[i] = '_' + ' '; }
		
			 
	
	

	
	
	

	public String getStringFromArray (String[]randomWord) {
	Random random = new Random();
	String s = randomWord[random.nextInt(randomWord.length)];
	return s;
}
	
	
	
}