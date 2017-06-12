package data.structure.queue;

import javax.management.RuntimeErrorException;


/**
 * 使用数组实现队列
 * 队列是一个特殊线性表，特殊之处是它只允许在队尾添加元素，在队头删除操作
 */
public class MyQueueByArray<E> {

	private Object[] obj; //内置数组
	private int front; //头指针
	private int real; //尾指针
	
	public MyQueueByArray(){
		obj = new Object[10];
		front = 0;
		real = -1;
	}
	
	// 判断队列是否为空
	public Boolean isEmpty(){
		return front == obj.length;
	}
	
	// 判断队列是否已满
	public Boolean isFull(){
		return obj.length - 1 == real;
	}
	
	// 队尾添加元素
	public void insert(E data){
		if(isFull()){
			throw new RuntimeException("队列已满");
		}
		obj[++real] = data;
	}
	
	// 获取队头元素
	public E peekFront(){
		if(isEmpty()){
			return null;
		}
		return (E) obj[front];
	}
	
	// 获取队尾元素
	public E peekReal(){
		if(isEmpty()){
			return null;
		}
		return (E) obj[real];
	}
	
	// 移除队头元素
	public E remove(){
		if(this.isEmpty()){
			throw new RuntimeException("队列为空");
		}
		return (E) obj[front++];
	}
	
	public static void main(String[] args) {
//		MyQueueByArray<Object> q = new MyQueueByArray<>();
//		q.insert(1);
//		q.insert(2);
//		q.insert(3);
//		q.insert(4);
//		q.insert(5);
//		System.out.println(q.peekFront());
//		System.out.println(q.peekReal());
//		
//		System.out.println(q.remove());
//		System.out.println(q.remove());
		
	}
	
}
