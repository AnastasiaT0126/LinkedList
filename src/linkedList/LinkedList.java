package linkedList;

public class LinkedList<T> implements List 
{
	private int index;
	private static int counter;
	private Node<T> head;
    

	@Override
	public boolean isEmpty() {
		return index <= 0;
	}
	
	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(Object item) 
	{
		if (head == null) 
		{
			head = new Node(item);
		}
		 
		Node temp = new Node(item);
		Node current = head;
				
		if (current != null) 
		{		 
			while (current.getNext() != null) 
			{
				current = current.getNext();
			}
			current.setNext(temp);
		}
		incrеасеCounter();
	}
	
	private static int getCounter() {
		return counter;
	}
	
	private static void incrеасеCounter() {
		counter++;
	}

	@Override
	public void insertAt(Object item, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFrom(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Object item) {
		
	}

	@Override
	public Object get(int index) {
		
		Node a = head;
        int i = 0;
        
        while (i < index) 
        {
            a = a.getNext();
            index++;
        }
        return a.getValue();
	}

	@Override
	public void clear() {
		index = 0;
	}
	
	public static void main(String[] args) 
	{
		
	}

}
