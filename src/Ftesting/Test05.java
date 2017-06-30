package Ftesting;

class Test05{
	public static void main(String[] args){
//		System.out.println(x);
//�Ͼ����󣬱���x��δ����
		int x=10;
		System.out.println(x);
		{
			int y=20;
			System.out.println(y);
			System.out.println(x);
//�˴�û�����⣬�ӳ�����п���ʹ�ø�������������ı���
//			int x=30;
//�Ͼ����󣬱���x���ӳ��������Ч���Ͳ����ظ�����
			x=30;
//�˴�û�����⣬�ǶԸ�������������ı���x�޸�ֵ
		}
//		System.out.println(y);
//�Ͼ����󣬱���y�Ѿ�����
		int y=40;
//�˴�û�����⣬�ӳ�����������ı���y�Ѿ������������ٴ�����
	}
}