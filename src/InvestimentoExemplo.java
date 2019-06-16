
public class InvestimentoExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InvestimentoFactory investimentoFactory = new InvestimentoFactory();

		//Instancia de TesouroDireto usando Factory
		Investimento tesouro = investimentoFactory.getInvestimento("TesouroDireto");
		
		tesouro.investir(150);
		//Previsão de resgate do montante investido em TesouroDireto
		tesouro.previous(5);

		//Instancia de CDB usando Factory
		Investimento cdb = investimentoFactory.getInvestimento("CDB");
		
		cdb.investir(1000);
		//Previsão de resgate do montante investido em CDB
		cdb.previous(20);
		
		
		
		//Instancia de poupança usando Factory
		Investimento poupanca = investimentoFactory.getInvestimento("Poupanca");
		
		poupanca.investir(25000);
		//Previsão de resgate do montante investido em Poupanca
		poupanca.previous(20);
	}

}
