

import static org.junit.Assert.assertFalse;

import org.junit.Test;


public class SortTest {
	
	@Test
	public void TestAssending() {
		
		int[] list =new int[] {19,12,43,34,25,36,97,18,349,10,111,132,13,914,125,616,817,818};
	
		list=QuickSorter.sortWithLastPivot(list,QuickSorter.ACENDING_ORDER);
		
		for(int i=1;i<list.length;i++) {
					
			assertFalse("the list is not in assending order",list[i-1]>list[i] );
				
			
		}
		
	}
	
	@Test
	public void TestDessending() {
		
		int [] list= new int[] {83,54,12,3,45,84,23,14,15,16,67,45,43,21,45,67,87};
		
		list=QuickSorter.sortWithLastPivot(list,QuickSorter.DECENDING_ORDER);
		
		for(int i=1;i<list.length;i++) {
					
			assertFalse("the list is not in decedning order",list[i-1]<list[i] );	
		}
	}
	
	@Test
	public void TestMidlePivotSort() {
		
		int [] list= new int[] {83,54,12,3,45,84,23};
		
		list=QuickSorter.sortWithMiddlePivot(list);
		
		for(int i=1;i<list.length;i++) {
			assertFalse("the list is not accending order",list[i-1]>list[i] );
		}
	}
}
