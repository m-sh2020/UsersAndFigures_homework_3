package stack;

public class Main {

	public static void outputInfo(StackRealization stack) {
		System.out.println(stack.toString());
		System.out.println("Количество элементов в стеке:" + stack.getSize());
		System.out.println("Средний возраст людей: " + stack.arithmeticMean() + " лет\n");
	}

	public static void main(String[] args) {
		StackRealization stackUsers = new StackRealization();
		stackUsers.push("Максим", 20, "Пароль 1");
		stackUsers.push("Маргарита", 35, "Пароль 2");
		stackUsers.push("Алексей", 55, "Пароль 3");
		stackUsers.push("Ксения", 41, "Пароль 4");
		stackUsers.push("Алина", 28, "Пароль 5");
		outputInfo(stackUsers);
		stackUsers.pop();
		System.out.println("Стек после удаления последнего элемента:");
		outputInfo(stackUsers);
	}
}
