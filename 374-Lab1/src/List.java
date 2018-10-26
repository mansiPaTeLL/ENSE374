public class List {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		ListElement element = new ListElement();
		
	
		
		System.out.println("Building Linked List!!");
		for(int i = 0; i <= 10; i++)
		{
			element.setData(i);
		    list.addElement(element);	
		    
		}
		
		System.out.println("List from the root: ");
		list.printLinkedListHead();
		
		System.out.println("Deleting node: ");
		System.out.println(list.getElement(4).getData());
		System.out.println(list.deleteElement(4).getData());
		
		System.out.println("List from the root: ");
		list.printLinkedListHead();
		
		
		System.out.println("List from the tail: ");
		list.printLinkedListTail();

	}

}


