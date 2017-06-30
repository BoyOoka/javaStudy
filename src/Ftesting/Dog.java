package Ftesting;

class Dog{
	String name;
	String color="��";
	void talk(){
		System.out.println("����������"+name);
	}
	int howold(int age){
		return age;
	}
}

class PlayDog{
	public static void main(String args[]){
		Dog d = new Dog();
		d.name="����";
		d.talk();
		System.out.println("����" + d.color + "�ģ��ҽ���" + d.howold(3) + "��");
	}
}