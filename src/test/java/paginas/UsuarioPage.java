package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsuarioPage {

    private WebDriver navegador;
    public UsuarioPage(org.openqa.selenium.WebDriver navegador){ this.navegador = navegador;}

    public UsuarioPage informarNomeUsuario(String nome){
        //Função para informar o Nome do usuário
        navegador.findElement(By.id("client-first-name")).sendKeys(nome);
        return this;
    }

    public UsuarioPage informarSobrenomeUsuario(String sobrenome){
        //Função para informar o Sobrenome do usuário
        navegador.findElement(By.id("client-last-name")).sendKeys(sobrenome);
        return this;
    }

    public UsuarioPage informarCPFUsuario(String cpf){
        //Função para informar o CPF do usuário
        navegador.findElement(By.id("client-document")).sendKeys(cpf);
        return this;
    }

    public UsuarioPage informarTelefoneUsuario(String telefone){
        //Função para informar o Telefone do usuário
        navegador.findElement(By.id("client-phone")).sendKeys(telefone);
        return this;
    }

    public EntregaPage irParaEntrega(){
        //Função para ir para o campo de preenchimento dos dados da Entrega
        navegador.findElement(By.id("go-to-shipping")).click();
        return new EntregaPage(navegador);
    }
}
