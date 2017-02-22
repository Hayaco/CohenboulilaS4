package Exo7;
import java.util.*;
/**This class will make an alphabetical list of all the different words in the sentence or group of word,
 * that the user enter as input of the program. 
 * @author haya
 *
 */
public class Alpha {

	private static Scanner sentence;

	public static void main(String []args){
		sentence = new Scanner(System.in);
		String str=sentence.nextLine();
		ArrayList<String> wordList = new ArrayList<String>();
		
		String word="";
		for (int i=0; i < str.length(); i++){
			char c= str.charAt(i); // take the char in the i position
			if (Character.isLetter(c)){
				word+=c;
			}
			else {
				if (wordList.indexOf(word)==-1 && !(word.equals(""))){
					word=word.toLowerCase(); 
					wordList.add(word);	
					}
				word=""; // reinit the word 
				}
		}
		Collections.sort(wordList);
		System.out.println(wordList);
	}
	
	
	
}
