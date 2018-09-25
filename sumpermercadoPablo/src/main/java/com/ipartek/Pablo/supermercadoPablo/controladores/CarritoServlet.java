package com.ipartek.Pablo.supermercadoPablo.controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ipartek.Pablo.supermercadoPablo.logica.logicaNegocio;
import com.ipartek.Pablo.supermercadoPablo.pojo.Producto;

/**
 * Servlet implementation class CarritoServlet
 */
@WebServlet("/carrito")
public class CarritoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CarritoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String accion = request.getParameter("accion");
		
		HttpSession session = request.getSession();
		
		List<Producto> productos = (List<Producto>)session.getAttribute("carrito");
		
		if(productos == null) {
			productos = new ArrayList<Producto>();
			session.setAttribute("carrito", productos);
		}
		
		if(id != null && accion != null) {
			Producto producto = logicaNegocio.obtenerProductoPorId(Long.parseLong(id));	
			
			switch(accion) {
			case "add":
				productos.add(producto);
				break;
			case "delete":
				productos.remove(producto);
				break;
			}
		}
		
		request.getRequestDispatcher("carrito.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
