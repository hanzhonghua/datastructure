package data.structure.linked;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @Title: SingleLinkedList.java
 * @Description: 单链表的简单实现
 * @author Hanzhonghua
 * @date 2017年6月7日下午4:49:54
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class SingleLinkedList {

	Node head = null;  //链表头的引用
	
	
	// 向链表插入数据(添加到链表尾部)
	public void add(int d){
		Node newNode = new Node(d);
		// 如果链表头为空，将新添加的结点插入链表头
		if(head == null){
			head = newNode;
			return ;
		}
		Node tmp = head;
		while(tmp.next != null){
			tmp = tmp.next;
		}
		tmp.next = newNode;
	}
	
	// 删除第index位置元素
	public Boolean remove(int index){
		if(index < 1 || index >size()){
			return false;
		}
		// 删除链表第一个元素
		if(index == 1){
			head = head.next;
			return true;
		}
		int i = 1;
		Node preNode = head;
		Node curNode = preNode.next;
		while(curNode != null){
			if(i == index){
				preNode.next = curNode.next;
				return true;
			}
			preNode = curNode;
			curNode = curNode.next;
		}
		return true;
	}
	
	// 集合长度
	public int size(){
		int length = 0;
		Node tmp = head;
		while(tmp != null){
			length++;
			tmp = tmp.next;
		}
		return length;
	}
	
	// 对链表进行排序，返回排序后的头结点
	public Node sortList(){
		Node nextNode = null;
		int temp = 0;
		Node curNode = head;
		while(curNode.next != null){
			nextNode = curNode.next;
			while(nextNode != null){
				if(curNode.data > nextNode.data){
					temp = curNode.data;
					curNode.data = nextNode.data;
					nextNode.data = temp;
				}
				nextNode = nextNode.next;
			}
			curNode = curNode.next;
		}
		return head;
	}
	
	// 打印集合结点
	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	// 单链表去重，第一种方法就是遍历链表，遍历后的值存储到HashMap中，遍历过程中
	// 访问的值在map中已存在，说明重复，可以删除
	// 优点是时间复杂度低，缺点就是遍历中需要额外的存储空间来保存已有的值
	public void deleteRepeat(Node head){
		Map<Integer, Integer> map = new HashMap<>();
		Node tmp = head;
		Node pre = null;
		while(tmp != null){
			if(map.containsKey(tmp.data)){
				pre.next = tmp.next;
			}else{
				map.put(tmp.data, 1);
				pre = tmp;
			}
			tmp = tmp.next;
		}
	}
	
	// 使用双重循环去重，不需要额外的存储空间，不过时间复杂度高
	// 外循环正常遍历链表，假设外循环遍历的结点为cur，内循环从cur开始遍历
	// 若碰到与cur指向结点值相同，则删除这个重复结点
	public void deleteDuplecate(Node head){
		Node p = head;
		while(p != null){
			Node q = p;
			while(q.next != null){
				if(p.data == q.next.data){
					q.next = q.next.next;
				}else{
					q = q.next;
				}
			}
			p = p.next;
		}
	}
	
	// 链表翻转
	public Node fanzhuan(Node n){
		Node pre = null;
		if(n != null){
			Node next = n.next;
			n.next = pre;
			pre = n;
			n = next;
		}
		return pre;
	}
	
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.add(3);
		list.add(3);
		list.add(1);
		list.add(6);
		list.add(4);
		list.add(4);
		list.add(4);
		list.printList();
		list.sortList();
		System.out.println();
		list.printList();
		System.out.println();
//		list.deleteRepeat(list.head);
//		list.deleteDuplecate(list.head);
		list.fanzhuan(list.head);
		list.printList();
	}
}
