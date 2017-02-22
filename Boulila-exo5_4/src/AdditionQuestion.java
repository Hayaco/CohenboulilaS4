import java.util.Scanner;

public class AdditionQuestion {

    private int a, b;  // The numbers in the problem.
	private static Scanner sc;

    public AdditionQuestion() { // constructor
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }

    public String getQuestion() {
        return "What is " + a + " + " + b + " ?";
    }

    public int getCorrectAnswer() {
        return a + b;
    }

    public static void main(String[] args ){
    	sc = new Scanner(System.in);
    	int compteur =0;
    	for (int i=0; i<10;i++){
    		AdditionQuestion addquestion =new AdditionQuestion();
    		String addition = addquestion.getQuestion();
    		System.out.println(addition);
    		int nbEntree = sc.nextInt();
    		int correct = addquestion.getCorrectAnswer();
    		if(nbEntree==correct)
    			compteur+=10;
    	
    	}
    	System.out.println("Votre score est de : "+compteur);
    	
    }
}
