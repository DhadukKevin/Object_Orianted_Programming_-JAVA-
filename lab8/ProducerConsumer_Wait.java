class HeadPhone{
	int stock=3;
	public synchronized void produce(){
		while(stock>5){
			try{
				wait();
			}catch(Exception e){

			}
		}
		notifyAll();
		stock++;
		System.out.println("Current stock = "+stock);
	}
	public synchronized void consume(){
		while(stock<1){
			try{
				wait();
			}catch(Exception e){
				
			}
		}
		notifyAll();
		stock--;
		System.out.println("Current stock = "+stock);
	}
}

class Producer extends Thread{
	HeadPhone hp;
	public Producer(HeadPhone hp){
		this.hp = hp;
	}
	public void run(){
		while(true){
			hp.produce();	
			try{
				sleep((int)(Math.random()*200));
			}catch(Exception e){

			}
		}
	}
}

class Consumer extends Thread{
	HeadPhone hp;
	public Consumer(HeadPhone hp){
		this.hp = hp;
	}
	public void run(){
		while(true){
			hp.consume();
			try{
				sleep((int)(Math.random()*200));
			}catch(Exception e){

			}
		}
	}
}
class ProducerConsumer_Wait{
	public static void main(String args[]){
		HeadPhone hp = new HeadPhone();
		Producer p = new Producer(hp);
		Consumer c = new Consumer(hp);

		p.start();
		c.start();
	}
}