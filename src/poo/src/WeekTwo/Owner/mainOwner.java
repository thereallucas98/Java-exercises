package WeekTwo.Owner;

public class mainOwner {
	public static void main(String[] args) {
		exerciseOwnerAddress address = new exerciseOwnerAddress("ABC", 172, "Neight", "João Pessoa", "Paraíba", "5843412");
		exerciseOwner newOwner = new exerciseOwner("David Lucas", "12312312312", "12345", "22/06/1998", address);
		
		
		System.out.println(newOwner);
		
		System.out.println(newOwner.getAddress());
	}
	
}
