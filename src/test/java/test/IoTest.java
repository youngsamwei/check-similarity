package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class IoTest {
	//复制文本
	public static void main(String [] args) throws IOException{
//		for(int i=0;i<100;i++){
//			String path = "C:\\Users\\jaybill\\Desktop\\test\\利俊标+201430260"+new Random().nextInt(10)+""+
//					new Random().nextInt(9)+""+
//					new Random().nextInt(9)+".docx";
//			copy(path);
//		}
//		StringArr("G:\\nouse.txt");
//		getLength("G:\\arr.txt");
		String t = "http://192.168.241.130:8080/solr/#/collection1/analysis?analysis.fieldvalue=%E6%95%B0%E5%AD%97%E7%B3%BB%E7%BB%9F%EF%BC%88%E8%AF%BE%E7%A8%8B%EF%BC%89%E8%AE%BE%E8%AE%A1%E5%AE%9E%E9%AA%8C%E6%8A%A5%E5%91%8A%E7%94%B5%E5%AD%90%E4%BF%A1%E6%81%AF%E5%AD%A6%E9%99%A22016%E5%B9%B45%E6%9C%88%E7%94%B5%E5%AD%90%E4%BF%A1%E6%81%AF%E5%AD%A6%E9%99%A2%E7%A7%91%E6%95%99%E5%AD%A6%E5%AE%9E%E9%AA%8C%E5%AE%A4%E5%AD%A6%E7%94%9F%E5%AE%9E%E9%AA%8C%E6%93%8D%E4%BD%9C%E8%A7%84%E5%9F%B9%E5%85%BB%E5%AD%A6%E7%94%9F%E4%B8%A5%E5%AD%A6%E4%B9%A0%E4%BD%9C%E9%A3%8E%EF%BC%8C%E8%90%A5%E9%80%A0%E5%AE%9E%E9%AA%8C%E5%AE%9E%E8%B7%B5%E5%AD%A6%E4%B9%A0%E6%B0%9B%E5%9B%B4%EF%BC%8C%E7%A1%AE%E4%BF%9D%E5%AD%A6%E7%94%9F%E8%BA%AB%E4%BB%AA%E5%99%A8%E8%AE%BE%E5%A4%87%EF%BC%8C%E5%88%A9%E5%AE%9E%E9%AA%8C%E5%8A%A1%EF%BC%8C%E7%89%B9%E5%88%B6%E8%A7%84%E3%80%821%E3%80%81%E8%B5%A4%E8%84%9A%E7%A9%BF%E6%8B%96%E9%9E%8B%E5%AE%9E%E9%AA%8C%E5%AE%A4%EF%BC%8C%E9%A3%9F%E7%89%A9%E5%85%A5%E5%AE%9E%E9%AA%8C%E5%AE%A4%EF%BC%8C%E5%87%86%E4%B8%A2%E5%BC%83%E5%BA%9F%E7%BA%B8%E3%80%81%E5%BA%9F%E5%BC%83%E7%89%A9%EF%BC%8C%E5%AE%9E%E9%AA%8C%E5%AE%A4%E6%B8%85%E6%B4%81%E3%80%822%E3%80%81%E5%AE%9E%E9%AA%8C%E4%B8%AD%E8%A7%A6%E6%91%B8%E8%A3%B8%E9%9C%B2%E6%8E%A5%E7%BA%BF%E6%9F%B1%E3%80%81%E6%8E%A5%E7%BA%BF%E7%89%87%E3%80%81%E5%AF%BC%E7%BA%BF%EF%BC%8C%E8%A1%A8%E6%A3%92%E3%80%81%E9%95%8A%E5%AD%90%E3%80%81%E5%89%AA%E5%88%80%E5%B7%A5%E5%85%B7%E6%8F%92%E5%85%A5%E7%94%B5%E6%BA%90%E6%8F%92%E5%BA%A7%E3%80%82%E4%B8%A5%E7%A6%81%E7%94%B5%E6%8E%A5%E7%BA%BF%E3%80%81%E6%8B%86%E7%BA%BF%E6%94%B9%E6%8E%A5%E7%BA%BF%E8%B7%AF%E3%80%823%E3%80%81%E7%94%B5%E7%83%99%E9%93%81%E9%80%9A%E7%94%B5%E6%97%B6%EF%BC%8C%E5%BA%94%E5%A7%8B%E7%BB%88%E7%BD%AE%E7%83%99%E9%93%81%E6%9E%B6%EF%BC%8C%E4%B8%A5%E7%A6%81%E6%84%8F%E6%91%86%E6%A1%8C%EF%BC%9B%E7%95%99%E6%84%8F%E7%83%99%E9%93%81%E5%A4%B4%E9%81%BF%E5%BC%80%E5%AF%BC%E7%BA%BF%E9%99%84%E4%BB%AA%E5%99%A8%E8%AE%BE%E5%A4%87%E4%B9%A6%E7%B1%8D%E5%93%81%EF%BC%9B%E4%BD%93%E8%A7%A6%E7%A2%B0%E7%83%99%E9%93%81%E5%A4%B4%EF%BC%8C%E9%98%B2%E7%83%AB%E4%BC%A4%E6%BC%8F%E7%94%B5%E4%BA%8B%E3%80%82%E4%B8%AD%E9%80%94%E5%BC%80%E5%AE%9E%E9%AA%8C%E5%AE%A4%E5%AE%9E%E9%AA%8C%E5%AE%8C%E6%AF%95%EF%BC%8C%E6%97%B6%E6%96%AD%E7%94%B5%EF%BC%8C%E5%85%8D%E5%8F%91%E7%94%9F%E7%81%AB%E7%81%BE%E4%BA%8B%E3%80%824%E3%80%81%E5%AE%9E%E9%AA%8C%E6%8E%A5%E7%BA%BF%E5%AE%8C%E6%AF%95%EF%BC%8C%E4%BB%94%E7%BB%86%E5%A4%8D%E6%9F%A5%EF%BC%8C%E7%A1%AE%E8%AE%A4%E8%AF%AF%E6%8E%A5%E9%80%9A%E7%94%B5%E6%BA%90%E3%80%825%E3%80%81%E5%8A%A8%E6%AC%A1%E5%AE%9E%E9%AA%8C%E5%85%B3%E8%AE%BE%E5%A4%87%E3%80%81%E4%BB%AA%E5%99%A8%E3%80%81%E5%B7%A5%E5%85%B7%E5%8E%9F%E6%9D%90%E6%96%99%E3%80%826%E3%80%81%E5%AE%9E%E9%AA%8C%E7%BB%93%E6%9D%9F%EF%BC%8C%E5%AE%9E%E9%AA%8C%E8%A3%85%E7%BD%AE%E3%80%81%E4%BB%AA%E5%99%A8%E4%BB%AA%E8%A1%A8%E7%94%B5%E7%83%99%E9%93%81%E6%96%AD%E7%94%B5%EF%BC%8C%E5%AE%9E%E9%AA%8C%E5%85%B3%E4%BB%AA%E5%99%A8%E3%80%81%E5%B7%A5%E5%85%B7%E3%80%81%E5%AF%BC%E7%BA%BF%E7%94%B5%E7%BC%86%E6%95%B4%E7%90%86%EF%BC%8C%E6%94%BE%E5%9B%9E%E5%8E%9F%E5%A4%84%EF%BC%9B%E5%BA%A7%E6%A4%85%E6%8E%A8%E5%AE%9E%E9%AA%8C%E5%8F%B0%E5%9C%BA%E3%80%827%E3%80%81%E9%81%87%E4%BA%8B%E5%BA%94%E6%96%AD%E7%94%B5%EF%BC%8C%E6%97%B6%E5%AE%9E%E9%AA%8C%E6%8C%87%E5%AF%BC%E6%95%99%E5%B8%88%E6%8A%A5%E5%91%8A%E3%80%828%E3%80%81%E4%B8%A5%E5%AE%88%E7%BA%AA%E5%BE%8B%EF%BC%8C%E9%81%B5%E5%AE%88%E5%AE%9E%E9%AA%8C%E5%AE%A4%E8%A7%84%E7%AB%A0%E5%88%B6%E5%BA%A6%EF%BC%8C%E6%89%A7%E8%A1%8C%E6%93%8D%E4%BD%9C%E8%A7%84%E3%80%829%E3%80%81%E6%8F%90%E9%AB%98%E9%98%B2%E7%81%AB%E9%98%B2%E7%9B%97%E6%84%8F%E8%AF%86%EF%BC%8C%E5%81%9A%E9%98%B2%E7%81%AB%E9%98%B2%E7%9B%97%E5%B7%A5%E4%BD%9C%E3%80%82%E7%94%B5%E5%AD%90%E4%BF%A1%E6%81%AF%E5%AD%A6%E9%99%A2%E5%AE%9E%E9%AA%8C%E4%B8%AD%E5%BF%83%E3%80%87%E4%B8%80%E5%B9%B4%E6%9C%88%E9%98%85%E8%AF%BB%E8%BF%B0%E3%80%8A%E5%AD%A6%E7%94%9F%E5%AE%9E%E9%AA%8C%E6%93%8D%E4%BD%9C%E8%A7%84%E3%80%8B%EF%BC%8C%E7%9F%A5%E6%82%89%E8%A7%84%E6%9D%A1%E6%AC%BE%EF%BC%8C%E6%89%BF%E8%AF%BA%E6%89%A7%E8%A1%8C%E3%80%82%E6%89%BF%E8%AF%BA%EF%BC%9A%E5%AD%A6%E9%99%A2%EF%BC%9A%E4%B8%93%E4%B8%9A%2F%E7%8F%AD%E7%BA%A7%EF%BC%9A%E6%97%B6%E9%97%B4%EF%BC%9A%E7%9B%AE%E5%BD%95%E5%AE%9E%E9%AA%8C%E4%B8%80Quartus%E8%BD%AF%E4%BB%B6%EF%BC%9BVHDL%E7%A8%8B%E5%BA%8F%E7%BB%93%E6%9E%84%E7%86%9F%E6%82%891%E5%AE%9E%E9%AA%8C%E7%94%B5%E8%B7%AF%E6%A8%A1%E5%9D%97%E8%AE%BE%E8%AE%A1%EF%BC%88%E7%BB%84%E5%90%88%E3%80%81%E6%97%B6%E5%BA%8F%EF%BC%895%E5%AE%9E%E9%AA%8C%E5%9F%BA%E7%8A%B6%E6%80%81%E6%9C%BA%E4%BA%A4%E9%80%9A%E7%81%AF%E6%8E%A7%E5%88%B612%E5%AE%9E%E9%AA%8C%E9%94%AE%E6%8E%A7%E5%88%B6%E7%8A%B6%E6%80%81%E6%9C%BA%E8%AE%BE%E8%AE%A119IIIQuartus%E8%BD%AF%E4%BB%B6%EF%BC%9BVHDL%E7%A8%8B%E5%BA%8F%E7%BB%93%E6%9E%84%E7%86%9F%E6%82%89%E6%8A%A5%E5%91%8A%E5%AE%B9%EF%BC%9A%E5%AE%9E%E9%AA%8C%E6%B1%82%EF%BC%9A1.%E7%86%9F%E6%82%89Quartus%E8%BD%AF%E4%BB%B62.%E7%86%9F%E6%82%89VHDL%E7%A8%8B%E5%BA%8F%E7%BB%93%E6%9E%843.VHDL%E8%AE%BE%E8%AE%A1%E7%94%B5%E8%B7%AF%E4%BB%BF%E7%9C%9F%E3%80%81%E7%BB%BC%E5%90%88%E3%80%81%E6%B5%8B%E8%AF%95%E7%A8%8B%E5%AE%9E%E9%AA%8C%E5%AE%B9%EF%BC%9A%E6%96%B0%E6%95%99%E6%9D%90%E2%80%9CVHDL%E6%95%B0%E5%AD%97%E7%B3%BB%E7%BB%9F%E8%AE%BE%E8%AE%A1%E2%80%9D6%E7%AB%A0%E5%AE%9E%E4%BE%8B%EF%BC%88P119%E9%A1%B5%EF%BC%89%E6%93%8D%E4%BD%9C%EF%BC%8C%E5%BB%BA%E5%B7%A5%E7%A8%8B%E3%80%81%E8%AE%BE%E8%AE%A1%E8%BE%93%E5%85%A5%E3%80%81%E7%BC%96%E8%AF%91%E3%80%81%E6%97%B6%E5%BA%8F%E4%BB%BF%E7%9C%9F%E5%BC%80%E5%8F%91%E6%B5%81%E7%A8%8B%EF%BC%9B%E4%BB%BF%E7%9C%9F%E6%AD%A2%E3%80%82%E7%90%86%E8%A7%A3VHDL%E4%BB%A3%E7%A0%81%EF%BC%8C%E8%BD%AF%E4%BB%B6%E7%A1%AC%E4%BB%B6%EF%BC%8C%E5%BC%80%E5%8F%91%E6%B5%81%E7%A8%8B%E3%80%82%E5%AE%9E%E9%AA%8C%E8%AE%BE%E8%AE%A1%E5%8E%9F%E7%90%86%EF%BC%9B%E5%9B%BE1quartus%E5%BC%80%E5%8F%91%E6%B5%81%E7%A8%8B%2C%E5%AE%9E%E9%AA%8C%E7%A8%8B%E8%AE%B0%E5%BD%95%EF%BC%88%E6%B5%81%E7%A8%8B%E5%9B%BE%E5%AE%9E%E9%AA%8C%E9%80%BB%E8%BE%91%E6%80%9D%E8%B7%AF%E7%A8%8B%EF%BC%89%E4%BB%BF%E7%9C%9F%E6%AD%A2%E3%80%82%E7%90%86%E8%A7%A3VHDL%E4%BB%A3%E7%A0%81%EF%BC%8C%E8%BD%AF%E4%BB%B6%E7%A1%AC%E4%BB%B6%EF%BC%8C%E5%BC%80%E5%8F%91%E6%B5%81%E7%A8%8B%E3%80%82%E5%AE%9E%E9%AA%8C%E8%AE%BE%E8%AE%A1%E5%8E%9F%E7%90%86%EF%BC%9B%E5%9B%BE1quartus%E5%BC%80%E5%8F%91%E6%B5%81%E7%A8%8B%2C%E5%AE%9E%E9%AA%8C%E7%A8%8B%E8%AE%B0%E5%BD%95%EF%BC%88%E6%B5%81%E7%A8%8B%E5%9B%BE%E5%AE%9E%E9%AA%8C%E9%80%BB%E8%BE%91%E6%80%9D%E8%B7%AF%E7%A8%8B%EF%BC%89%E4%BB%BF%E7%9C%9F%E6%AD%A2%E3%80%82%E7%90%86%E8%A7%A3VHDL%E4%BB%A3%E7%A0%81%EF%BC%8C%E8%BD%AF%E4%BB%B6%E7%A1%AC%E4%BB%B6%EF%BC%8C%E5%BC%80%E5%8F%91%E6%B5%81%E7%A8%8B%E3%80%82%E5%AE%9E%E9%AA%8C%E8%AE%BE%E8%AE%A1%E5%8E%9F%E7%90%86%EF%BC%9B%E5%9B%BE1quartus%E5%BC%80%E5%8F%91%E6%B5%81%E7%A8%8B%2C%E5%AE%9E%E9%AA%8C%E7%A8%8B%E8%AE%B0%E5%BD%95%EF%BC%88%E6%B5%81%E7%A8%8B%E5%9B%BE%E5%AE%9E%E9%AA%8C%E9%80%BB%E8%BE%91%E6%80%9D%E8%B7%AF%E7%A8%8B%EF%BC%89%E4%BB%BF%E7%9C%9F%E6%AD%A2%E3%80%82%E7%90%86%E8%A7%A3VHDL%E4%BB%A3%E7%A0%81%EF%BC%8C%E8%BD%AF%E4%BB%B6%E7%A1%AC%E4%BB%B6%EF%BC%8C%E5%BC%80%E5%8F%91%E6%B5%81%E7%A8%8B%E3%80%82%E5%AE%9E%E9%AA%8C%E8%AE%BE%E8%AE%A1%E5%8E%9F%E7%90%86%EF%BC%9B%E5%9B%BE1quartus%E5%BC%80%E5%8F%91%E6%B5%81%E7%A8%8B%2C%E5%AE%9E%E9%AA%8C%E7%A8%8B%E8%AE%B0%E5%BD%95%EF%BC%88%E6%B5%81%E7%A8%8B%E5%9B%BE%E5%AE%9E%E9%AA%8C%E9%80%BB%E8%BE%91%E6%80%9D%E8%B7%AF%E7%A8%8B%EF%BC%89%E4%BB%BF%E7%9C%9F%E6%AD%A2%E3%80%82%E7%90%86%E8%A7%A3VHDL%E4%BB%A3%E7%A0%81%EF%BC%8C%E8%BD%AF%E4%BB%B6%E7%A1%AC%E4%BB%B6%EF%BC%8C%E5%BC%80%E5%8F%91%E6%B5%81%E7%A8%8B%E3%80%82%E5%AE%9E%E9%AA%8C%E8%AE%BE%E8%AE%A1%E5%8E%9F%E7%90%86%EF%BC%9B%E5%9B%BE1quartus%E5%BC%80%E5%8F%91%E6%B5%81%E7%A8%8B%2C%E5%AE%9E%E9%AA%8C%E7%A8%8B%E8%AE%B0%E5%BD%95%EF%BC%88%E6%B5%81%E7%A8%8B%E5%9B%BE%E5%AE%9E%E9%AA%8C%E9%80%BB%E8%BE%91%E6%80%9D%E8%B7%AF%E7%A8%8B%EF%BC%89%E4%BB%BF%E7%9C%9F%E6%AD%A2%E3%80%82%E7%90%86%E8%A7%A3VHDL%E4%BB%A3%E7%A0%81%EF%BC%8C%E8%BD%AF%E4%BB%B6%E7%AC%AC%E4%B8%89%E6%AC%A1%E5%9C%B0%E6%96%B9&analysis.fieldname=WEIBO_CONTENT&verbose_output=1";
		System.out.println(t.length());
	}
	
	public static void copy(String path) throws IOException{
		File f = new File(path);
		FileWriter out = new FileWriter(f);
		FileReader in = new FileReader("C:\\Users\\jaybill\\Desktop\\test\\利俊标+201430260258.docx");
		BufferedReader bf = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		String val =null;
		while(( val = bf.readLine())!=null){
			bw.write(new String(val));
		}
		System.out.println("复制完成！");
	}
	
	//将文本变成new String[]{"","","",.....};的形式
	public static void StringArr(String path) throws IOException{
		//读入
		FileReader r = new FileReader(path);
		BufferedReader br = new BufferedReader(r);
		String line = null;
		//写出
		FileWriter w = new FileWriter("G:\\arr.txt",true);
		BufferedWriter bw = new BufferedWriter(w);
		int i=0;
		while((line=br.readLine())!=null){
			bw.write("\""+line+"\""+",");
			if(i%10==0){
				bw.write("\r\n");
			}
			bw.flush();
			i++;
		}
		System.out.println(i);
		r.close();
		w.close();
		
	}
	
	public static void getLength(String path) throws IOException{
		//读入
		FileReader r = new FileReader(path);
		BufferedReader br = new BufferedReader(r);
		String line = null;
		String str="";
		while((line=br.readLine())!=null){
			str = str+line;
		}
		System.out.println(str);
		System.out.println(str.length());
	}
}
