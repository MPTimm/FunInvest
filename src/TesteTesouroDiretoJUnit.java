import org.junit.Test;

public class TesteTesouroDiretoJUnit {
	@Test
	public void testeTD() {
		InvestimentoFactory investimentoFactory = new InvestimentoFactory();

		//Instancia de TesouroDireto usando Factory
		Investimento tesouro = investimentoFactory.getInvestimento("TesouroDireto");
		
		tesouro.investir(150);
		tesouro.investir(340);
		tesouro.investir(1500);
		
		//Previsão de resgate do montante investido em TesouroDireto
		tesouro.previous(5);
		
		//Realizando saque do valor já investido
		tesouro.sacar(1000000);
	}
}
