package WeekFour.exerciseTwo.application;

import WeekFour.exerciseTwo.entities.Pedido;

public class Sistema {

	public static void main(String[] args) {
		Pedido p1 = new Pedido();
		p1.addItem(1, 3, 10, "Arroz");
		
		System.out.println(p1.getTotal());
	}
}
