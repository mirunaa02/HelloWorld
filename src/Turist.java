
import java.util.List;

public class Turist {

	public static void main(String[] args) throws CloneNotSupportedException{
		Hotel PachetDemi_Pensiune = new Hotel();
		PachetDemi_Pensiune.ContinutPachet();
		
		Hotel PachetALL_Inclusive = (Hotel)PachetDemi_Pensiune.clone();
		List<String>PachetALL_InclusiveContinut = PachetALL_Inclusive.Servicii();
		PachetALL_InclusiveContinut.remove("Mic Dejun");
		PachetALL_InclusiveContinut.add("Bufet Suedez");
		PachetALL_InclusiveContinut.add("Acces Bar");
		
		Hotel PachetPremium = (Hotel)PachetALL_Inclusive.clone();
		List<String>PachetPremiumContinut = PachetPremium.Servicii();
		PachetPremiumContinut.add("Ghid Personal");
		PachetPremiumContinut.add("Acces Piscina");
		
		Hotel PachetDELUX = (Hotel)PachetPremium.clone();
		List<String>PachetDELUXContinut = PachetDELUX.Servicii();
		PachetDELUXContinut.add("Sala de Fitness");
		PachetDELUXContinut.add("Spa");
		PachetDELUXContinut.add("Sauna");
		
		Hotel PachetEconomic = (Hotel)PachetDemi_Pensiune.clone();
		List<String>PachetEconomicContinut = PachetEconomic.Servicii();
		PachetEconomicContinut.remove("Mic Dejun");
		PachetEconomicContinut.remove("Loc Parcare");
		
		System.out.println("Pachet DemiPensiune :"+PachetDemi_Pensiune.Servicii());
		System.out.println("Pachet Economic :"+PachetEconomic.Servicii());
		System.out.println("Pachet ALL-Inclusive :"+PachetALL_Inclusive.Servicii());
		System.out.println("Pachet Premium :"+PachetPremium.Servicii());
		System.out.println("Pachet DELUX :"+PachetDELUX.Servicii());
		
		
		System.out.println("-----------------");
		System.out.println("--- Modificare (Mihaela) !! ---");
		
	}

}
