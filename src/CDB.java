import java.text.DecimalFormat;

public class CDB implements Investimento {

	private float tax = 20; //em inteiro
	private double rend = 1.95; //Calculado com calculo genérico baseado na valor da SELIC de 16-06-2019
	private double montante;
	
	
	public void investir(double value) {
		
		value = value - (value * (tax / 100)) ;
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
