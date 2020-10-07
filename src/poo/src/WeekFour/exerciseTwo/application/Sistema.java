package WeekFour.exerciseTwo.application;

import WeekFour.exerciseTwo.entities.Pedido;

public class Sistema {

	public static void main(String[] args) {
		Pedido p1 = new Pedido(null);
		
		p1.addItem(123, 4, (float) 14.50, "Arroz");
		
		System.out.println(p1.getTotal());
		
		System.out.println(p1.getItem());
	}
}
