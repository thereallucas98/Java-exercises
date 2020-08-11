package basico;

import javax.swing.JOptionPane;
import java.lang.Math;
public class BaskaraFormule {
	public static double Delta(double aD, double bD, double cD) {
		double del = (bD * bD) - (4 * aD * cD);
		
		return del;
	}
	public static void main(String[] args) {
		
		double a, b, c, delta, r1, r2;
		String as, bs, cs;
		
		as = JOptionPane.showInputDialog("Informe o valor de A [CASO O X ELEVADO AO QUADRADO NÃO POSSUA VALOR, INFORME A = 1]");
		bs = JOptionPane.showInputDialog("Informe o valor de B [INFORME CASO SEJA NEGATIVO]");
		cs = JOptionPane.showInputDialog("Informe o valor de C [INFORME CASO SEJA NEGATIVO]");
		
		a = Double.parseDouble(as);
		b = Double.parseDouble(bs);
		c = Double.parseDouble(cs);
		
		delta = Delta(a, b, c);
		JOptionPane.showMessageDialog(null, "Delta = " + delta);
		if (delta < 0) {
			JOptionPane.showMessageDialog(null, "Não existe raíz real, DELTA = 0");
		} else {
			r1 = (-b + Math.sqrt(delta)) / (2*a);
            JOptionPane.showMessageDialog(null, "A 1º raiz é: " + r1);
            r2 = (-b - Math.sqrt(delta)) / (2*a);
            JOptionPane.showMessageDialog(null, "A 2º raiz é: " + r2);
		}

	}

}