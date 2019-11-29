package work;

import java.util.LinkedList;
import java.util.Scanner;

public class UseLinkedList {
	public static void show(LinkedList<String> linked) {
		for (int i = 0; i < linked.size(); i++) {
			System.out.println(i + ". " + linked.get(i));
		}
	}
	
	public static void showUpdate(LinkedList<String> linked, int position) {
		String data = linked.get(position);
		for (int i = 0; i < linked.size(); i++) {
			if(linked.get(i).equals(data)) {
				System.out.println(i + ". phan tu vua duoc edit: " + linked.get(i));
			}else {
				System.out.println(i + ". " + linked.get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		// khởi tạo linked list
		LinkedList<String> linked = new LinkedList<String>();
		
		// thêm phần tử trong linked list
		
		linked.add("Trương Ngọc Tuấn");
		linked.add("Nguyễn Tuấn Anh");
		linked.add("Hoàng Văn Vương");
		linked.add("Phạm Thùy Dương");
		linked.add("Trần Văn Quân");
		

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("==============Lua Chon==============");
			System.out.println("1.Them moi phan tu vao linked list");
			System.out.println("2.Sua phan tu trong linked list");
			System.out.println("3.Xoa phan tu trong linked list");
			System.out.println("4.Thoat");
			System.out.print("Lua chon: ");
			int choose = sc.nextInt();
			sc.nextLine();
			switch(choose) {
				case 1:{
					System.out.println("================data=================");
					show(linked);
					System.out.println("Moi nhap vao data: ");
					String data = sc.nextLine();
					linked.add(data);
					System.out.println("=> linked list sau khi them: ");
					show(linked);
					break;
				}
				case 2:{
					System.out.println("================data=================");
					show(linked);
					System.out.println("Nhap vi tri phan tu muon sua: ");
					int position = sc.nextInt();
					sc.nextLine();
					System.out.println("Nhap du lieu them vao: ");
					String data = sc.nextLine();
					linked.set(position, data);
					showUpdate(linked, position);
					break;
				}
				case 3:{
					System.out.println("================data=================");
					show(linked);
					System.out.println("Nhap vi tri phan tu muon xoa: ");
					int position = sc.nextInt();
					linked.remove(position);
					show(linked);
					break;
				}
				case 4:{
					System.out.println("\n==============Bye Bye==============");
					return;
				}
			}
		}
	}
}
