package exo;

import java.util.TreeSet;
import java.util.Scanner;

public class set {

	public static void main(String []args){
		System.out.println("enter your operation ");
		Scanner user = new Scanner(System.in);
		String ligne= user.nextLine();
		String op; // The operator, +, *, or -.
		
		if (ligne.contains("*")) op="*";
		else if (ligne.contains("+")) {
			op=" +";
			//ligne=ligne.replaceAll("+", " +");
		}
		else if (ligne.contains("-")) op="-";
		else throw new IllegalArgumentException("Error input, not exist operator.");
	
		String [] ens =ligne.split(op);
		
		TreeSet<Integer> A, B;  // The two sets of integers.         
		
		A = Readset(ens[0]);
		B = Readset(ens[1]);
	
		if (op == " +")
	         A.addAll(B);     // Union.
	      else if (op == "*")
	         A.retainAll(B);  // Intersection.
	      else
	         A.removeAll(B);  // Set difference.
	      
	      System.out.print("Value:  " + A);

	}
	
	public static TreeSet<Integer> Readset(String s){
	
		TreeSet<Integer> A= new TreeSet<Integer>();
		if (!(s.contains("[")) || !(s.contains("]")) )
			throw new IllegalArgumentException("Error input, not exist [ or ].");
		System.out.println(s);
		s=s.replaceAll(" ", "");
		s=s.replaceAll("[", "");
		s=s.replaceAll("]", "");
		String [] news=s.split(",");
		System.out.println(news[0]);
		for (int i=0; i<news.length; i++){
			A.add(Integer.parseInt(news[i]));
		}
		return A;
		}
		
}
