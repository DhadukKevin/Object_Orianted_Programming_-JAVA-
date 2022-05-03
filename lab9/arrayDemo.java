class ReadMatrix{
	int [][]arr = {{4,2},{3,2}} ;
	public void read(int [][]matrix){
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				matrix[i][j]=arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
class thread1 implements Runnable{
	int [][] matrix=new int[2][2];
	thread1(){
		ReadMatrix rm = new ReadMatrix();
		rm.read(matrix);
	}
	public void run(){
		
		int sum1=0;
		for(int i=0;i<2;i++){
			sum1=sum1+matrix[0][i];
		}
		System.out.println("Sum1:"+sum1);
		try{
			Thread.sleep(100);
		}
		catch(Exception e){

		}
	}
}
class thread2 implements Runnable{
	int [][] matrix=new int[2][2];
	thread2(){
		ReadMatrix rm = new ReadMatrix();
		rm.read(matrix);
	}
	public void run(){
		
		int sum2=0;
		for(int i=0;i<2;i++){
			sum2=sum2+matrix[1][i];
		}
		System.out.println("Sum2:"+sum2);
		try{
			Thread.sleep(100);
		}
		catch(Exception e){
			
		}
	}
}
class arrayDemo{
	public static void main(String[] args){
		thread1 obj1 = new thread1();
		Thread t1 = new Thread(obj1);
		t1.start();
		thread2 obj2 = new thread2();
		Thread t2 = new Thread(obj2);
		t2.start();
	}
}