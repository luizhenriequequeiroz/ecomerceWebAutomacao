package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoriaPage {

    private WebDriver navegador;
    public CategoriaPage(WebDriver navegador){ this.navegador = navegador;}

    public ProdutoPage selecionarProduto(){
        //Função criada para selecionar algum produto listado do menu
        navegador.findElement(By.linkText("Sapato social confort Maggiore Masculino MARF 250 COURO FLOTER")).click();
        return new ProdutoPage(navegador);
    }
}
