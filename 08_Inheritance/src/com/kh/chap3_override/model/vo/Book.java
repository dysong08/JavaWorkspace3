package com.kh.chap3_override.model.vo;

public class Book /* extends Object */ {

	private String title;
	private String author;
	private int price;

	public Book() {

	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
//	오버라이딩
//	- 상속받고 있는 부모클래스의 메서드를 자식클래스에서 재정의(재작성)하는 것
//	- 부모가 제공하고 있는 메서드를 자식이 일부 고쳐서 사용하겠다는 의미(실행 우선권은 자식메서드에게 있다)
//	
//	오버라이딩 성립조건
//	- 부모메서드의 메서드명과 동일해야 한다
//	- 매개변수 자료형, 개수, 순서가 정확하게 일치해야 한다
//	- 반환형이 일치해야 한다
//	- 부모메서드의 접근제한자보다 같거나 공유범위가 더 커야한다
//	
//	@Override 어노테이션
//	- 생략가능(명시를 안해도 부모메서드와 형태가 같으면 오버라이딩 된 것)
//	- 그럼에도 불구하고 어노테이션을 붙이는 이유
//	>잘못 기술했을 경우(성립조건과 다르게)오류를 알려주기 때문에 다시 한 번 검토할 수 있게 유도한다
//	>혹시라도 부모메서드가 나중에 수정이 되었을 경우 오류를 알려주기 때문에 검토할 수 있게 유도한다
//	>이 메서드가 오버라이딩된 메서드라는 것을 알리고자 하는 목적이 큼
	
	
	
	
	//@Override
	public String tostring() {
		return "책 제목 : " + title + ", 책 저자 : " + author + ", 책 가격 : " + price;
	}
	
	
	
}
