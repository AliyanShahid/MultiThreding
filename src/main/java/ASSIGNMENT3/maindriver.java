package ASSIGNMENT3;

import java.util.Scanner;
import java.util.*;

public class maindriver {
	public static void main(String[] args) throws InterruptedException {
		int ch;
		Scanner scanner= new Scanner(System.in);
		int total_files = 3;
		String [] nfile = new String[3];
		System.out.println("Total Files = " + total_files);
		nfile[0] = "vocabulary.txt";
		nfile[1] = "inputfile1.txt";
		nfile[2] = "inputfile2.txt";
		for(int i=0;i<3;i++) 
		{
			System.out.println(nfile[i]);
		}
		do {
		System.out.println("Choose from the following menu");
		System.out.println("1. Display BST build from Vocabulary File");
		System.out.println("2. View Match words and its frequency");
		System.out.println("3. Display Vectors build from Input files");
		System.out.println("4. Search a query");
		System.out.println("5. Quit");
		ch= scanner.nextInt();
		try {
    		if(ch >= 6 ) 
    			throw new optionException("Wrong option selected");
    		}
    		catch(optionException e) {
    			System.err.println(e);
    		}
				if (ch == 1) {
					System.out.println("1. Displaying BST build from Vocabulary File");
					vocabulary vt = new vocabulary();
					vt.start();
					vt.join();
				 }
		}while(ch!= 5);
			}
}
