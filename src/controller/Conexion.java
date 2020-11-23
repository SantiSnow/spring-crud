package controller;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.DriverManager;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Conexion
 */
@WebServlet("/Conexion")
public class Conexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Conexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//datos conexion mysql
				String host = "jdbc:mysql://localhost:3306/gestionpedidoscrud?serverTimezone=UTC&useSSL=false";
				String usr = "root";
				String pass = "";
				
				String driver = "com.mysql.jdbc.Driver";
							
				try {
								
					PrintWriter out = response.getWriter();
							
					Class.forName(driver);
					
					Connection miConexion = DriverManager.getConnection(host, usr, pass);
							
					out.print("Conexion exitosa");
					
					miConexion.close();
					
				}
				catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
