package data.structure.queue;

import java.util.Stack;

/**
 * 使用两个栈模拟队列
 * 假设现在有两个栈A栈B模拟队列Q，A为插入栈，B为弹出栈，既是A提供入队，B提供出队
 * 要入队列，入栈A即可，出队列需要分两种情况
 * 		1、栈B不为空，直接弹出栈A数据
 * 		2、栈B为空，则需要弹出栈A数据，入栈B，然后在弹栈B
 */
public class MyQueueByStack<T> {

	private Stack<T> a = new Stack<>();
	private Stack<T> b = new Stack<>();
	
	// 入栈A
	public synchronized void put(T data){
		a.push(data);
	}
	
	// 出栈
	public synchronized T pop(){
		if(b.isEmpty()){
			while(!a.isEmpty()){
				b.push(a.pop());
			}
		}
		return b.pop();
	}
	
	public synchronized Boolean empty(){
		return a.isEmpty() && b.isEmpty();
	}
	
	public static void main(String[] args) {
		MyQueueByStack<Object> q = new MyQueueByStack<>();
		q.put(1);
		q.put(5);
		q.put(3);
		q.put(6);
		q.put(4);
		
		System.out.println(q.pop());
		System.out.println(q.pop());
	}
}
