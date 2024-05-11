import DAO.ClientesDAO;
import clientes.Clientes;

public class App {
    public static void main(String[] args) throws Exception {

        Clientes u = new Clientes();
        u.setNome("Reynaldo");
        u.setSobreNome("Hora");
        u.setWhatsapp("(85)996243197");
        u.setEndereço("Villa Presidente Kennedy");
        u.setCpf("063-112-157-69");

        new ClientesDAO().cadastrarClientes(u);
    }
}
