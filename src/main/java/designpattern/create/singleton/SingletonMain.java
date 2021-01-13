package designpattern.create.singleton;

public class SingletonMain {
	
	public static void main(String[] args) {
		SingletonEager singltoneager = SingletonEager.getSingltoneager();
		System.out.println(singltoneager.hashCode());
		SingletonEager singltoneager4=	SingletonEager.getSingltoneager();
		System.out.println(singltoneager4.hashCode());
	}

}
