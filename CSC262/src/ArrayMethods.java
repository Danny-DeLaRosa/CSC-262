
public class ArrayMethods {

	public static void main(String[] args) {
		int[] values = {1, 55, 82, 94, 4, 36, 7, 55};
		System.out.println("Original array:");
		print_array(values);
		swap(values);
		System.out.println("Swapped array:");
		print_array(values);
		System.out.println("Removed middle value:");		
		print_array(remove_middle(values));
		System.out.println("Array has adjacent duplicate: " + adjacent_duplicate(values));		
		System.out.println("Second largest number: " + second_largest(values));		
		System.out.println("Sum of numbers in array: " + sum(values));		
		
	}
	
	 public static void print_array(int[] a) {
	        for (int e : a) {
	            System.out.print(e + " ");
	        }
	        System.out.println();
	    }
	
	public static void swap(int[] a) {
		int first = a[0];
		int last = a[a.length - 1];
		a[0] = last;
		a[a.length - 1] = first;
	}
	
	public static int[] remove_middle(int[] a) {
	    if (a.length == 0) {
	        return a; 
	    }

	    int newSize = (a.length % 2 == 0) ? a.length - 2 : a.length - 1;
	    int[] newArray = new int[newSize];

	    int middleIndex = a.length / 2;
	    int index = 0;

	    for (int i = 0; i < a.length; i++) {
	        if (a.length % 2 == 1 && i == middleIndex) {
	            continue; 
	        }
	        if (a.length % 2 == 0 && (i == middleIndex || i == middleIndex - 1)) {
	            continue;
	        }
	        newArray[index++] = a[i];
	    }
	    
	    return newArray;
	}
	
	public static boolean adjacent_duplicate(int[] a) {
		for(int i = 0; i < a.length - 1; i++) {
			if(a[i] == a[i + 1]) 
				return true;
		}
		return false;
	}
	
	public static int second_largest(int[] a) {
	    if (a.length < 2) {
	        return Integer.MIN_VALUE;
	    }

	    int max1 = Math.max(a[0], a[1]);
	    int max2 = Math.min(a[0], a[1]);

	    for (int i = 2; i < a.length; i++) {
	        if (a[i] > max1) {
	            max2 = max1;
	            max1 = a[i]; // Update max1
	        } else if (a[i] > max2 && a[i] != max1) { 
	            max2 = a[i];
	        }
	    }

	    return max2;
	}
	
	public static int sum(int[] a) {
		if(a.length == 0) {
			return 0;
		}
		
		int sum = 0;
		for(int e : a) {
			sum += e;
		}
		return sum;
	}

}
