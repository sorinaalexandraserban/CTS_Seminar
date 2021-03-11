package ro.ase.csie.cts.laborator3.faza1;

public class Produs {
	
	public static final int VECHIME_CLIENT_MAXIMA = 10;
	public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;
	
	public float getPretFinal(int tipProdus, float pretInitial, int vechimeClientInAni)
	  {
	    float pretFinal = 0;
	    float discountFidelitate = (vechimeClientInAni > 10) ? (float)15/100 : (float)vechimeClientInAni/100; 
	    if (tipProdus == 1)
	    {
	      pretFinal = pretInitial;
	    }
	    else if (tipProdus == 2)
	    {
	      pretFinal = (pretInitial - (0.1f * pretInitial)) - discountFidelitate * (pretInitial - (0.1f * pretInitial));
	    }
	    else if (tipProdus == 3)
	    {
	      pretFinal = (pretInitial - (0.25f * pretInitial)) - discountFidelitate * (pretInitial - (0.25f * pretInitial));
	    }
	    else if (tipProdus == 4)
	    {
	      pretFinal = (pretInitial - (0.35f * pretInitial)) - discountFidelitate * (pretInitial - (0.35f * pretInitial));
	    }
	    return pretFinal;
	  }
}
