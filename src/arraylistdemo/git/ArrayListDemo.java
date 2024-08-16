package arraylistdemo.git;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {

		 ArrayList<Integer> arrayList = new ArrayList<>();
	        arrayList.add(1);
	        arrayList.add(2);
	        arrayList.add(3);
	        arrayList.add(4);
	        arrayList.add(5);
	        arrayList.add(75);
	        // 1 2 3 4 5 75

	        // 1 2 3 4 5 75

//print Array list
	        printArrayList(arrayList);
	        // Access element
	        int element = arrayList.get(1);
	        System.out.println(element);

	// Add element at specific index
	        arrayList.add(1, 3);
	        System.out.println(arrayList.get(1));
	// Remove element
	        arrayList.remove(1);
	        System.out.println(arrayList.get(1));

	        int listSize = arrayList.size();
	        System.out.println("Looping using for loop");
	        for(int index=0;index<listSize;++index){
	            System.out.println(arrayList.get(index));
	        }
	        System.out.println("Looping using for-each loop");
	        for(int listElement: arrayList){
	            System.out.println(listElement);
	        }
		
	}
	//Function to print the array list
	public static void printArrayList(ArrayList<Integer> numbers)
	{
		System.out.println("***********************************");
		System.out.println("ArrayList");
		System.out.println("***********************************");
		numbers.stream().forEach(n-> System.out.println(n));
		System.out.println("***********************************");
	}
}
