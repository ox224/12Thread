package thread1;

public class CarTarget implements Runnable {//ʵ��Runnable�ӿ�

	
	public void run(){
		for(int i=1;i<=20;i++){
			System.out.print("�ų�"+i+" ");
		}

	}

}
	