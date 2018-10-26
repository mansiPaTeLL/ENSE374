
public class ListElement {
	private ListElement next;
	private int data;
	
	public ListElement () {
		this.data = 0;
		this.next = null;
		
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListElement getNext() {
		return next;
	}
	public void setNext(ListElement next) {
		this.next = next;
	}
}