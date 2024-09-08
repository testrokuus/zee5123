package automation;
		class RepeatedNumbers {
		    public static void main(String[] args) {
		        int[] arr = {1, 3, 4, 5, 6, 3, 2, 4, 6, 7, 9, 4, 12, 3, 4, 6, 8, 9, 7, 6, 43, 2, 4, 7, 7, 5, 2, 1, 3, 4, 6, 311, 1};
		        int max = Integer.MIN_VALUE;

		        // Find the maximum element in the array
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] > max)
		                max = arr[i];
		        }

		        // Create a counter array
		        int[] counter = new int[max + 1];
		        System.out.println(counter.length);
		        for (int i = 0; i < arr.length; i++) {
		            counter[arr[i]]=counter[arr[i]]+1;
		          
		            
		        }

		        // Print repeated elements and their frequencies
		        for (int i = 0; i <= max; i++) {
		            if (counter[i] > 1)
		                System.out.println(i + "- Repeated " + counter[i] + " times");
		        }
		    }
		}

	


