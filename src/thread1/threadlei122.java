package thread1;

public class threadlei122 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Thread speakElephant;//用Thread声明线程
		Thread speakCar;//用Thread声明线程
		ElephantTarget elephant;//elephant是目标对象
		CarTarget car;//car是目标对象
		elephant=new ElephantTarget();//创建目标对象
		car=new CarTarget();//创建目标对象
		speakElephant = new Thread(elephant);//创建线程，其目标对象是elephat
		speakCar=new Thread(car);//创建线程，其目标对象是car
		speakElephant.start();//启动线程
		speakCar.start();//启动线程
		for(int i=1;i<=15;i++){
			System.out.print("主人"+i+" ");
		}

	}

}
