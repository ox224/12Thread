package thread1;

public class CarTarget implements Runnable {//实现Runnable接口

	
	public void run(){
		for(int i=1;i<=20;i++){
			System.out.print("桥车"+i+" ");
		}

	}

}
	