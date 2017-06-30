package Ftesting;

abstract class F{
	abstract void ab();
	abstract void cd();
	void ef(){
		System.out.println("ef");
	}
}

//abstract 
class G extends F{
	void ab(){
		System.out.println("ab");
	}

	void cd(){
		System.out.println("cd");
	}

}

class TestG{
	public static void main(String arg[]){
		G b= new G();
		b.ab();
		b.cd();
		b.ef();
	}
}