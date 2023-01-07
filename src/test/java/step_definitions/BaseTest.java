package step_definitions;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected ChromeDriver driver= Hooks.getDriver();

    /*Instancio las paginas con sus metodos
       despues en el test extiendo de baseTest
      donde me voy ahorrar mucho codigo usando los metodos de las clases.

      ej:
         protected HomePage homePage =new HomePage(driver);
         protected ComicsPage comicsPage=new ComicsPage(driver);
     */






    public BaseTest() throws Exception {
    }

}
