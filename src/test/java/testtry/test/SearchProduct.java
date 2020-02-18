package testtry.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import testtry.drivermanage.TestBase;
import testtry.pages.HeaderPage;

import java.util.List;

public class SearchProduct extends TestBase {

  @Test
  public void searchProductInInput() throws InterruptedException {

      HeaderPage searchPage = new HeaderPage();
      searchPage.inputProduct("czekolada");
      List<String> productList = searchPage.getProducts();
      Assert.assertEquals("CZEKOLADA BALANCE BEZ LAKT BEZGL 85G",productList.get(0));
      Assert.assertEquals("FIGURKA ZAJAC Z MLECZNEJ CZEKOLADY 60G WN IDC POLONIA",productList.get(1));
      List<String> pricesList = searchPage.getPrices();
      Assert.assertEquals("4,33 zł",pricesList.get(0));
      Assert.assertEquals("0,99 zł",pricesList.get(1));
  }
}



