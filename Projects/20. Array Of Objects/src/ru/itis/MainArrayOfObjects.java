package ru.itis;

public class MainArrayOfObjects {

    public static void main(String[] args) {
	    User users[] = new User[10];

	    users[3] = new User("Марсель", 25, 1.85);
	    for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
    }
}
