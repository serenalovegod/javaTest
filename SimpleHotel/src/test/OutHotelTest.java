package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.jmock.Expectations;
import org.jmock.Mockery;
import hotel.IData;
import hotel.OutHotel;


public class OutHotelTest {
	//����һ��Mockery����
	private Mockery context=new Mockery();
	private IData iData=null;
    private OutHotel oh=null;
	@Before
	public void setUp() throws Exception 
{
		//��Mockeryʵ��������һ��ģ���IData����
		iData=context.mock(IData.class);
		oh=new OutHotel(iData);
		context.checking(new Expectations(){{
			one(iData).in_Out_Room(701,"EMPTY");			
			will(returnValue("701�˷��ɹ���"));
		}});
	}
	@Test
	public void testOut() {
		assertEquals("701�˷��ɹ���",oh.out(701));
	}
}
class person{
	
}

