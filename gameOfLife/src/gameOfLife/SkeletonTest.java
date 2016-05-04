package gameOfLife;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SkeletonTest{

//	@Test
//	public void testMain() { {
//		
//	}
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSkeleton() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetPlayerAmount()
//	{
//		Skeleton tester = new Skeleton();
//		
//		
//	}
//	
//
//
//	@Test
//	public void testSetPlayerOne(){
//		
//		Skeleton tester = new Skeleton();
//		
//	}
//	
//
//	@Test
//	public void testSetPlayerTwo() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetPlayerThree() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetPlayerFour() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetPlayers() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUpdatePlayers() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCheckPos() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testShowUniCards(int response) {
//		Skeleton tester = new Skeleton();
//		if(tester.showUniCards(int response))
//		{
//			tester.showUniCards(0);
//			tester.showUniCards(1);
//			tester.showUniCards(2);
//			tester.showUniCards(3);
//			tester.showUniCards(4);
//			tester.showUniCards(5);
//		}
//		else 
//		{
//			fail("Not yet implemented");
//		}
//		
//	}
	
	

	@Test
	public void testAddAndGet1() {
	    ArrayList list = new ArrayList();
	    list.add(42);
	    list.add(-3);
	    list.add(17);
	    list.add(99);
	    assertEquals(42, list.get(0));
	    assertEquals(-3, list.get(1));
	    assertEquals(17, list.get(2));
	    assertEquals(99, list.get(3));

	    assertEquals("second attempt", 42, list.get(0));   // make sure I can get them a second time
	    assertEquals("second attempt", 99, list.get(3));
	}

//	@Test
//	public void testShowCareerCards() {
//		
////		test cards 
//		Skeleton cards = new Skeleton();
//
//	
//		
//		
//	}
//	@Test
//	public void testUpdatePos(int movement) {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testUpdateCar() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDegreeOrJob() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSpinWheel() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSpinForMoney() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testPayDay() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSuePlayer() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCollectFifty() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCollectForty() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCollectThirty() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCollectTwenty() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCollectTen() {
//		
//		Skeleton tester = new Skeleton();
//		
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCollectTwentyFromPlayers(){
//	Skeleton tester = new Skeleton();
//	
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCollectTenFromPlayers() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testPayForty() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testPayThirty() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testPayTwenty() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testPayTen() {
//		
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testLifeCards() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testHouseCards() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testShowHouseCards() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCareerCards() {
//		Skeleton tester = new Skeleton();
//		fail("Not yet implemented");
//	}

}
