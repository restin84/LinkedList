public class ListDriver {

	public static void main(String[] args) {
		List<String> testList = new List<String>("third element");
		testList.insertInFront("second element");
		testList.insertInFront("first element");
		testList.insertAtEnd("fourth element");
		testList.insertAtEnd("fifth element");
		
		System.out.println(testList.mthToLast(2).getData());
//		testList.printList();
//		testList.deleteElement("fourth element");
//		testList.deleteElement("third element");
//		testList.printList();
//		
//		List<Integer> testIntList = new List<Integer>(0);
//		testIntList.insertAtEnd(1);
//		testIntList.insertAtEnd(2);
//		testIntList.insertInFront(-1);
//		testIntList.printList();
//		
//		ListElement<String> targetElement;
//		if(testList.findElement("second element") != null) {
//			System.out.println("Target element found.  Data value: " + 
//					testList.findElement("second element").getData());
//		}
//		else {
//			System.out.println("Target element could not be found");
//		}
//		
//		if(testList.findElement("something that doesn't exist") != null) {
//			System.out.println("Target element found.  Data value: " + 
//					testList.findElement("second element").getData());
//		}
//		else {
//			System.out.println("Target element could not be found");
//		}
		
	}

}
