package com.mulcam.j0111;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.mulcam.j0108.Car;

public class MapTest {
   public static void main(String[] args) {
	  /*
	    Map<K,V>
	    - �Ź��� Ŭ���� (�Ź�:������, ����:Ű)
	    - Key, Value(������!!)
	    - Key�� ���� ���ڿ� ���, Value�� Object
	    - Key���� �ߺ�X(������ ���� ���´�)
	   */
	  Map<String, Object> map = new HashMap<>();
	    //������ �Է�("ȫ�浿",13,"�л�")
	    //map.put(String key,String value);
	     map.put("name", "ȫ�浿");
	     map.put("age",  13);//+"");
	     map.put("job",  "�л�");
	     
	  Map<String, String> map2 = new HashMap<>();
	    //������ �Է�("ȫ�浿","�����","���ֿ�","������","�̼���")
	    map2.put("k1", "ȫ�浿");
	    map2.put("k2", "�����");
	    map2.put("k3", "���ֿ�");
	    map2.put("k4", "������");
	    map2.put("k3", "�̼���");//�ߺ� Ű�� ����: �����
	    
	  //������ ��� (k3Ű�� ����� �����͸� ���!!)
	    //map2.get(Object key)
	  System.out.println("k3Ű�� ����� ��: "+ map2.get("k3"));
	  
	  //Ư�� Ű����
	  map2.remove("k4");
	  
	  //Ư�� Ű�� ����� ������ ����
	  map2.replace("k3", "�ϼ���");	  
	  
	  //��ü ������ ���?
	  System.out.println("map2.toString()="+ map2);
	  
	  Collection<String> col =map2.values();
	  
	  Iterator<String> it =  col.iterator();
      while(it.hasNext()) {
        System.out.println(it.next());
      }
      
      //map2��  key���� ���� ������!!
      Set<String> set = map2.keySet();
      Iterator<String>  keyset = set.iterator();
      while(keyset.hasNext()) {
    	  String key = keyset.next();
    	  System.out.println(key+"==>"+ map2.get(key));
      }
      
      
      
      //����) Map m3; ��  PersonŬ����(4,"�浿",13,"�л�"), 
      //               CarŬ����("�ҳ�Ÿ",4,100)
      //               �Ÿ������� (10km) �� �����Ͻÿ�.
      
      Person p = new Person(4,"�浿",13,"�л�");
      Car c = new Car("�ҳ�Ÿ",4,100);
      String distance="10km";
      
      Map<String,Object> m3 = new HashMap<String, Object>();
        m3.put("person", p);
        m3.put("car", c);
        m3.put("distacne", distance);
        
      //hello(m3);
      //Object ob =  m3.get("person");
       Person ob = (Person) m3.get("person");
        
	   //����) personŰ�� ����� �̸��� ���̸� ���
      System.out.println("�̸�:"+ ob.getName());
      
     
      
   }
}















