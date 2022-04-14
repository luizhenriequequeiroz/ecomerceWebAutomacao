package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SacolaPage {

    private WebDriver navegador;
    public SacolaPage(WebDriver navegador){ this.navegador = navegador;}

    public EmailPage finalizarCompraSacola(){
        //Função para sair da tela onde mostra os dados definitivos da
        //compra e enviar para tela de inserção dos Dados do Comprador
        navegador.findElement(By.id("cart-to-orderform")).click();
        return new EmailPage(navegador);
    }

}
