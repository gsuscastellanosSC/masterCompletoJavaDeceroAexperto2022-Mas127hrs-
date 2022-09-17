import com.sc.appfacturas.model.Cliente;
import com.sc.appfacturas.model.Factura;
import com.sc.appfacturas.model.ItemFactura;
import com.sc.appfacturas.model.Producto;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ItemFactura[] itemFacturas = new ItemFactura[2];

        itemFacturas[0] = new ItemFactura(new Producto(123, "Carro", 127.0f), 2);

        itemFacturas[1] = new ItemFactura(new Producto(123, "Volswagen", 142.0f), 2);

        Factura factura = new Factura(new Cliente("Jesús", "1019042956"), itemFacturas, "qwerty", new Date());

        factura.verDetalle();
    }
}