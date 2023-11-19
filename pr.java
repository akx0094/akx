import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class pr
{
	static int pageFrames=0;
	 static int lru(int referenceString[])
	 {
	     ArrayList<Integer>  pages = new ArrayList<Integer>(pageFrames);
	     HashMap<Integer, Integer> indexes = new HashMap<>();
	     int page_faults = 0,  n = referenceString.length, curPage;
	     for (int i=0; i<n; i++)
	     {
	         curPage = referenceString[i];
	         if (pages.size() < pageFrames)
	         {
	             if (!pages.contains(curPage))
	             {
	                 pages.add(curPage);
	                 page_faults++;
	                 displayPageFrames(pages, page_faults);
	             }
	             indexes.put(curPage, i);
	         }
	         else
	         {
	             if (!pages.contains(curPage))
	             {
	                 int lru = Integer.MAX_VALUE, pageToBeReplaced =0;
	                 int temp;
	                 for(int j = 0; j < pages.size(); j++){
	                	 temp = pages.get(j);
	                	 if (indexes.get(temp) < lru)
	                     {
	                         lru = indexes.get(temp);
	                         pageToBeReplaced = j;
	                     }
	                 }
	              
	                 indexes.remove(pages.get(pageToBeReplaced));
	                 pages.set(pageToBeReplaced, curPage);
	                 // Increment page fault count
	                 page_faults++;
	                 displayPageFrames(pages, page_faults);
	             }
	   
	             // Update the current page index
	             indexes.put(curPage, i);
	         }
	     }
	     return page_faults;
	 }
  
	//Optimal Page Replacement Algorithm
	 static int optimal(int referenceString[])
	 {
		//This array list will contain all the pages that are currently in memory
	     ArrayList<Integer>  pages = new ArrayList<Integer>(pageFrames);
	   
	     // This hashmap will store least recently used indexes of the pages
	     HashMap<Integer, Integer> indexes = new HashMap<>();

	     int page_faults = 0, curPage, n = referenceString.length;
	     for (int i=0; i<n; i++)
	     {
	    	 curPage = referenceString[i];
	         if (pages.size() < pageFrames)
	         {
	             if (!pages.contains(curPage))
	             {
	                 pages.add(curPage);

	                 page_faults++;
	                 displayPageFrames(pages, page_faults);
	             }
	             indexes.put(curPage, findNextIndex(curPage,i, referenceString));
	         }
	         else
	         {
	             if (!pages.contains(curPage))
	             {
	            	 int optimal = Integer.MIN_VALUE, pageToBeReplaced =0;;
	                 int temp;
	                 for(int j = 0; j < pages.size(); j++){
	                	 temp = pages.get(j);
	                	 if (indexes.get(temp) > optimal)
	                     {
	                		 optimal = indexes.get(temp);
	                         pageToBeReplaced = j;
	                     }
	                 }
	              
	                 indexes.remove(pages.get(pageToBeReplaced));
	                 pages.set(pageToBeReplaced, curPage);
	                 page_faults++;
	                 displayPageFrames(pages, page_faults);
	             }
	             indexes.put(curPage, findNextIndex(curPage,i, referenceString));
	         }
	     }
	     return page_faults;
	 }
	 
	 static int findNextIndex(int curPage, int curIndex, int pages[]){
		 int i;
		 for(i= curIndex+1; i < pages.length; i++){
			 if(pages[i] == curPage){
				 break;
			 }
		 }
		 return i;
	 }
	 
	 static void displayPageFrames(ArrayList<Integer> pages, int page_faults){
         System.out.print("At PageFault- " + page_faults  + " :: Pages- ");
         for(int i = 0; i < pages.size(); i++) {
             System.out.print(" " + pages.get(i));
         }
         System.out.print("\n");
	 }
	 
	 // Driver method
	 public static void main(String args[])
	 {
	     int pages[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2,1,2,0,1,7,0,1};
	     
	     pageFrames = 3;
	     int pageFaults;
	     System.out.println("--- Implementing Least Recently Used Page Replacement Algorithm -----");
	     pageFaults = lru(pages);
	     System.out.println("Number of page faults = " + pageFaults);
	     System.out.print("\n");
	     System.out.println("--- Implementing Optimal Page Replacement Algorithm -----");
	     pageFaults = optimal(pages);
	     System.out.println("Number of page faults = " + pageFaults);
	 }
}
