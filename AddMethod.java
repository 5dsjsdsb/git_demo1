public class AddMethod(){
	public static void main(String[] args){
		int x = 10;
		int y = 20;
		System.out.println(add(x,y));
		System.out.println(add(x+10,y));
	}
	public int add(int x, int y){
		return x+y;
	}
}
