/**
 * ListElement class is one element in a linked list
 * 
 * @author douglas
 *
 * @param <T>
 */
public class ListElement<T> {
	private T data;
	private ListElement<T> next = null;
	
	ListElement(T value) {
		data = value;
	}
	
	public T getData() {
		return data;
	}
	
	public ListElement<T> getNext() {
		return next;
	}
	
	public void setData(T value) {
		data = value;
	}
	
	public void setNext(ListElement<T> elem) {
		next = elem;
	}
}
