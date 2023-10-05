package org.phone;

public class PhoneInfo {
	public void phonename() {
		System.out.println("phone name iphone");
	}
	public void phoneieme() {
		System.out.println("phone imei 1234567890");
	}
	public void camera() {
		System.out.println(" camerav pixel 24");
	}
	public void storage () {
		System.out.println("storage 128 gb  ");
	}
	public void osname () {
		System.out.println("os name is ios jelly bean");
	}
public static void main(String[] args) {
	PhoneInfo s=new PhoneInfo();
	s.camera();
	s.phonename();
	s.osname();
	s.storage();
	s.phoneieme();
}
}
