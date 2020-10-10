package stack.node;

public class UserNode {
	private String name;
	private int age;
	private String password;
	protected UserNode next;

	public UserNode (String n, int age, String p) {
		this.name = n;
		this.age = age;
		this.password = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserNode getNext() {
		return next;
	}

	public void setNext(UserNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Имя: " + name + "; возраст: " + age + "; пароль: " + password + ".";
	}
}
