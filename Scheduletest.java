import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.Test;


public class Scheduletest {
   
	@Test
	public void test() {
		works.add(work1);
		works.add(work2);
		works.add(work3);
		doub1.add(12.333333333333334 );doub1.add(2.755555555555556);
		doub2.add(11.666666666666666);doub2.add(2.4);
		assertEquals(doub1,sch.FCFS(works));
		assertEquals(doub2,sch.SJF(works));
	}
   /* public boolean equal(Work work1,Work work2){
    	if(work1.getArrivalTime()==work2.getArrivalTime()&&
    			work1.getServiceTime()==work2.getServiceTime())
    	    return true;
    	else 
    		return false;
    }*/
	Schedule sch=new Schedule();
    List<Work> works = new ArrayList<Work>();
    Work work1 = new Work("first", 1, 10);
    Work work2 = new Work("second", 3, 5);
    Work work3 = new Work("second", 5, 3);
    List<Double> doub1 = new ArrayList<Double>();
    List<Double> doub2 = new ArrayList<Double>();
}
