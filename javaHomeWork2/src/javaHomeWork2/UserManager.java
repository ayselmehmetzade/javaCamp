package javaHomeWork2;

public class UserManager {

	public void addUser(User user) {
		System.out.println("Sisteme yeni kullanıcı eklendi: " + user.getEmail() + " " + user.getFirstName() + " "
				+ user.getLastName());

	}
	
	public void deleteUser(User user) {
		System.out.println("Kullanıcı silindi: " + user.getFirstName() + " " + user.getLastName());
	}

	public void updateUser(User user) {
		System.out.println("Kullanıcı Güncellendi: " + user.getFirstName() + " " + user.getLastName());
	}
}
