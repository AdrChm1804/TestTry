package testtry.test;

import org.testng.annotations.Test;
import testtry.drivermanage.TestBase;
import testtry.pages.HeaderPage;

public class SearchProduct extends TestBase {

  @Test
  public void searchProductInInput(){

     HeaderPage searchPage = new HeaderPage();
     searchPage.inputProduct("ciastka");
  }

}
