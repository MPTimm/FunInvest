
public class InvestimentoFactory {

	//uso getInvestimento para obter o tipo de investimento
	public Investimento getInvestimento(String investType) {
		
		if(investType == null) {
			return null;
		}
		
		//Retorna um TesouroDireto
		if(investType.equalsIgnoreCase("TesouroDireto")) {
			return new TesouroDireto();
		}
		
		//Retorna um CDB
		else if(investType.equalsIgnoreCase("CDB")) {
			return new CDB();
		}
		
		//Retorna uma Poupanca
		else if(investType.equalsIgnoreCase("Poupanca")) {
			return new Poupanca();
		}

		return null;
	}
}
