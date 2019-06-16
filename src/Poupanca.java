import java.text.DecimalFormat;

public class Poupanca implements Investimento {
	
	private float rend = 10; //em inteiro
	private double montante;
	
	public void investir(double value) {
		montante = montante + value;
	}
	
	public void previous(int time) {
		double previsao = ((montante * (rend / 100))*time) + montante;
		DecimalFormat previsaoFormat = new DecimalFormat("#.00");
		System.out.println("Valor previsto para resgate em " + time + " anos:" + "R$ " + previsaoFormat.format(previsao));
	}
}
