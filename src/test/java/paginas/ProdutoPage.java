package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoPage {

    private WebDriver navegador;
    public ProdutoPage(WebDriver navegador){ this.navegador = navegador;}

    public ProdutoPage selecionarcaracteisticasDoProduto(){
        //Escolher a cor do Produto
        navegador.findElement(By.xpath("//label[text()='Pinhao']")).click();
        //Escolher tamanho do Produto
        navegador.findElement(By.xpath("//label[text()='40']")).click();
        return this;
    }

    public CarrinhoPage enviarProdutoParaCarrinho(){
        //Função para enviar o produto para o carrinho
        navegador.findElement(By.linkText("COMPRAR")).click();
        return new CarrinhoPage(navegador);
    }


}

