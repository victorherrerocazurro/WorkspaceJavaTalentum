package com.loguin.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdministradorLoguinControlador
 */
@WebServlet("/login")
public class AdministradorLoguinControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdministradorLoguinControlador() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
							throws ServletException, IOException {
		// Logica que lleve a un usuario a identificarse en la App
		
		//1-Obtener la informacion
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		//2-No es necesario adaptar lo que nos envia el cliente, a lo
		//que necesita el negocio
		
		//3-Invocar el negocio, para comprobar que el par 
		//usuario/password existe registrado en la BD. 
		//4-Recoger el feedback
		//boolean isValido = negocio.validaLogin(usuario, password);
		
		//Esta linea sustituye temporalmente a la invoacion
		//del negocio
		boolean isValido = usuario.equals("victor") 
								&& password.equals("victor");
		
		String vista = null;
		
		if(isValido){
			//El usuario existe en la base de datos y por tanto
			//habra que recordarlo
			
			HttpSession session = request.getSession(true);//Siempre session es != null
			
			session.setAttribute("usuario", usuario);
			//A partir de aqui, consideramos que un usuario se ha
			//logueado anteriormente, si en la session exite un
			//objeto con clave usuario
			
			
			//5-Hacer accesible a la vista el feedback, pero en este
			//caso, el feedback es el nombre de usuario, que ya esta
			//en la session, por lo queno es encesario incluirlo en
			//la request
			
			vista = "/WEB-INF/menu.jsp";
			

		} else {
			//El usuario no es valido, y por tanto se lo decimos
			//no vaya a ser que se haya equivocado
			
			//5-Hacer accesible a la vista el feedback
			String mensaje = "El par user/password no se encuentra";
			request.setAttribute("mensaje", mensaje);
			
			vista = "/login.jsp";
		}
		
		//6-Definir la vista emplear
		RequestDispatcher requestDispatcher = request
										.getRequestDispatcher(vista);
		
		//7-Hacemos participe a la vista de esta peticion
		requestDispatcher.forward(request, response);
		
	}

}
