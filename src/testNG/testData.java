package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class testData {
  @Test(dataProvider = "dp")
  public void f(String uerName, String passWord) {
	  System.out.println(uerName+":"+passWord);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "小明", "123456" },
      new Object[] { "小花", "123456" },
      new Object[] { "小东", "123456" },
    };
  }
}
