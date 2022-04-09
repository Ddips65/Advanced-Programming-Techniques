/* Observe differences among three data structures namely, hash map,
 * array list, linked list in terms of insertion and search time
 * generate 100000 distinct random number from the given range and perform this
 * procedure 10 time.		
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class Hw4{

	public static void main(String[] args) {	

		int num_key = 100000;
		System.out.println("Number of keys =" + num_key);
		System.out.println();
				
		long starttime,endtime,elapsetime;
		long tot_hash_ins_time =0;
		long tot_al_ins_time = 0;
		long tot_llist_ins_time = 0;
		
		long tot_hash_srch_time =0;
		long tot_al_srch_time = 0;
		long tot_llist_srch_time =0;
		
		Random r1 = new Random(System.currentTimeMillis()); 
		Random r2 = new Random(System.currentTimeMillis()); 
		
		for (int k=0 ; k<10; k++) {
			
			HashMap<Integer, Integer> hm = new HashMap<>(); 
			ArrayList<Integer> myarr = new ArrayList<>(); 
			LinkedList<Integer> llist = new LinkedList<>(); 			
			
			/* Here HashSet interface is used for generate unique random number
			 */	
			HashSet<Integer> hasset = new HashSet<Integer>(); 
			int[] insertkey = new int[num_key];			
			for(int i=0;i<100000;i++) // 
			{
				int chk = r1.nextInt(1000000) + 1;				
				/* below if condition check if contains have already same
				random number then go to next number */
				if (hasset.contains(chk)) {
					chk = r1.nextInt(1000000) + 1;
				}
				hasset.add(chk);
				insertkey[i] = chk;
			}
			// BELOW LOOP PERFORM HASH INSERTION AND CALCULATE TIME 
			starttime = System.currentTimeMillis();			
			for(int i=0; i<100000;i++){
				hm.put(insertkey[i], i);
			}			
			endtime = System.currentTimeMillis();
			elapsetime = endtime - starttime;
			tot_hash_ins_time += elapsetime;
			
			// BELOW LOOP PERFORM ARRAYLIST INSERTION AND CALCULATE TIME 			
			starttime = System.currentTimeMillis();
			for(int i=0; i<100000;i++){
				myarr.add(insertkey[i]);
			}
			endtime = System.currentTimeMillis();
			elapsetime = endtime - starttime;
			tot_al_ins_time +=elapsetime;
			
			// BELOW LOOP PERFORM LINKEDLIST INSERTION AND CALCULATE TIME 
			starttime = System.currentTimeMillis();	
			for(int i=0; i<100000;i++){
				llist.add(insertkey[i]);
			}
			endtime = System.currentTimeMillis();
			elapsetime = endtime - starttime;
			tot_llist_ins_time += elapsetime;
			
			// ---IMPLEMENT SEARCH WITH NEW RANGE GENERATE 100000 DISTINCT RANDOM NUMBER ---			
			int[] searchkey = new int[num_key];				
			for(int i=0;i<100000;i++) // 
			{
				int chk = r2.nextInt(2000000) + 1;				
				/* below if condition check if contains have already same
				random number then go to next number */
				if (hasset.contains(chk)) {
					chk = r2.nextInt(2000000) + 1;
				}
				hasset.add(chk);
				searchkey[i] = chk;
			}				
			// BELOW LOOP PERFORM HAS MAP SEARCH AND CALCULATE TIME	
			starttime = System.currentTimeMillis();	
			for(int i=0; i<100000;i++){
				hm.containsKey(searchkey[i]);			
			}		
			endtime = System.currentTimeMillis();
			elapsetime = endtime - starttime;
			tot_hash_srch_time += elapsetime;
			
			// BELOW LOOP PERFORM ARRAY LIST SEARCH AND CALCULATE TIME
			starttime = System.currentTimeMillis();
			for(int i=0; i<100000;i++){
				myarr.contains(searchkey[i]);
			}
			endtime = System.currentTimeMillis();
			elapsetime = endtime - starttime;
			tot_al_srch_time += elapsetime;
			
			// BELOW LOOP PERFORM LINKED LIST SEARCH AND CALCULATE TIME
			starttime = System.currentTimeMillis();
			for(int i=0; i<100000;i++){
				llist.contains(searchkey[i]);
			}
			endtime = System.currentTimeMillis();
			elapsetime = endtime - starttime;
			tot_llist_srch_time +=elapsetime;			
			
	}
		System.out.println("HashMap average insert time = "+(tot_hash_ins_time/10));
		System.out.println("ArrayList average insert time = "+(tot_al_ins_time/10));
		System.out.println("LinkedList average insert time = "+(tot_llist_ins_time/10));
		System.out.println();
		System.out.println("HashMap average search time = "+(tot_hash_srch_time/10));
		System.out.println("ArrayList average search time = "+(tot_al_srch_time/10));
		System.out.println("LinkedList average search time = "+(tot_llist_srch_time/10));
	}
}	

