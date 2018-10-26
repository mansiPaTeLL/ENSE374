public class List {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		ListElement element = new ListElement();
		
		element.setData(5);
		
		list.addElement(element);
		
		System.out.println("Building Linked List!!");
		for(int i = 0; i < 10; i++)
		{
			element.setData(i);
		    list.addElement(element);	
		}
		

	}

}


