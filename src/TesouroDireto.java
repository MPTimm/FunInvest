import java.text.DecimalFormat;

public class TesouroDireto  implements Investimento {
	
	private float tax; //em porcentagem
	private double rend = 1.5; //em porcentagem
	private double montante;
	
	
	
	public void investir(double value) {
		
		value = value - tax;
		montante = montante + value;
	}
	
	public void previous(int time) {
		double previsao = ((montante * rend)*time) + montante;
		DecimalFormat previsaoFormat = new DecimalFormat("#.00");
		System.out.println("Valor previsto para resgate em " + time + " anos:" + "R$ " + previsaoFormat.format(previsao));
	}
	
	public void sacar(double value) {
		montante = montante - value;
		DecimalFormat saque = new DecimalFormat("#.00");
		System.out.println("Valor restante após o resgate: R$ " + saque.format(montante));
	}

	
}
