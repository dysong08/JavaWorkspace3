package com.kh.chap2_inherit.run;

import com.kh.chap2_inherit.model.vo.Airplane;
import com.kh.chap2_inherit.model.vo.Car;
import com.kh.chap2_inherit.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {

		Vehicle v = new Vehicle("탈것", 0.3, null);
		System.out.println(v.information());
		v.howToMove();
		
		Car c = new Car("테슬라", 12.5, "전기차", 4);
		
		System.out.println(c.information());
		
		
		c.howToMove();
		
		
		Airplane a = new Airplane("대한항공", 0.5, "여객기", 16, 4);
		System.out.println(a.information());
		
		a.howToMove();
		
	}

}
