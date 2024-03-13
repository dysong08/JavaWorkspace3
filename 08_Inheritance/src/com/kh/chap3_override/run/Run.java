package com.kh.chap3_override.run;

import com.kh.chap3_override.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		
		Book bk =  new Book("수학의 정석", "김길동", 15000);
		
		System.out.println(bk);				//== (bk.toString) == Object클래스의 주소값
		System.out.println(bk.toString());	//== (bk) == Object클래스의 주소값
		System.out.println(bk.tostring());	//==Book클래스에 있는 tostring() 메서드에 bk에 정의한 내용이 출력됨
				
		
		
//		출력문 안에 참조형변수(레퍼런스변수)를 제시해서 출력하고자 할때, 내부적으로 JVM이 자동으로 toString()메서드를 호출한다.
//		
//		부모클래스인 Object클래스에 있는 toString()
//		해당 참조형의 풀클래스명+@+해당객체의 주소값
//		
//		자식클래스인 Book클래스에서 toString()메서드를 재정의시
//		해당 객체의 모든 필드값을 하나의 문자열로 합쳐서 돌려줄 수 있다.
//		
//		모든 클래스는 Object클래스의 후손이다. 즉 항상 최상위클래스는 Object
//		=>Object에 있는 모든 메서드들을 다 가져다 쓸 수 있다.
//		=>마음에 들지 않으면 재정의가 가능하다.
		
		
//		메서드 오버라이딩 전 : com.kh.chap3_override.model.vo.Book@17d677df
//		메서드 오버라이딩 후 : 책 제목 : 수학의 정석, 책 저자 : 김길동, 책 가격 : 15000
		
		
	}

}
