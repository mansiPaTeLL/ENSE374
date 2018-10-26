public class LinkedList {
	private ListElement head, tail;
	private ListElement temp_le;
    public int counter;

	    public LinkedList() 
	    {
	    	head = null;
	    	tail = null;
	    	temp_le = null;
	    	counter = 0 ;
		}
	    
	    
	    public void addElement(ListElement le)
	    {
			temp_le = new ListElement();
			temp_le.setData(le.getData());
			
			if (head == null)
			{
				this.head = this.tail = this.temp_le;
			}
			
			else {
				this.tail.setNext(this.temp_le);
				this.tail = this.temp_le;
			}
			
			counter++;
			
	    }
	
}

