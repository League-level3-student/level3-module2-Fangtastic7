package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		for(int y = 0; y < arr.length-1; y++) {
			for(int i = 0; i < arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					int x = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = x; 
					display.updateDisplay();
				}
				
			
			}
		}
	}
	
}
