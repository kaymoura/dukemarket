package local.kcm.dukemarket.app;

import local.kcm.dukemarket.bean.Produto;
import local.kcm.dukemarket.dao.ProdutoDAO;

/**
 *
 * @author devsys-b
 */
public class DukeMarketApp {
    public static void main(String[] args) {
        Produto pAux;
        ProdutoDAO pDAO = new ProdutoDAO();
        
        /*// Teste de inclusão de produto 
        pAux = new Produto();
        pAux.setCodBarras("11111111");
        pAux.setDescricao("Mouse Logitec Bluetooth");
        pAux.setQtd(50);
        pAux.setValorCompra(80.00);
        pAux.setValorVenda(167.00);
        
        pDAO.create(pAux);
        
        pAux = new Produto();
        pAux.setCodBarras("22222222");
        pAux.setDescricao("Teclado USB Gamer");
        pAux.setQtd(80);
        pAux.setValorCompra(104.00);
        pAux.setValorVenda(220.00);
        
        pDAO.create(pAux);
        
        pAux = new Produto(); // produto ja foi deletado
        pAux.setCodBarras("33333333");
        pAux.setDescricao("Microcomputador Dell");
        pAux.setQtd(110);
        pAux.setValorCompra(2400.00);
        pAux.setValorVenda(3200.00);
        
        pDAO.create(pAux);
        
        // Lista geral
        pDAO.getResults().forEach(p -> {
            System.out.println(p.toString());
        });
        
        // Teste de exclusão de produto
        pDAO.delete(3); // deletado
        
        // Lists geral
        pDAO.getResults().forEach(p -> {
            System.out.println(p.toString());
        });*/
        
        // Teste de alteração de produto.
        pAux = pDAO.getResultById(1);
        pAux .setQtd(100);
        pDAO.update(pAux);
        
        // Lists geral
        pDAO.getResults().forEach(p -> {
            System.out.println(p.toString());
        });
    }
}
