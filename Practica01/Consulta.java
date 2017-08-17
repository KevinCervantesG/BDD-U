import java.io.FileNotFoundException;
import java.io.IOException;
import com.csvreader.CsvReader;


public class Consulta {

	public static int prop200m() {

        int i = 0;
		try {


		CsvReader mi_csv = new CsvReader("/home/kevin/Escritorio/FDBDD/Practica01/P1.csv"); 
        mi_csv.readHeaders(); 

		

		 while (mi_csv.readRecord()) {
		 	int m2 = Integer.parseInt(mi_csv.get(4));
		 	float vProp = Float.parseFloat(mi_csv.get(5));

		 	if(m2<200 && (vProp>=50000 && vProp<=500000)) {

		 		i++;
		 	}
		 }//fin while

		} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

       return i; 
	}//fin prop200m()






	public static void inmueblesVarios() {

		try {


		CsvReader mi_csv = new CsvReader("/home/kevin/Escritorio/FDBDD/Practica01/P1.csv"); 
        mi_csv.readHeaders();
        String[] nombresCsv = new String[102];
        String[] nombres = new String[102];
        int k=0;

         while (mi_csv.readRecord()) {
         	String nombre = mi_csv.get(0);
         	nombresCsv[k] = nombre;
         	k++;
         }//Fin while


         for (int i=0; i<102; i++) {
         	String nombreAux = nombresCsv[i];

         	for (int j=i+1; j<102; j++) {
         		if (nombreAux == nombresCsv[j]) {
         			nombres[i] = nombreAux;
         		}//Fin if
         	}
         }//Fin for



         StringBuffer cadenaNombre = new StringBuffer();
         int j=0;
         while(nombres[j] != null) {
         	cadenaNombre =cadenaNombre.append(nombres[j]);
         	j++;
         }

         int x=0;
         while(nombres[x] != null) {
         	System.out.println(nombres[x] + " ");
         	x++;
         }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}//Fin inmueblesVarios()









	public static void propBaratas() {

		try {


		CsvReader mi_csv = new CsvReader("/home/kevin/Escritorio/FDBDD/Practica01/P1.csv"); 
        mi_csv.readHeaders(); // Leemos las Cabeceras, las cuales nos dan informacion de cada campo

		Cliente[] clientes = new Cliente[102];
		float[] propsBaratas = new float[102];

		
		 while (mi_csv.readRecord()) {
		 	float vProp = Float.parseFloat(mi_csv.get(5));

		 	for(int i=0; i<102; i++) {
 				propsBaratas[i]=vProp;
		 	}

		 }//Fin while


        //Ordenamos para buscar las 10 propiedades mas baratas
		float aux;

    	for (int i = 0; i < 102; i++) {
        	for (int x = i + 1; x < 102; x++) {
        	    if (propsBaratas[x] < propsBaratas[i]) {
                	aux = propsBaratas[i];
                	propsBaratas[i] = propsBaratas[x];
                	propsBaratas[x] = aux;
            	}
        	}
    	}//fin for

        
        //Guardamos las 10 propiedades mas baratas
    	float[] propsMasBaratas = new float[10];

    	for (int i=0; i<10; i++ ) {
    		propsMasBaratas[i] = propsBaratas[i];
    	}

        
        //Las imprimimos
        for (int i=0; i<10; i++) {
        	System.out.println(propsMasBaratas[i] +", ");
        }
        


		} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}//Fin propBaratas()





	public static void propCaras() {

		try {


		CsvReader mi_csv = new CsvReader("/home/kevin/Escritorio/FDBDD/Practica01/P1.csv"); 
        mi_csv.readHeaders(); // Leemos las Cabeceras, las cuales nos dan informacion de cada campo

		Cliente[] clientes = new Cliente[102];
		float[] propsCaras = new float[102];

		
		 while (mi_csv.readRecord()) {
		 	float vProp = Float.parseFloat(mi_csv.get(5));

		 	for(int i=0; i<102; i++) {
 				propsCaras[i]=vProp;
		 	}

		 }//Fin while


        //Ordenamos para buscar las 5 propiedades mas caras
		float aux;

    	for (int i = 0; i < 102; i++) {
        	for (int x = i + 1; x < 102; x++) {
        	    if (propsCaras[x] < propsCaras[i]) {
                	aux = propsCaras[i];
                	propsCaras[i] = propsCaras[x];
                	propsCaras[x] = aux;
            	}
        	}
    	}//fin for

        
        //Guardamos las 5 propiedades mas caras
    	float[] propsMasCaras = new float[5];

    	for (int i=0; i<5; i++ ) {
    		propsMasCaras[i] = propsCaras[i];
    	}


        //Las imprimimos
        for (int i=0; i<5; i++) {
        	System.out.println(propsMasCaras[i] +", ");
        }


		} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}//Fin propCaras





	public static void propGanancia() {

		try {


		CsvReader mi_csv = new CsvReader("/home/kevin/Escritorio/FDBDD/Practica01/P1.csv"); 
        mi_csv.readHeaders(); // Leemos las Cabeceras, las cuales nos dan informacion de cada campo

		Cliente[] clientes = new Cliente[102];
		float[] propsGanancia = new float[102];

		
		 while (mi_csv.readRecord()) {
		 	float vProp = Float.parseFloat(mi_csv.get(5));
		 	float vVenta = Float.parseFloat(mi_csv.get(6));

		 	for(int i=0; i<102; i++) {
 				propsGanancia[i]=vVenta-vProp;
		 	}

		 }//Fin while




		 //Ordenamos para buscar las 5 propiedades con mayor ganancia
		float aux;

    	for (int i = 0; i < 102; i++) {
        	for (int x = i + 1; x < 102; x++) {
        	    if (propsGanancia[x] < propsGanancia[i]) {
                	aux = propsGanancia[i];
                	propsGanancia[i] = propsGanancia[x];
                	propsGanancia[x] = aux;
            	}
        	}
    	}//fin for



    	//Guardamos las 5 propiedades con mayor ganancia
    	float[] propsMayorGanancia = new float[5];

    	for (int i=0; i<5; i++ ) {
    		propsMayorGanancia[i] = propsGanancia[i];
    	}



        float[] vVentaGanancia = new float[5];
    	//Buscamos la informacion de las propiedades y la guardamos
    	while (mi_csv.readRecord()) {
			float vProp = Float.parseFloat(mi_csv.get(5));
			float vVenta = Float.parseFloat(mi_csv.get(6));
			

			for (int i=0; i<5; i++) {
				if (propsMayorGanancia[i] == vVenta-vProp) {
					vVentaGanancia[i] = vProp;
				}
			}//Fin for
        }//Fin while


        //Las imprimimos
        for (int i=0; i<5; i++) {
        	System.out.println(vVentaGanancia[i] +", ");
        }


		 } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}//Fin propGanancia()





	public static void main(String[] args) {

		System.out.println("Hay " +prop200m() +" propiedades de mas de 200m² y valen"+
							" entre 50000 y 500000");

		inmueblesVarios();
		propBaratas();
		propCaras();
		propGanancia();

		
	}









}