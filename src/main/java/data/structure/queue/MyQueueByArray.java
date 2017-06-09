package data.structure.queue;

/**
 * 队列和是先进先出，同样使用数组和链表来实现
 * 这里使用数组实现
 */
public class MyQueueByArray<E> {

	private class Node<T>{
		private Node<T> next = null;
		private T data;
		public Node(T data){
			this.data = data;
		}
	}
	
	private Node<E> head = null;
	private Node<E> tail = null;
	
	public Boolean isEmpty(){
		return head == tail;
	}
	
	public void put(E data){
		Node<E> node = new Node<E>(data);
		if(head == null && tail == null){ //队列为空
			head = tail = node;
		}else{
			tail.next = node;
			tail = node;
		}
	}
	
	public E pop(){
		if(this.isEmpty()){
			return null;
		}
		E data = head.data;
		head = head.next;
		return data;
	}
	
	public int size(){
		Node<E> tmp = head;
		int n = 0;
		while(tmp != null){
			n++;
			tmp = tmp.next;
		}
		return n;
	}
	public static void main(String[] args) {
		MyQueueByArray<Integer> queue = new MyQueueByArray<>();
		queue.put(1);
		queue.put(2);
		queue.put(3);
		queue.put(4);
		
		System.out.println(queue.size());
		System.out.println(queue.pop());
	}
}
