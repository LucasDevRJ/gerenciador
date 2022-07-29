package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/oi") //definir o nome da url do Servlet
public class OiMundoServlet extends HttpServlet { //para transformar a classe em Servlet

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		//definir o fluxo bin�rio
		PrintWriter out = resp.getWriter(); //desenvolver o conte�do html
		//desenvolver conte�do do html
		out.println("<html>");
		out.println("<body>");
		out.println("Oi mundo! Voc� escreveu o primeiro Servlet.");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O Servlet OiMundoServlet foi chamado!");
	}
}
