package WeekTwelve.view;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import WeekTwelve.model.Circle;
import WeekTwelve.model.ConvexQuadrilateral;
import WeekTwelve.model.Quadrilateral;
import WeekTwelve.model.Rectangle;
import WeekTwelve.model.Square;

public class MainTest {

	public static void main(String[] args) {
		
		int option = 1;
		
		Map<String, Object> listForms = new HashMap<String, Object>();
		
		//Circle circle = new Circle(2);

		//System.out.println(circle.areaMath());
	//	System.out.println(circle.perimeterMath());
		
		
		while (option != 0) {
			int optionToBeChosen = Integer.parseInt(JOptionPane.showInputDialog("Math World!"
					+ "\n1. Quadrilatero - Convexo"
					+ "\n2. Retângulo"
					+ "\n3. Quadrado"
					+ "\n4. Circulo"
					+ "\n5. Sair"));
			
			
			switch(optionToBeChosen) {
			case 1:
				int optionConvex = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção"
						+ "\n1. Adicionar"
						+ "\n2. Listar"
						+ "\n3. Ver Área e Perímetro"
						+ "\n4. Sair"));
				
				if (optionConvex == 1) {
					float a = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de A"));
					float b = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de B"));
					float c = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de C"));
					float d = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de D"));
					
					Quadrilateral convex = new ConvexQuadrilateral(a, b, c, d);
					
					String nicknameConvex = JOptionPane.showInputDialog("Informe o apelido da sua forma "
							+ "geométrica");
					
					listForms.put(nicknameConvex, convex);
				} else if (optionConvex == 2) {
					for(@SuppressWarnings("rawtypes") Map.Entry list : listForms.entrySet()) {
						System.out.println(list.getKey());
					}
				} else if (optionConvex == 3) {
					for(@SuppressWarnings("rawtypes") Map.Entry list : listForms.entrySet()) {
						System.out.println(list.getKey());
					}
					
					String searchConvex = JOptionPane.showInputDialog("Informe de qual "
							+ "forma geométrica"
							+ " deseja obter a Área e o Perímetro");
					
					System.out.println(listForms.get(searchConvex).toString());
				} else if (optionConvex == 4) {
					option = 7;
				} else {
					option = 0;
				}					
				break;
			
			case 2:
				int optionRectangle = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção"
						+ "\n1. Adicionar"
						+ "\n2. Listar"
						+ "\n3. Ver Área e Perímetro"
						+ "\n4. Fechar Aplicação"));
				
				if (optionRectangle == 1) {
					float base = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado"));
					float height = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura"));
					
					Rectangle rectangle = new Rectangle(base, height);
					String nicknameRectangle = JOptionPane.showInputDialog("Informe o apelido da sua forma "
							+ "geométrica");
					
					listForms.put(nicknameRectangle, rectangle);
				} else if (optionRectangle == 2) {
					for(@SuppressWarnings("rawtypes") Map.Entry list : listForms.entrySet()) {
						System.out.println(list.getKey());
					}
				} else if (optionRectangle == 3) {
					for(@SuppressWarnings("rawtypes") Map.Entry list : listForms.entrySet()) {
						System.out.println(list.getKey());
					}
					
					String searchReactangle = JOptionPane.showInputDialog("Informe de qual "
							+ "forma geométrica"
							+ " deseja obter a Área e o Perímetro");
					System.out.println(listForms.get(searchReactangle).toString());
				} else if (optionRectangle == 4) {
					option = 7;
				} else {
					option = 0;
				}
				
				break;
			
			case 3:
				int optionSquare = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção"
						+ "\n1. Adicionar"
						+ "\n2. Listar"
						+ "\n3. Ver Área e Perímetro"
						+ "\n4. Fechar Aplicação"));
				
				if (optionSquare == 1) {
					float side = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor dos lados (basta um)"));
					
					Square square = new Square(side);
					
					String nicknameSquare = JOptionPane.showInputDialog("Informe o apelido da sua forma geométrica");
					
					listForms.put(nicknameSquare, square);
				} else if (optionSquare == 2) {
					for(@SuppressWarnings("rawtypes") Map.Entry list : listForms.entrySet()) {
						System.out.println(list.getKey());
					}
				} else if (optionSquare == 3) {
					for(@SuppressWarnings("rawtypes") Map.Entry list : listForms.entrySet()) {
						System.out.println(list.getKey());
					}
					
					String searchSquare = JOptionPane.showInputDialog("Informe de qual "
							+ "forma geométrica"
							+ " deseja obter a Área e o Perímetro");
					System.out.println(listForms.get(searchSquare).toString());
				} else if (option == 4) {
					option = 7;
				} else {
					option = 0;
				}
				break;
				
			case 4:
				int optionCircle = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção"
						+ "\n1. Adicionar"
						+ "\n2. Listar"
						+ "\n3. Ver Área e Perímetro"
						+ "\n4. Fechar Aplicação"));
				if (optionCircle == 1) {
					float radius = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor"
							+ " do raio"));
					
					Circle circle = new Circle(radius);
					String nicknameCircle = JOptionPane.showInputDialog("Informe o apelido da"
							+ " sua forma geométrica");
					listForms.put(nicknameCircle, circle);
				} else if (optionCircle == 2) {
					for(@SuppressWarnings("rawtypes") Map.Entry list : listForms.entrySet()) {
						System.out.println(list.getKey());
					}
				} else if (optionCircle == 3) {
					for(@SuppressWarnings("rawtypes") Map.Entry list : listForms.entrySet()) {
						System.out.println(list.getKey());
					}
					
					String searchCircle = JOptionPane.showInputDialog("Informe de qual "
							+ "forma geométrica"
							+ " deseja obter a Área e o Perímetro");
					System.out.println(listForms.get(searchCircle).toString());
				} else if (optionCircle == 4) {
					option = 7;
				} else {
					option = 0;
				}
				break;
				
			case 5:
				option = 0;
			}
		}
	}
}
