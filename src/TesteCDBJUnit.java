import org.junit.Test;

public class TesteCDBJUnit {


	@Test
	public void testeCDB() {
		InvestimentoFactory investimentoFactory = new InvestimentoFactory();

		//Instancia de TesouroDireto usando Factory
		Investimento cdb = investimentoFactory.getInvestimento("CDB");
		
		cdb.investir(5000);
		cdb.investir(200);
		cdb.investir(350);
		
		//Previs�o de resgate do montante investido em TesouroDireto
		cdb.previous(1);
		
		//Realizando saque do valor j� investido
		cdb.sacar(150);
	}
}
