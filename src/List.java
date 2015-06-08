import java.lang.reflect.Array;

/**
 * List class maintains a list of generic list elements
 * 
 * @author douglas
 *
 */
public class List<T> {
	
	//a reference to the first element in the list
	private ListElement<T> head = null;
           	
	public List(T t) {
		ListElement<T> firstElement = new ListElement<T>(t); 
		head = firstElement;
	}
	
	/**
	 * Method insertInFront inserts an element at the front of the list
	 * 
	 * @param t
	 */
	public void insertInFront(T t) {
		ListElement<T> newElement = new ListElement<T>(t);
		newElement.setNext(head);
		head = newElement;
	}
	
	/**
	 * Method insertAtEnd inserts an element at the end of the list
	 * 
	 * @param t
	 */
	public void insertAtEnd(T t) {
		ListElement<T> currentElement = head;
		
		while(currentElement.getNext() != null) {
			currentElement = currentElement.getNext();
		}
		
		currentElement.setNext(new ListElement<T>(t));
	}
	
	public ListElement<T> findElement(T t) {
		ListElement<T> currentElement = head;
		
		if(head.getData().equals(t)) {
			return head;
		}
		
		while(currentElement.getNext() != null) {
			currentElement = currentElement.getNext();
			if(currentElement.getData().equals(t)) {
				return currentElement;
			}
		}
		
		return null;
	}
	
	/**
	 * Method deleteElement removes an element from the list
	 * 
	 * @param t
	 * @return
	 */
	public boolean deleteElement(T t) {
		ListElement<T> currentElement = head;
		ListElement<T> previousElement;
		
		if(empty()) {
			return false;
		}
		
		if(head.getData().equals(t)) {
			head = head.getNext();
			return true;
		} 
		
		while(currentElement.getNext() != null) {
			previousElement = currentElement;
			currentElement = currentElement.getNext();
			if(currentElement.getData().equals(t)) {
				previousElement.setNext(currentElement.getNext());
				return true;
			}
			
		}
		
		return false;
	}
	
	/**
	 * Method printList prints the data of each element in the list
	 */
	public void printList() {
		ListElement<T> currentElement = head;
		if(empty()) {
			System.out.println("Nothing to print");
			return;
		}
		
		while(currentElement.getNext() != null) {
			System.out.println(currentElement.getData());
			currentElement = currentElement.getNext();
		}
		System.out.println(currentElement.getData());
	}
	
	
	private boolean empty() {
		return head == null;
	}

}
