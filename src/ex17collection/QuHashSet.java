package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}

	/*
	객체에게 부여된 주소값(참조값)을 숫자형태로 반환해주는 메소드
	 */
	@Override
	public int hashCode() {
		int hc1 = name.hashCode();
		int hc2 = heroName.hashCode();
		int hc3 = weapon.hashCode();
		/*
		해당 객체가 보유한 모든 멤버변수를 이용해서 해시값을 구하고
		연산(사칙연산 뭐든지..)하여 결과를 반환하면 된다.
		 */
		return hc1+hc2+hc3;
	}
	
	/*
	객체의 내용을 비교하여 동일한지 여부를 판단하는 메소드
	 */
	@Override
	public boolean equals(Object obj) {
		Avengers avengers = (Avengers)obj;
		if(this.heroName.equals(avengers.heroName)
				&& this.name.equals(avengers.name)
				&& this.weapon.equals(avengers.weapon)) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	@Override
//	public int hashCode() {
//		return name.hashCode();
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		Avengers Person = (Avengers)obj;
//		System.out.println("오버라이딩한 equals()메소드 호출됨");
//		if( Person.name.equals(this.name)) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
}

public class QuHashSet {

	public static void main(String[] args) {

		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 
		//중복 제거용 equals 메소드
		
		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());			
		}
		//Iterator 이용 검색 및 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세욤:");
		String name1 = sc.nextLine();
		boolean searchFlag = false;
		//set을 통해 Iterator 객체를 생성
		Iterator<Avengers> itr = set.iterator();
		while(itr.hasNext()) {
			
			Avengers a = itr.next();
			if (a.name.equals(name1)) {
				//toString을 오버라이딩 했으므로 바로 출력이 가능하다
				System.out.println(a +" ");
				System.out.println("요청한 정보를 찾았습니다.");
				//검색결과가 있는경우
				searchFlag = true;
			}
		}
		if (searchFlag==false) {
			System.out.println("해당영웅은 없어요ㅠ");
		}
	}
}

