package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testParameter {
  @Parameters({"sUsername1","sPassword1"})
  @Test
  public void f1(String sUsername,String sPassword) {
	  System.out.println(sUsername+":"+sPassword);
  }
  @Parameters({"sUsername2","sPassword2"})
  @Test
  public void f2(String sUsername,String sPassword) {
	  System.out.println(sUsername+":"+sPassword);
  }
}

