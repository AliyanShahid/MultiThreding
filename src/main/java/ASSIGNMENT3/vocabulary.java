 package ASSIGNMENT3;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class vocabulary extends Thread{
	public void run() {
		synchronized (this)
		{
			String [] text = new String [1000000];
			int temp= 0;
			try 
			 {
			      File fobj = new File("vocabulary.txt");
			      Scanner scanner = new Scanner(fobj);
			      while (scanner.hasNextLine()) 
			      {
			    	temp++;
			        String data = scanner.nextLine();
			        text[temp-1] = data;
			      }
			      scanner.close();
			 } catch (FileNotFoundException e)
	         {
			      System.out.println("Error.");
			      e.printStackTrace();
			 }
			 text[temp] = "\0"; 
			 Binary_Search_Tree BST = new Binary_Search_Tree();
			 for (int i=0; text[i] != "\0" ; i++)
			 {
				 BST.aWord(text[i]);
			 }
			 BST.traversePostOrder();
		}
		}
	
} 