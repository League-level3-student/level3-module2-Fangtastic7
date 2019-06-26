package _00_Sorting_Algorithms;

public class SelectionSorter extends Sorter {
	public SelectionSorter() {
		type = "Selection";
	}

	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		// 1. make a for loop to iterate through all but the last
		// element of the array
		for (int i = 0; i < array.length - 1; i++) {
			// 2. create an integer called index and set it equal to i
			int index = i;
			System.out.println(i);
			// 3. make another for loop that starts at i + 1 and
			// goes through the entire array
			for (int x = i + 1; x < array.length; x++) {
				// 4. if the array element at j is less than the
				// element at index, then set index equal to j
				if (array[x] < array[index]) {
					index = x;
					display.updateDisplay();
					
				}
			}
			// 5. swap the array element at index with the array element at i
			int y = array[index];
			array[index] = array[i];
			array[i] = y;
			

			// array[index] = array[i];

		}

	}
}
