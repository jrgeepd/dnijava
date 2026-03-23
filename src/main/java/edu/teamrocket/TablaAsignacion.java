package edu.teamrocket;

class TablaAsignacion {
    private final char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M', 
					 		'Y', 'F', 'P', 'D', 'X', 'B', 
							'N', 'J', 'Z', 'S', 'Q', 'V', 
							'H', 'L', 'C', 'K', 'E'};

    TablaAsignacion() {};

    char calcularLetra(String DNI){
        
        int dni = Integer.parseInt(DNI);
        int posicion = dni % getModulo();
        return getLetra(posicion);
    }


    char getLetra(int posicion) throws ArrayIndexOutOfBoundsException {

        try {
            
        } catch (Exception ArrayIndexOutOfBoundsException) {
                
        }

    }
}