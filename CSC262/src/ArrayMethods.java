
public class ArrayMethods {

	public static void main(String[] args) {
		int[] values = {1, 82, 94, 4, 36, 7, 55};
		swap(values);
	}
	public static void swap(int[] a) {
		int first = a[0];
		int last = a[a.length - 1];
		a[0] = last;
		a[a.length - 1] = first;
		for(int i = 0; i < a.length; i++) {
			if(a.length > 1)
			System.out.print(" " + a[i]);
		}
	}

}
