package servicios;

import datos.Catalogo;
import datos.CatalogoImp;
import datos.InterfazCatalogo;

public class ServiciosCatalogo implements ImplementacionCatalogo{

	// Llamada a los metodos del paquete de datos
	private InterfazCatalogo datos = new CatalogoImp();

	@Override
	public void altaCatalogo(Catalogo cat) {
		datos.altaCatalogo(cat);
	}

	@Override
	public void modificacionCatalogo(int id) {
		datos.modificacionCatalogo(id);
	}

	@Override
	public void bajaCatalogo(int id) {
		datos.bajaCatalogo(id);
	}

	@Override
	public Catalogo encontrarCatalogo(int id) {
		return datos.encontrarCatalogo(id);
	}

	@Override
	public Catalogo[] listaCatalogo() {
		return datos.listaCatalogo();
	}

	@Override
	public void darAltaCatalogo() {
		datos.darAltaCatalogo();
	}

	@Override
	public void ListadoCompleto() {
		datos.listaCatalogo();
	}

}