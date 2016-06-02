package xyz.jeetendra.java8.search;

class LinearSearch{
	public static int linearSearch(int[] arr,int key){
		System.out.println(arr);
		int size = arr.length;
		for(int i=0;i<size;i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int[] array1 = {23,45,21,55,234,1,34,90};
		int searchKey = 34;
		System.out.println("Key "+searchKey+" found at index: "+linearSearch(array1,searchKey));
	}
}
