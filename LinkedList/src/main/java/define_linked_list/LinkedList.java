package define_linked_list;

import java.util.Scanner;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if(this.head == null) {
			this.head = newNode;
		}else {
			Node tmp = this.head;
			while(tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = newNode;
		}
	}
	
	public void showLinkedList() {
		Node item = this.head;
		if(item == null) {
			System.out.println("=====>linked list is empty");
			return;
		}
		System.out.println("\n==========Cac phan tu cua linked list============");
		int i = 0;
		while(item !=  null) {
			System.out.println("["+i+"] - " + item.data);
			item = item.next;
			i++ ;
		}
	}
	
	public void set(int position, int data) {
		Node item = this.head;
		if(position == 0) {
			this.head.data = data;
		}else {
			int count = 0;
			while(item != null) {
				if(count == position) {
					item.data = data;
					return;
				}else {
					count++ ;
					item = item.next;
				}
			}
			System.out.println("vi tri phan tu muon sua khong phu hop");
		}
	}
	
	public void remove(int position) {
		Node item = this.head;
		Node previous = item;
		if(item == null) {
			System.out.println("vi tri phan tu muon xoa khong phu hop");
		}else {
			if(position == 0) {
				this.head = item.next;
			}else {
				int count = 0;
				while(item != null) {
					if(count == position) {
						previous.next = item.next;
						return;
					}else {
						previous = item;
						item = item.next;
						count++ ;
					}
				}
				System.out.println("vi tri phan tu muon xoa khong phu hop");
			}
		}
	}
	
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
//		linkedList.showLinkedList();
//		System.out.print("nhap phan tu muon xoa: ");
//		int position = new Scanner(System.in).nextInt();
//		linkedList.remove(position);
//		linkedList.showLinkedList();
//		System.out.print("nhap phan tu muon sua: ");
//		int position1 = new Scanner(System.in).nextInt();
//		linkedList.set(position1, 10);
//		linkedList.showLinkedList();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("==============Lua Chon==============");
			System.out.println("0.Hien thi phan tu trong linked list");
			System.out.println("1.Them moi phan tu vao linked list");
			System.out.println("2.Sua phan tu trong linked list");
			System.out.println("3.Xoa phan tu trong linked list");
			System.out.println("4.Thoat");
			System.out.print("Lua chon: ");
			int choose = sc.nextInt();
			sc.nextLine();
			int position = 0;
			switch(choose) {
				case 0 :{
					linkedList.showLinkedList();
					break;
				}
				case 1:{
					System.out.println("================***=================");
					System.out.print("Nhap vao phan tu muon them: ");
					int data = sc.nextInt();
					linkedList.insert(data);
					linkedList.showLinkedList();
					break;
				}
				case 2:{
					System.out.println("================***=================");
					System.out.println("Nhap vao vi tri sua: ");
					position = sc.nextInt();
					System.out.println("Nhap vao gia tri: ");
					int data = sc.nextInt();
					linkedList.set(position, data);
					linkedList.showLinkedList();
					break;
				}
				case 3:{
					System.out.println("================***=================");
					System.out.println("Nhap vao vi tri xoa: ");
					position = sc.nextInt();
					linkedList.remove(position);
					linkedList.showLinkedList();
					break;
				}
				case 4:{
					System.out.println("\n==============Bye Bye==============");
					System.exit(0);
				}
			}
		}
	}
}
