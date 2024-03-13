package com.kh.chap01_beforeVsAfter.after.run;

import com.kh.chap01_beforeVsAfter.after.model.vo.*;

public class Run {

	public static void main(String[] args) {

		//데스크탑 객체생성
		Desktop d = new Desktop("삼성", "d-01", "삼성데스크탑",1_500_000, true);
		
		//스마트폰 객체생성
		Smartphone sm = new Smartphone("삼성","s-01","z플립5",1_400_000, "kt");
		
		//tv 객체생성
		Tv t = new Tv("엘G", "t-01", "슬림티비", 3_500_000, 50);
		
		
		
		System.out.println(d.information());
		System.out.println(sm.information());	
		System.out.println(t.information());	// t(Tv클래스)에 information 메서드가 없어도 실행됨..
		
		// 실행하고자하는 메서드가 자식클래스에 없다면 자동으로 부모클래스에 있는 메서드가 실행됨
		// 단, 자식클래스에서 재정의(오버라이딩)된 메서드가 있다면 실행 우선권을 가진다.
		
		
		
//		매 클래스마다 중복된 코드들을 일일이 기술해 놓으면 수정, 추가, 삭제시 매번 일일이 찾아가서 수정을 해야 하는 번거로움이 생긴다. 
//				ex) 필드명 수정, 새로운 필드 추가시
//		
//		상속이라는 개념을 적용시켜서 매 클래스마다 "중복된" 필드, 메서드들을 단 한 번 또 하나의 클래스(부모클래스)에 정의해둔 뒤 
//		해당 클래스를 상속받아서 부모클래스의 필드와 메서드를 가져다 쓰는 방식으로 코드의 중복을 피해야 한다.
//		
//		
//		 상속의 장점 : 
//		- 보다 적은 양의 코드로 새로운 클래스들의 작성이 가능
//		- 중복된 코드를 공통적으로 관리하기 때문에 새로운 코드를 추가, 수정에 용이함
//		  =>프로그램의 생산성 증대 및 유지보수에 크게 기여함.
//		  
//		 상속의 특징 : 
//		- 클래스간의 상속은 다중상속이 불가능하다(단일 상속만 가능)
//		- 명시되어있지 않지만 모든클래스는 Object클래스의 후손
//			=> Objcet클래스에 있는 메서드를 모든 클래스에서 사용이 가능하다
//			=> Object클래스에 있는 메서드가 마음에 안들면 오버라이딩을 통해 재정의가 가능하다
		
		
		
		
		
		
		
		
	}

}
