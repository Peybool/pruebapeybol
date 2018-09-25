package com.ipartek.Pablo.supermercadoPablo.controladores;

import java.io.IOException;

import javax.management.RuntimeErrorException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.Pablo.supermercadoPablo.logica.logicaNegocio;
import com.ipartek.Pablo.supermercadoPablo.pojo.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect(request.getContextPath() + "/login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recoger los datos
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(email == null || password == null) {
			throw new RuntimeErrorException(null, "No se han introducido ningun tipo de datos.");
		}
		
		//Cargamos el modelo
		Usuario usuario = new Usuario(email, password);
		
		//Logica de negocio
		boolean usuarioValido = logicaNegocio.validarUsuario(usuario);
		if(usuario.isCorrecto() && usuarioValido) {
			request.getSession().setAttribute("user", usuario);
			request.getRequestDispatcher("principal.jsp").forward(request, response);
		}else {
			if(!usuarioValido) {
				request.setAttribute("errores", "El usuario ha cometido un errorazo");
			}
			
			request.setAttribute("user", usuario);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
