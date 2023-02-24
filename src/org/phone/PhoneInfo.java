package org.phone;

public class PhoneInfo {
private void phoneName() {
	System.out.println("moile name is: mi");
}
private void phoneMieiNum() {
	System.out.println("moile miei num is: 34567");
}
private void camera() {
	System.out.println("moile camera is: 13pxl");
}
private void storage() {
	System.out.println("moile storage is: 32gb");
}
private void osName() {
	System.out.println("moile osname is: android");
}
	public static void main(String[] args) {
	System.out.println("Phone basic information");
	PhoneInfo  pho = new PhoneInfo ();
	pho.phoneName();
	pho.phoneMieiNum();
	pho.camera();
	pho.storage();
	pho.osName();

	}

}
