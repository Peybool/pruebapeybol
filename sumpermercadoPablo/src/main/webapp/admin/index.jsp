<%@ include file="/WEB-INF/includes/cabeceraAdmin.jsp" %>


	<header><h1>Administracion</h1></header>
	
	
	<table>
		<thead>
			<tr>
				<th>Id</th><th>Nombre</th><th>Precio</th>
				<td><a href="edicion.jsp?accion=add">Añadir</a></td>
			</tr>
		</thead>
	
		<tbody>
			<tr>
				<th>1</th><td>Pablo</td><td>11</td>
				<td>
					<a href="edicion.jsp?accion=update">Editar</a>
					<a href="edicion.jsp?accion=delete">Borrar</a>
				</td>
			</tr>
			<tr>
				<th>2</th><td>Pablo2</td><td>22</td>
				<td>
					<a href="edicion.jsp?accion=update">Editar</a>
					<a href="edicion.jsp?accion=delete">Borrar</a>
				</td>
			</tr>
		</tbody>
	
	</table>
	
	


<%@ include file="/WEB-INF/includes/pie.jsp" %>