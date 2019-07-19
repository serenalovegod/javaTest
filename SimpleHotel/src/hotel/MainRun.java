package hotel;
import java.util.Scanner;
public class MainRun {
	private static String[][] rooms;// ��ʾ����
	private static ListHome lh=new ListHome();
	private static InHotel ih=new InHotel();
	private static OutHotel oh=new OutHotel();
	static DP dp=new DP();
	 static IData id =dp;
	public static void main(String[] args) {
		iniRooms();		
		Command();
	}
	private static void iniRooms() {
		rooms = new String[10][12];
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[0].length; j++) {
				rooms[i][j] = "EMPTY";
			}
		}
	}
		private static  void Command() {
		String comm;// ��ʾ�û����������
		while (true) {
			System.out.println("���������");
			
			Scanner sca = new Scanner(System.in);
			System.gc();
			comm = sca.next();
			if ("search".equalsIgnoreCase(comm)) {
				lh.search();
			} else if ("in".equalsIgnoreCase(comm)) {
				int roomNo = sca.nextInt();
				try{
				if( validRoomNo(roomNo)){
					String name = sca.next();
					System.out.println(ih.in(roomNo, name));
					}else
				      System.out.println("����Ŵ�!");
				}catch(Exception e)
				{
					System.out.println("����Ŵ�!");
				}
			} else if ("out".equalsIgnoreCase(comm)) {
				int roomNo = sca.nextInt();
				if( validRoomNo(roomNo)){
					System.out.println(oh.out(roomNo));
					}else
						System.out.println("����Ŵ�!");
													
			} else if ("exit".equalsIgnoreCase(comm)) {
				System.out.println("�����˳�...");
				break;
			} else {
				System.out.println("��������������������룺");
			}
		sca.close();
		}
		
			
		}
	private static  boolean validRoomNo(int roomNo){
		if((roomNo/100>10)||(roomNo/100<1)||(roomNo%100>12)||(roomNo%100<1))
				return false;
			else 
				return true;		
	}
	public String[][] getRoom(){
		return rooms;
	}
}

