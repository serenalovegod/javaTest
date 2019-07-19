package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.jmock.Expectations;
import org.jmock.Mockery;
import hotel.IData;
import hotel.OutHotel;


public class OutHotelTest {
	//构造一个Mockery对象
	private Mockery context=new Mockery();
	private IData iData=null;
    private OutHotel oh=null;
	@Before
	public void setUp() throws Exception 
{
		//用Mockery实例来构造一个模拟的IData对象
		iData=context.mock(IData.class);
		oh=new OutHotel(iData);
		context.checking(new Expectations(){{
			one(iData).in_Out_Room(701,"EMPTY");			
			will(returnValue("701退房成功！"));
		}});
	}
	@Test
	public void testOut() {
		assertEquals("701退房成功！",oh.out(701));
	}
}
class person{
	
}

