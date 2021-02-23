//��Ű��: ���ΰ��ü� �ִ� Ŭ�������� ����
//      NameSpace(�̸�����) ���� - �̸��� �浹 ����
//���� �ۼ��� Ŭ������ ��ġ�� ǥ��

public class A {
 /*
          �� class�ȿ� ��ġ�� �� �ִ� �͵�?
      1. ��������
          int su;
          String str;
          
          su=100;//���� �ʱ�ȭ(���Ҵ�)  ---->�����߻�
          
      2. �޼ҵ� ����    	
 */
   int su;//��������(�������==field)
	   //su=100;  ----> �����ʱ�ȭ�� ����ڸ��� ��ġX
   
   int su2=200; //��������� �ʱ�ȭ�� ���ÿ� ����ϴ°� ����
   
   void hello(int su4/*�Ű�����==��������*/) 
   {//�޼ҵ� ����
	  int su3;//��������(��������)
	      su3=300;//���� �ʱ�ȭ
      System.out.println("�ȳ�"+ su2);	   
      System.out.println("hello"+ su3);	   
      System.out.println("��¥��");	   
   }
   
   void hi() {
	   System.out.println("su2="+su2);
	   //System.out.println("su3="+su3);
	   //su3������ hello()�޼ҵ��� ���������̱� ������ ���Ұ�
   }
}





