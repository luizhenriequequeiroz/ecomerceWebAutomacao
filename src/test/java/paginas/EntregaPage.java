package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntregaPage {

    private WebDriver navegador;
    public EntregaPage(org.openqa.selenium.WebDriver navegador){ this.navegador = navegador;}

    public EntregaPage informarCEP(String cep){
        //Função para informar o CEP da entrega
        navegador.findElement(By.id("ship-postalCode")).sendKeys(cep);
        return this;
    }

    public EntregaPage informarNumero(String numero){
        //Função para informar o número do endereço
        navegador.findElement(By.id("ship-number")).sendKeys(numero);
        return this;
    }

    public EntregaPage informarComplemento(String complemento){
        //Função para informar o complemento do endereço
        navegador.findElement(By.id("ship-complement")).sendKeys(complemento);
        return this;
    }

    public void irParaPagamento(){
        //Função para ir para o campo de forma de pagamento
        navegador.findElement(By.id("btn-go-to-payment")).click();
    }
}
