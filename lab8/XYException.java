class XYException{
	public static void main(String[] args){
		try{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			int mul=x*y;
			System.out.print(mul);
		}catch(Exception e){
			System.out.println("Invalid value of x or y");
		}
	}
}
