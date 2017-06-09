package data.structure.stack;

import java.util.Arrays;


/**
 * 栈 非常重要的数据结构，类似于子弹夹，先进后出
 * 可以使用数据或者链表来模拟栈，下面使用数组来模拟实现
 */
public class MyStackByArray<E> {

	private Object[] stack;
	private int size; //数组中存储元素的个数
	public MyStackByArray(){
		stack = new Object[10]; //初始数组长度为10
	}
	
	// 判断堆栈是否为空
	public Boolean isEmpty(){
		return size == 0;
	}
	
	// 查询栈顶对象但不移除
	@SuppressWarnings("unchecked")
	public E peek(){
		if(isEmpty()){
			return null;
		}
		return (E) stack[size -1];
	}
	
	// 弹栈并返回弹栈元素
	public E pop(){
		E peek = peek();
		stack[size - 1] = null;
		size--;
		return peek;
	}
	
	// 压栈并返回压栈元素
	public E push(E item){
		// 检查容量
		ensureCapacity(size + 1);
		// 新加元素入栈长度计数器+1
		stack[size++] = item;
		return item;
	}
	
	// 判断数组容器是否已满，若已满，则扩充空间
	private void ensureCapacity(int size){
		int length = stack.length;
		if(size > length){
			int newLen = 10 + length; //每次数组扩充容量
			stack = Arrays.copyOf(stack, newLen);
		}
	}
	
	public void printStack(){
		for (Object o : stack) {
			System.out.print(o+" ");
		}
	}
	
	public static void main(String[] args) {
		MyStackByArray<Integer> stack = new MyStackByArray<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		
		stack.printStack();
		System.out.println();
		System.out.println(stack.size);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.printStack();
	}
}
