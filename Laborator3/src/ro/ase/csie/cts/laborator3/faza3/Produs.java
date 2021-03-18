package ro.ase.csie.cts.laborator3.faza3;

import ro.ase.csie.cts.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.laborator3.exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.laborator3.faza3.servicii.InterfataMarketing;
import ro.ase.csie.cts.laborator3.faza3.servicii.InterfataValidare;
import ro.ase.csie.cts.laborator3.faza3.servicii.ServiciuValidari;
import ro.ase.csie.cts.laborator3.faza3.servicii.StrategieMarketing2021;

public class Produs {

	InterfataMarketing serviciuMarketing = null;
	InterfataValidare serviciuValidare = null;

	public Produs(InterfataMarketing mk, InterfataValidare validare) {
		if (validare == null) {
			throw new NullPointerException();
		}
		this.setStrategieMarketing(mk);

		this.serviciuValidare = validare;
	}

	public Produs() {
		for(Object serviciu : TestProdus.servicii) {
			if(serviciu instanceof InterfataMarketing) {
				this.serviciuMarketing = (InterfataMarketing)serviciu;
			}
		}
		if(this.serviciuMarketing == null) {
			throw new NullPointerException();
		}
	}

	public void setStrategieMarketing(InterfataMarketing strategie) {
		if (strategie == null) {
			throw new NullPointerException();
		}
		this.serviciuMarketing = strategie;
	}

	public static float getPretCuDiscount(float pretInitial, float discount) {
		return pretInitial - (discount * pretInitial);
	}

	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni)
			throws ExceptieVechimeClient, ExceptiePretInvalid {
		serviciuValidare.validarePret(pretInitial);
		serviciuValidare.validareVechimeClient(vechimeClientInAni);

		float discountFidelitate = (tipProdus == TipProdus.NOU) ? 0
				: serviciuMarketing.getDiscountFidelitate(vechimeClientInAni);
		float discount = tipProdus.getDiscount();
		float valoareDiscountTipProdus = getPretCuDiscount(pretInitial, discount);
		float pretFinal = valoareDiscountTipProdus * (1 - discountFidelitate);

		return pretFinal;
	}
}
