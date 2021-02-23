package com.mulcam.j0104;

public class InheritanceTest {
  public static void main(String[] args) {
	//1.부모클래스 객체생성
	Parent p=new Parent();
	/*
	   <메모리 할당>
	    Object
	    Parent <---- p
	 */
	System.out.println("su="+ p.su);
	p.hello();
	//p.goodBye();//에러발생
	//부모 레퍼런스를 통해 자식 호출 불가!!	
	
	System.out.println("================");
	
	//2.자식클래스 객체생성
	Child c=new Child();
	  
	/*
		   <메모리 할당>
		    Object
		    Parent 
		    Child  <---- c
	*/
	c.goodBye();
	c.hello();
	//자식 레퍼런스를 통해 부모 호출 가능!!
		
	System.out.println("================");

	//3. 부모클래스 = 자식클래스★
	Parent p2;
	       p2= new Child();
	//또는  Parent p2 = c;
    /*
       <메모리 할당>
	     Object
		 Parent  <---- p2
		 Child  
	 */
    p2.hello();
    //p2.goodBye();//에러발생
    //부모 레퍼런스를 통해 자식 호출 불가!!	
    //★단, 오버라이딩메소드가 존재한다면 
 //부모메소드는 은폐(은닉)되고 자식메소드로 대체가 되어진다!!
    
    
    
    
    System.out.println("================");
			
	//4. 자식클래스 = 부모클래스 : 에러발생
    
	//Child c21 = new Parent();
	//Child c22 = p;
	//Child c23 = p2;
    
    //5. 자식클래스 = (자식클래스)부모클래스
  	Child c2;
  	     c2=(Child)p2;//실행  	     
  	     //c2=(Child)p; //에러
  	//자식 정보가 없는 부모클래스는 자식으로 형변환 불가
	
	 
		
	
  }
}




