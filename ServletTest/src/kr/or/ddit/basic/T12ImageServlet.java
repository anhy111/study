package kr.or.ddit.basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class T12ImageServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("image/jpg");
		ServletOutputStream out = resp.getOutputStream();
		
		InputStream fis = new FileInputStream("c:/xampp/htdocs/jsstudy/basic/images/리트리버1.jpg");
		
		InputStream bis = new BufferedInputStream(fis);
		OutputStream bos = new BufferedOutputStream(out);
		
		int bytesCnt = 0;
		while((bytesCnt = bis.read()) != -1) {
			bos.write(bytesCnt);
		}
		
		
		bis.close();
		bos.close();
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
