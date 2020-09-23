package WeekTwo.Owner;

public class MainOwner {
	public static void main(String[] args) {
		ExerciseOwnerAddress address = new ExerciseOwnerAddress("ABC", 172, "Neight", "João Pessoa", "Paraíba", "5843412");
		ExerciseOwner newOwner = new ExerciseOwner("David Lucas", "12312312312", "12345", "22/06/1998", address);
		
		
		System.out.println(newOwner);
		
		System.out.println(newOwner.getAddress());
	}
	
}
