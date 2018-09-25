<%@ include file="/WEB-INF/includes/cabeceraAdmin.jsp" %>


	<header><h1>Administracion Edicion</h1></header>
	
	<form action="edicion.jsp">
		
		<p><label for="id">Id</label>
			<input type="number" name="id" id="id"/>
		</p>
		
		<p>
			<label for="nombre">Nombre</label>
			<input type="text" name="nombre" id="nombre"/>
		</p>
		
		<p>
			<label for="precio">Precio</label>
			<input type="number" name="precio" id="precio"/>
		</p>
		
		<button>Aceptar</button>
		
		
	</form>
	
	
	
	
	


<%@ include file="/WEB-INF/includes/pie.jsp" %>