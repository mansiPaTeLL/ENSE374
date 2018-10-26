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
				temp.setNext(listelement.getNext()); }
			    counter --;
			    temp = listelement;
			    listelement = null;
			    return temp;

		}	
}

