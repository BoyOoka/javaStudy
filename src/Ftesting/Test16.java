package Ftesting;

class Chick{
	int sex;
	void speak(){
		if(sex==0){
			System.out.println("���");
		}
		else{
			System.out.println("������");
		}
	}
}

class PlayChick{
	public static void main(String[] args){
		Chick kamen = new Chick();
		kamen.sex = 1;
		kamen.speak();
		Chick kamelido = new Chick();
		kamelido.sex = 0;
		kamelido.speak();
	}
}