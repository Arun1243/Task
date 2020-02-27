package learnings;

public class number {

	
	public static void main(String[] args) {
		
		int k = 0; // array elements

		String two_d_array_string = "{{346,1199,718,1240},{1068,1199,1858,1240},"
				+ "{2973,1199,2571,865},{5589,1199,2580,865},{345,2879,2580,865},"
				+ "{2973, 2879, 2571, 865},{5589, 2879, 2580, 865}}";

		/**
		 * By this below {,}" " to replace""
		 */
		
		two_d_array_string = two_d_array_string.replace("{", "");
		two_d_array_string = two_d_array_string.replace("}", "");
		two_d_array_string = two_d_array_string.replace(" ", "");

		String[] arr = two_d_array_string.split(",");

		int[] dimensions = new int[arr.length];

		// to convert String into integer. 
		
		for (int i = 0; i < dimensions.length; i++) 
		{
			dimensions[i] = Integer.parseInt("" + arr[i]);
		}

		
		final int[][] dimensions0 = new int[7][4];

		// to Convert Single array into 2-d array.
		
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{

				dimensions0[i][j] = dimensions[k++];
			}
		}

		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{

				System.out.print(dimensions0[i][j] + " ");
			}
			    System.out.println();
		}

	}

}
