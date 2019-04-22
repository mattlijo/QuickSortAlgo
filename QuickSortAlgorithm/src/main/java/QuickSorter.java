

import java.util.ArrayList;
import java.util.List;

public class QuickSorter {

	public static final boolean ACENDING_ORDER=true;
	public static final boolean DECENDING_ORDER=false;
	
	
	public static int[] sortWithLastPivot(int[] list,boolean order) {
		
	
		if(list==null) {
			System.out.println("do not test my patience");
			return null;
		}
		if(list.length==1) {
			System.out.println("no need to sort");
			return list;
		}
		
		return quickSortLastPivot(list,0,list.length-1,order);
	
	}

	
	public static int[] sortWithMiddlePivot(int[] list) {
		
	
		if(list==null) {
			System.out.println("do not test my patience");
			return null;
		}
		if(list.length==1) {
			System.out.println("no need to sort");
			return list;
		}
		
		return quickSortMiddlePivot(list,0,list.length-1);
	
	}


	private static int[] quickSortLastPivot(int[] list, int start, int end, boolean order) {
		
		if(end<=start) {
			
			return list;
		}
		// find the pivot -- last entry
		
		int pivotPoint=end;
		
		int pivot=list[pivotPoint];
		
		int min=-1;
		for(int i=start;i<end;i++) {
			
			boolean SortOrder;
			if(order) {
				SortOrder=list[i]<=pivot;
			} else {
				SortOrder=list[i]>=pivot;
			}
							
			if(SortOrder) {
				
				if(min==-1) {
					min=start;
				} else {
					min++;
				}
				swap(list,min,i);
			}
		}

		min++;
		swap(list,min,pivotPoint);
				
		quickSortLastPivot(list,start,min-1,order);
		
		quickSortLastPivot(list,min+1,end,order);

		return list;
			
		}


	private static void swap(int[] list, int min, int i) {

		if(min>=list.length)
			return;

		if(min==i)
			return;

		list[min]=list[min]+list[i];
		list[i]=list[min]-list[i];
		list[min]=list[min]-list[i];
	}


	public static int[] quickSortMiddlePivot(int[] a, int i, int n) 
	{
	    int pivot = (i+n)/2;
	    int p= a[pivot];

	    int left = i;

	    int right = n;
	    while(left<right)
	    {
	        while(a[left]<p){
	            left++;
	        }

	        while(a[right]>p)
	        {
	            right--;
	        }

	        if(left<=right)
	        {
	            swap(a,left,right);
	            left++;
	            right--;
	        }
	    }
	    
	    if(right>i)quickSortMiddlePivot(a, i, right);

        if(n>left)quickSortMiddlePivot(a, left, n);
        
        return a;

	}
}
