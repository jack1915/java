package T4;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class Set43 {
    public static void main(final String[] args) throws Exception {
		try (Scanner in = new Scanner(System.in)) {
            String str = in.nextLine();
            char[] symbols = str.toCharArray();
            
            Stack<Character> stack = new Stack<>();
            int counter = 0;
            List<Integer> opened = new LinkedList<>();
            List<Integer> closed = new LinkedList<>();
            
            for(char c : symbols) {
            	counter++;
            	
            	if(c == '(' || c == '{' || c == '[') {
            		System.out.println("РАССМАТРИВАЕТСЯ открывающая, индекс " + counter);
            		stack.push(c);
            		System.out.println("На стек помещена открывающая");
            		opened.add(counter);
            	} 
            	
            	if (c == ')' || c == '}' || c == ']') {
            		System.out.println("РАССМАТРИВАЕТСЯ закрывающая, индекс " + counter);
            		
            		if(!stack.isEmpty()) {
            			System.out.println("Стек непустой");
            			char fromStack = stack.peek();
            			if((c == ')' && fromStack == '(') || 
            					(c == '}' && fromStack == '{') ||
            					(c == ']' && fromStack == '[')) {
            				stack.pop();
            				System.out.println("Со стека снята открывающая");
            				((LinkedList<Integer>) opened).removeLast();
            			} else {
            				System.out.println("Несоответствие последней открывающей на стеке, прерывание");
            				closed.add(counter);
            				break;
            			}
            		} else {
            			System.out.println("Стек пустой, прерывание. Будет выведет индекс текущего элемента");
            			stack.add(c);
            			closed.add(counter);
            			break;					
            		}
            	}
            	
            }
            
            System.out.println("Is stack empty? " + stack.isEmpty());
            System.out.println("Opened " + opened.toString());
            System.out.println("Closed " + closed.toString());
            
            if(!stack.isEmpty()) {
            	if(!closed.isEmpty()) {
            		System.out.println(((LinkedList<Integer>) closed).getFirst());
            	} else {
            		if(!opened.isEmpty()) {
            			System.out.println(((LinkedList<Integer>) opened).getFirst());
            		}
            	}
            } else {
            	System.out.println("Success");
            }
        }
	}  
}
