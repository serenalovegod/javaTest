package hotel;

public class InHotel extends Empty
{		
	private int room;
	public  String in(int roomNo, String name)
	{
		MainRun mr=new MainRun();
		room=(roomNo%100)-1;
		if(isEmpty(roomNo))
		{	mr.getRoom()[(roomNo/100)-1][room]=name;
			return name+"�ɹ���ס"+roomNo+"���䣡";}
		else
			return "�÷����Ѿ��п�����ס��";
	}	
		@Override
		public boolean isEmpty(int roomNo)
		{
			String room=mr.getRoom()[(roomNo/100)-1][(roomNo%100)-1];
			
			if("EMPTY".equals(room)) 
				return true;
			else
				return false;
		 }	
}
