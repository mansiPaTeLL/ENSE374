public class LinkedList {
	private ListElement head, tail;
	private ListElement listelement;
    public int counter;

	    public LinkedList() 
	    {
	    	head = null;
	    	tail = null;
	    	listelement = null;
	    	counter = 0 ;
		}
	    
	    
	    public void addElement(ListElement le)
	    {
	    	listelement = new ListElement();
	    	listelement.setData(le.getData());
			
			if (head == null)
			{
				this.head = this.tail = this.listelement;
			}
			
			else {
				this.tail.setNext(this.listelement);
				this.tail = this.listelement;
			}
			
			counter++;
	    }
			
		public ListElement getElement(int index) {	
				if(index > counter) 
					return null;
				
				//Start from the head and iterate to the requested index.
				listelement = head;
				
				for(int i = 0; i < index; i++) {
					listelement = listelement.getNext();
				}
				
				return listelement;
			}
		
		public ListElement deleteElement(int index)
		{
			if (index > counter)
				return null;
			
			ListElement temp;
			temp = listelement;
			temp = null;
			
			if (index == 0 ) 
			{
				head = null;
			}
			else 
		    {
				for (int i = 0; i <index; i++) {
					temp = listelement;
					listelement = listelement.getNext();
				}
			}
			if (temp != null) {
				temp.setNext(listelement.getNext()); 
				}
			
			    counter --;
			    temp = listelement;
			    listelement = null;
			    return temp;

		}	
		
		public void printLinkedListHead() {
			
			if(head == null) {
				System.out.println("The List is Empty");
				return;
			}
			
			listelement = head;
			for(int i = 0; i < counter - 1; i++) {
				System.out.print(listelement.getData() + " , ");
				listelement = listelement.getNext();
			}
		}
		
		public void printLinkedListTail() {

			int[] array_list= new int[counter];
			if(head == null) {
				System.out.println("The list is empty");
				return;
			}
			
			listelement = head;
			for(int i = 0; i < counter; i++) {
				array_list[i] = listelement.getData();
				listelement = listelement.getNext();
			}
			
	
			for(int i = counter - 1; i > 0; i--) {
				System.out.print(array_list[i] + " , ");
			}
			System.out.println(array_list[0]);
		}
}

