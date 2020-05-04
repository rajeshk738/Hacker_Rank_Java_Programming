
package Java_Concept_Programs;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list1.add(2);list1.add(4);list1.add(3);
		list2.add(5);list2.add(6);list2.add(4);
	
		int s1 = list1.size();
		int s2 = list2.size();
		
		Iterator<Integer> itr1 = list1.iterator();
		
		while(itr1.hasNext()) {
			System.out.print(itr1.next());
			if(s1>1)
			{
				System.out.print("->");
				s1--;
			}
		}
		System.out.println();
Iterator<Integer> itr2 = list2.iterator();
		
		while(itr2.hasNext()) {
			System.out.print(itr2.next());
			if(s2>1)
			{
				System.out.print("->");
				s2--;
			}
		}
		resultLinkedList(list1, list2);
		
	}

	private static void resultLinkedList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		// TODO Auto-generated method stub
		LinkedList<Integer> resList = new LinkedList<Integer>();
		
Iterator<Integer> itr1 = list1.iterator();
Iterator<Integer> itr2 = list2.iterator();
		int s1 = list1.size();
		int s2 = list2.size();
		int n1,n2;
		int res1=0,res2=0;
		int i=1,j=1;
		while(itr1.hasNext()) {
			if(s1>0)
			{
				n1 = (i * itr1.next()); 
				res1 = n1 + res1;
				i = i * 10;
			}
			
		}
		
		while(itr2.hasNext()) {
			if(s2>0)
			{
				n2 = (i * itr2.next()); 
				res2 = n2 + res2;
				j = j * 10;
			}
			
		}
		
		
		
		

		int no = res1 + res2;
	
		int size = String.valueOf(no).length();
		int s3 =size;
		
		while(size>0)
		{
			resList.add(no%10);
			no = no/10;
			size--;
		}
		
Iterator<Integer> itr3 = resList.iterator();
		System.out.println();
		while(itr3.hasNext()) {
			System.out.print(itr3.next());
			if(s3>1)
			{
				System.out.print("->");
				s3--;
			}
		}
		
		
	}

}
