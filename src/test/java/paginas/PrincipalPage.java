package paginas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrincipalPage {

    private WebDriver navegador;

    public PrincipalPage(WebDriver navegador){ this.navegador = navegador;}

    public PrincipalPage aceitarCokies(){
        // Aceitar Cookies
        navegador.findElement(By.id("CybotCookiebotDialogBodyButtonAccept")).click();
        return this;
    }


    public CategoriaPage selecionarCategoriaMenu(){
        //Selecionar categoria do Menu
        navegador.findElement(By.id("maggiore")).click();
        return new CategoriaPage(navegador);
    }

}
