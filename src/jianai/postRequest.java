package jianai;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import net.sf.json.JSONObject;

public class postRequest {
	//一级分类
	public void postFirst(String urlF,String name1){
		BufferedReader in = null;
		String result = "";
		try {
			URL urlF1 = new URL(urlF);
			URLConnection conn = urlF1.openConnection();
			
			conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Content-Type","application/json;charset=UTF-8");//字符
            conn.setUseCaches(false);
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            
            DataOutputStream out1 = new DataOutputStream(
                    conn.getOutputStream());
            JSONObject obj = new JSONObject();
            obj.element("name", name1);
            out1.write(obj.toString().getBytes("UTF-8"));//设置字符
            out1.flush();
            out1.close();
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(),"utf-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            System.out.println("添加一级分类"+name1+"响应");
            System.out.println(result.toString());
		} catch (Exception e) {
			System.out.println("添加一级分类异常");
			e.printStackTrace();
		}
		finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
		
	}
	//二级分类
	public void postSecond(String urlS,String name2,String urlImg){
		BufferedReader in = null;
		String result = "";
		try {
			URL urlS1 = new URL(urlS);
			URLConnection conn = urlS1.openConnection();
			
			conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Content-Type","application/json;charset=UTF-8");
            conn.setUseCaches(false);
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            
            DataOutputStream out2 = new DataOutputStream(
                    conn.getOutputStream());
            JSONObject obj = new JSONObject();
            obj.element("name", name2);
            obj.element("urlImg", urlImg);
            out2.write(obj.toString().getBytes("UTF-8"));
            out2.flush();
            out2.close();
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(),"utf-8"));
            
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            System.out.println("添加二级分类"+name2+"响应");
            System.out.println(result.toString());
		} catch (Exception e) {
			System.out.println("添加二级分类异常");
			e.printStackTrace();
		}
		finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
	}
	//物品上架
	public void postGoods(String urlG,String shopName,String addressName,int getIntegral,int isRent,int isBuy,int money,String shopDescription,int integralNum,int deposit,String shopImages,int shopClassId){
		BufferedReader in = null;
		String result = "";
		try {
			URL urlS1 = new URL(urlG);
			URLConnection conn = urlS1.openConnection();
			
			conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Content-Type","application/json;charset=UTF-8");
            conn.setUseCaches(false);
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            
            DataOutputStream out2 = new DataOutputStream(
                    conn.getOutputStream());
            JSONObject obj = new JSONObject();
            obj.element("shopName", shopName);
            obj.element("addressName", addressName);
            obj.element("getIntegral", getIntegral);
            obj.element("isRent", isRent);
            obj.element("isBuy", isBuy);
            obj.element("money", money);
            obj.element("shopDescription", shopDescription);
            obj.element("integralNum", integralNum);
            obj.element("deposit", deposit);
            obj.element("shopImages", shopImages);
            obj.element("shopClassId", shopClassId);
            out2.write(obj.toString().getBytes("UTF-8"));
            out2.flush();
            out2.close();
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(),"utf-8"));
            
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            System.out.println("添加商品"+shopName+"响应");
            System.out.println(result.toString());
		} catch (Exception e) {
			System.out.println("添加商品");
			e.printStackTrace();
		}
		finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
	}

}
