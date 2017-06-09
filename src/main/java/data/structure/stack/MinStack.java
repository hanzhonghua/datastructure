package data.structure.stack;

/**
 * O(1)时间复杂度得到栈中最小元素，因为栈时先进后出，操作的是栈顶元素，按照以上设计
 * 想要得到栈中最小值元素必须使用遍历，那么时间复杂度就成了O(n)了，怎么在时间复杂度
 * O(1)情况下完成查询最小值？在算法设计中，通常就是以空间换取时间，就是使用两个栈结构，
 * 一个用来存储数据，另一个用来存储栈中最小元素
 * 
 * 如果当前入栈的比栈中原来最小值还小，则把这个值压入存有最小值的栈，出栈时，当前出栈元素
 * 恰好是当前栈最小值，保存最小值的栈也要出栈，使得当前最小值变为其入栈之前的最小值。
 * 使用链表实现的栈来实现
 */
public class MinStack {

	MyStackByNode<Integer> element;
	MyStackByNode<Integer> min;
	
	public MinStack() {
		element = new MyStackByNode<>();
		min = new MyStackByNode<>();
	}
	
	// 压栈时如果存入元素小于存储最小值栈的最小值，压入
	public void push(int data){
		element.push(data);
		if(min.isEmpty()){
			min.push(data);
		}else{
			if(data < min.peek()){
				min.push(data);
			}
		}
	}
	
	public int pop(){
		Integer data = element.peek();
		element.pop();
		if(data == this.min()){
			min.pop();
		}
		return data;
	}
	
	public int min(){
		if(min.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return min.peek();
		}
	}
	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(10);
		minStack.push(2);
		minStack.push(6);
		minStack.push(4);
		minStack.push(3);
		minStack.push(1);
		
		minStack.pop();
		System.out.println(minStack.min.peek());
	}
}
