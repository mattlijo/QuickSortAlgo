

public class Runner {

	public static void main(String[] args) {
		
		int[] list = new int[] {3,1,2};
		
		list = QuickSorter.sortWithLastPivot(list, QuickSorter.ACENDING_ORDER);
		
		list= QuickSorter.sortWithMiddlePivot(list);
		
		
		System.out.println("------");

		for(int i : list)
		{				
			System.out.println(i);

		}
		System.out.println("------");
		
		
	}
}

