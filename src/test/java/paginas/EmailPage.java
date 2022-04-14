package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailPage {

    private WebDriver navegador;
    public EmailPage(WebDriver navegador){ this.navegador = navegador;}

    public EmailPage preencherEmail(String email){
        //Função para preenchimento do e-mail do comprador
        navegador.findElement(By.id("client-pre-email")).sendKeys(email);
        return this;
    }

    public UsuarioPage enviarEmail(){
        //Função para enviar o e-mail digitado pelo usuário
        navegador.findElement(By.id("btn-client-pre-email")).click();
        return new UsuarioPage(navegador);
    }

}
