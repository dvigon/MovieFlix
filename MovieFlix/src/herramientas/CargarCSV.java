package herramientas;

/*
 * No estoy seguro de que este método funcione, aún no lo he probado.
 */

public class CargarCSV {
	
	private String ArchivoCSV = "D:\\ISO-Codes.csv";									// Ruta del archivo CSV
	
	public void LeerCSV() {
		
		CSVReader csvReader = new CSVReader(new FileReader(ArchivoCSV));				// Crea una instancia para el lector CSV
		String[] fila = null;
		
		while( (fila = csvReader.readNext()) != null )
		    System.out.println( fila[0] + " | " + fila[1] + " |  " + fila[2] );			// Modificar

		csvReader.close();
		
	}
	
	
}
