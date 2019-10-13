package InsertionSort;

class InsertionSort {
	// non static method
	void sort(int arr[]) {
		int n = arr.length;//it count the length of the array
		// this for loop check index number
		for (int i = 1; i < n; ++i) {// here ++i means first increment the i then return the value
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			} // while
			arr[j + 1] = key;
		} // for
	}// NM

	// static method with param
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println("/n" +arr.length);

		System.out.println();
	}// SM

	// main method
	public static void main(String args[]) {

		int[] arr = { 12, 11, 13, 5, 6 };// array
		// class object creation
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);// non static method called

		printArray(arr);// static method called
	}// main
}// class