package ceshi;

import static org.junit.Assert.*;

import org.junit.Test;


public class StringDemoTest {

	@Test
	public void testSmallString() {
		StringDemo c=new StringDemo();
		assertEquals("一个字母变小写",c.smallString("A"),"a");
	}
	@Test
	public void testSmallString1() {
		StringDemo c=new StringDemo();
		assertEquals("一个字母变小写",c.smallString("A"),"b");
	}
	@Test
	public void testSmallString2() {
		StringDemo c=new StringDemo();
		assertEquals("一个字母变小写",c.smallString("b"),"A");
	}
	@Test
	public void testSmallString3() {
		StringDemo c=new StringDemo();
		assertEquals("一个字母变小写",c.smallString("b"),"B");
	}
	@Test
	public void testSmallString4() {
		StringDemo c=new StringDemo();
		assertEquals("一个字母变小写",c.smallString("b"),"a");
	}
	@Test
	public void testSmallString5() {
		StringDemo c=new StringDemo();
		assertEquals("一个字母变小写",c.smallString("B"),"A");
	}
	@Test
	public void testSmallString6() {
		StringDemo c=new StringDemo();
		assertEquals("一个字母变小写",c.smallString("BC"),"bc");
	}
	@Test
	public void testSmallString7() {
		StringDemo c=new StringDemo();
		assertEquals("一个字母变小写",c.smallString("BC"),"Bc");
	}
	@Test
	public void testSmallString8() {
		StringDemo c=new StringDemo();
		assertEquals("一个字母变小写",c.smallString("BC"),"BC");
	}
	@Test
	public void testSmallString9() {
		StringDemo c=new StringDemo();
		assertEquals("一个字母变小写",c.smallString("BC"),"bC");
	}

}
