package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    private Map<Character, Caracter> map ;
    
    private static FactoriaCaracter factoriacaracter = new FactoriaCaracter();
    
    private FactoriaCaracter(){
    	map = new HashMap<Character, Caracter>();
    }

    public Caracter get(char key) {
        if (map.containsKey(key)) {
            return map.get(key);
        } else {
            Caracter caracter = new Caracter(key);
            map.put(key, caracter);
            return caracter;
        }
    }

	public static FactoriaCaracter getFactoria() {
		return factoriacaracter;
	}

}
