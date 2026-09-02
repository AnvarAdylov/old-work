import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionTest {
	public static void main(String[] args) {
		List<Person> users = Arrays.asList( new Person(15,182,"John"), new Person(12,142,"Carl"), new Person(43,150,"Susan"), new Person(23,175,"Steve"));
		List<Person> filteredUsers = users.stream()
							 .filter((Person x) -> x.getAge() < 24)
							 .filter((Person x) -> x.getHeight() > 160)
							 .filter((Person x) -> x.getName().length() < 5)
							 .collect(Collectors.toList());
		System.out.println(filteredUsers);
		
		for (int i = 1;i<101;i++) {
			if (i%15 == 0) {
			System.out.println("FizzBuzz");
			} else if (i%3 == 0) {
			System.out.println("Fizz");
			} else if (i%5 == 0) {
			System.out.println("Buzz");
			} else {
			System.out.println(i);
			}
		}
	}
	
}
