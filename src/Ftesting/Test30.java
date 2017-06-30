package Ftesting;

class Animal{
	void speak(){
		System.out.println("������������~");
	}
}

class Human extends Animal{
	void speak(){
		System.out.println("��ã�");
	}
}

class TestQ{
	public static void main(String arg[]){
		Animal zhangsan;
		boolean drunk=true;
		if(drunk)
			zhangsan = new Animal();
		else
			zhangsan = new Human();
		zhangsan.speak();
	}
}