package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage {

    private WebDriver navegador;
    public CarrinhoPage(WebDriver navegador){ this.navegador = navegador;}

    public SacolaPage finalizarCompraCarrinho(){
        //Função para finalizar a compra do carrinho
        navegador.findElement(By.linkText("FINALIZAR COMPRA")).click();
        return new SacolaPage(navegador);
 }

}
