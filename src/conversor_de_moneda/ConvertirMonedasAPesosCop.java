package conversor_de_moneda;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesosCop {

	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 4104.47;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Colombianos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 4517.95;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Colombianos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 5233.28;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Colombianos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 29.93;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Colombianos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 3.14;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Colombianos");
	}
	
}
