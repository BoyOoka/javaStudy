package Ftesting;

class AnimalQ{
	String name;
	private int temp=10;
	void speak(){
		System.out.println("aoooo~");
	}
}

class HumanQ extends AnimalQ{
	int tall;
	void speak(){
		System.out.println("Hello!");
	}
}

class TestHuman{
	public static void main(String arg[]){
		HumanQ h = new HumanQ();
		h.name = "����";
		h.tall = 170;
//		System.out.println(h.temp);
		h.speak();
	}
}