package Basic_Knowledge;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackSyntax {

	public static void main(String[] args) {
		
		Stack<String> book = new Stack<>();
		
		book.push("Conan");
		book.push("Keto");
		book.push("Japan");
		book.push("Computer");
		book.push("Clothes");
		book.push("Food");
		book.push("Wine");
		
		//remove
		String lastStackObject = book.pop();
		
		//check what is the last object
		String food = book.peek();
		
		//search an object in stack
		book.search("Japan");
		
		System.out.println("food as a last object of book: " + food);
		System.out.println(lastStackObject);
		System.out.println(book.isEmpty());
		System.out.println(book);
		
}
}