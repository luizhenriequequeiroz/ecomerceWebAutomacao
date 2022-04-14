package modulos.produtos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import paginas.PrincipalPage;
import java.time.Duration;

@DisplayName("Testes web do modulo Produto")
public class ProdutosTest {

    private WebDriver navegador;

    @BeforeEach
    public void beforeEach(){

        //Abrir o navegador
        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
        navegador = new ChromeDriver();

        //Atribuir tempo de espera
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Maximizar a tela
        navegador.manage().window().maximize();

        //Acessar o site
        navegador.get("https://www.dipollini.com.br/");

    }

    @Test
    @DisplayName("Realizar compra de Produto")
    public void testeDeCompra(){

        new PrincipalPage(navegador)
                .aceitarCokies()
                .selecionarCategoriaMenu()
                .selecionarProduto()
                .selecionarcaracteisticasDoProduto()
                .enviarProdutoParaCarrinho()
                .finalizarCompraCarrinho()
                .finalizarCompraSacola()
                .preencherEmail("luiz-henrique-queiroz@hotmail.com")
                .enviarEmail()
                .informarNomeUsuario("Luiz")
                .informarSobrenomeUsuario("Henrique")
                .informarCPFUsuario("09814805432")
                .informarTelefoneUsuario("81994796220")
                .irParaEntrega()
                .informarCEP("55004270")
                .informarNumero("256")
                .informarComplemento("casa")
                .irParaPagamento();
   }
    @AfterEach
    public void afterEach(){
        // Fechar o navegador
        navegador.quit();
    }

}
