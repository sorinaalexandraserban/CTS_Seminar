package ro.ase.csie.cts.dp.adapter;

import java.util.ArrayList;

import ro.ase.csie.cts.dp.factory.method.CaracterDisney;
import ro.ase.csie.cts.dp.factory.method.CaracterJoc;

public class TestAdapter {
public static void main(String[] args) {
	
	//1.colectie caractere existente
	ArrayList<CaracterJoc> caractere=new ArrayList<>();
	caractere.add(new CaracterDisney("Donald"));
	
	//2.colectie caractere EA
    ArrayList<InterfataCaracterEA> caractereEA=new ArrayList<>();
    caractereEA.add(new CaracterGenericEA());

    
    //Folosim un adapter
    InterfataCaracterEA caracterEA=new CaracterGenericEA();
    AdapterEA2CaracterJoc adapter=new AdapterEA2CaracterJoc(caracterEA);
    
    caractere.add(adapter);
    
    
}
}
