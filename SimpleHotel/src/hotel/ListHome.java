package hotel;
public class ListHome {
	MainRun mr=new MainRun();
	public  void search() {
		for (int i = 0; i < mr.getRoom().length; i++) {
			//��ӡ�����
			for (int j = 0; j < mr.getRoom()[0].length; j++)
 {
				if (j + 1 < 10) {
					System.out.print(i + 1 + "0" + (j + 1) + "  ");
				} else {
					System.out.print(i + 1 + "" + (j + 1) + "  ");
				}
			}
			//��ӡ����״̬
			System.out.println();
			for (int j = 0; j < mr.getRoom()[0].length; j++) {
				System.out.print(mr.getRoom()[i][j] + "	");
			}
			System.out.println();
		}
	}
}



	
