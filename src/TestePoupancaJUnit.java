import org.junit.Test;

public class TestePoupancaJUnit {
	@Test
	public void testeTD() {
		InvestimentoFactory investimentoFactory = new InvestimentoFactory();

		//Instancia de TesouroDireto usando Factory
		Investimento poupanca = investimentoFactory.getInvestimento("Poupanca");
		
		poupanca.investir(100000);
		poupanca.investir(150);
		poupanca.investir(300);
		
		//Previsão de resgate do montante investido em TesouroDireto
		poupanca.previous(25);
		
		//Realizando saque do valor já investido
		poupanca.sacar(1000000);
	}
}
