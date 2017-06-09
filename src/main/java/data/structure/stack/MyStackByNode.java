package data.structure.stack;

/**
 * 使用链表实现栈
 */
public class MyStackByNode<E> {

	@SuppressWarnings("hiding")
	private class Node<E>{
		private Node<E> next = null;
		private E data;
		public Node(E data){ 
			this.data = data;
		}
	}
	
	Node<E> top = null;
	public Boolean isEmpty(){
		return top == null;
	}
	
	public void push(E item){
		Node<E> node = new Node<E>(item);
		node.next = top;
		top = node;
	}
	
	public E pop(){
		if(this.isEmpty()){
			return null;
		}
		E data = top.data;
		top = top.next;
		return data;
	}
	
	public E peek(){
		if(this.isEmpty()){
			return null;
		}
		return top.data;
	}
}
