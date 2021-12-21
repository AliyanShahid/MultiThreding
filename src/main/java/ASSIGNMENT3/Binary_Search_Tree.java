package ASSIGNMENT3;

public class Binary_Search_Tree {
			private String word;
		    private Binary_Search_Tree left;
		    private Binary_Search_Tree right;
		    public Binary_Search_Tree() {
		        this.word = null;
		        this.left = null;
		        this.right = null;
		    }
		    public Binary_Search_Tree (String word) {
		        this.word = word;
		        this.left = null;
		        this.right = null;
		    }
		    public void aWord(String word) {
		        if (this.word != null) 
		        {
		            if (this.word.compareTo(word) > 0)
		            {
		                if (this.left != null)
		                {
		                    this.left.aWord(word);
		                } 
		                else
		                {
		                    this.left = new Binary_Search_Tree(word);
		                }
		            }
		            else
		            {
		                if (this.right != null)
		                {
		                    this.right.aWord(word);
		                }
		                else
		                {
		                    this.right = new Binary_Search_Tree(word);
		                }
		            }
		        }
		        if (this.word == null) 
		        {
		            this.word = word;
		        }
		    }
		    public void traversePostOrder() {
		        if (this.left != null) {
		            this.left.traversePostOrder();
		        }
		        if (this.right != null) {
		            this.right.traversePostOrder();
		        }
		        System.out.println(this.word);
		    }
			 
}