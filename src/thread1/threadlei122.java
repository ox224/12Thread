package thread1;

public class threadlei122 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Thread speakElephant;//��Thread�����߳�
		Thread speakCar;//��Thread�����߳�
		ElephantTarget elephant;//elephant��Ŀ�����
		CarTarget car;//car��Ŀ�����
		elephant=new ElephantTarget();//����Ŀ�����
		car=new CarTarget();//����Ŀ�����
		speakElephant = new Thread(elephant);//�����̣߳���Ŀ�������elephat
		speakCar=new Thread(car);//�����̣߳���Ŀ�������car
		speakElephant.start();//�����߳�
		speakCar.start();//�����߳�
		for(int i=1;i<=15;i++){
			System.out.print("����"+i+" ");
		}

	}

}
