<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
    <title>Heroes</title>
    <style>
        body {
            background: url(https://img.freepik.com/premium-photo/unicorn-background-with-rainbow-sky-fantasy-colorful-space-galaxy-illustration_71374-1570.jpg?w=2000);
            background-position: center center;
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            margin: 0;
            height: 100vh;
            bgcolor = "#800000";
        }
    </style>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<header class="d-flex p-2" style="background-color: rgba(255,255,255,0.6)">
    <div class="container">
        <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
            <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-dark text-decoration-none">
                <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"></use></svg>
            </a>
            <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                <h4><li><a href="#" class="nav-link px-2"><b style="color:#144C47">WIKI FANTASIA</b></a></li></h4>
                <!--
                <div class="dropdown text-end">
                    <a href="#" class="d-block link-dark text-decoration-none" aria-expanded="false">
                        <img src="http://diaferdesign.com/wp-content/uploads/2017/11/diana-fondo-desenfocado-circular-300x283.png" alt="mdo" width="32" height="32" class="rounded-circle">
                    </a>
                </div>
                -->
            </ul>
        </div>
    </div>
</header>
<br><br><br>
<div class="d-flex justify-content-center">
    <div class="card"  style="background-color: rgba(240,240,240,0.6)">
        <div class="card-body">
            <div>
                <h4 style="text-align: center; color: black"><b>LISTA DE HEROES</b></h4>
            </div>
            <div>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Buscar" aria-label="Buscar"  >
                    <button class="btn btn-outline-light" type="submit" style="color: darkslategray; border:1px solid white">Buscar</button>
                </form>
                <br>
            </div>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th style="color:#053934; padding-left: 2rem; text-align: center"><b>NOMBRE</b></th>
                    <th style="color:#053934; padding-left: 2rem; text-align: center"><b>EDAD</b></th>
                    <th style="color:#053934; padding-left: 2rem; text-align: center"><b>GENERO</b></th>
                    <th style="color:#053934; padding-left: 2rem; text-align: center"><b>CLASE</b></th>
                    <th style="color:#053934; padding-left: 2rem; text-align: center"><b>NIVEL</b></th>
                    <th style="color:#053934; padding-left: 2rem; text-align: center"><b>ATAQUE</b></th>
                    <th style="color:#053934; padding-left: 2rem; text-align: center"><b>PAREJA</b></th>
                    <th style="color:#053934; padding-left: 2rem; text-align: center"><b>OPCIONES</b></th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <%for (Heroes heroe : lista) { %>
                    <td style="color:black; padding-left: 2rem; text-align: center"><b><%=heroe.getNombre()%></b></td>
                    <td style="color:black; padding-left: 2rem; text-align: center"><b><%=heroe.getEdad()%></b></td>
                    <td style="color:black; padding-left: 2rem; text-align: center"><b><%=heroe.getGenero()%></b></td>
                    <td style="color:black;; padding-left: 2rem; text-align: center"><b><%=heroe.getClase()%></b></td>
                    <td style="color:black; padding-left: 2rem; text-align: center"><b><%=heroe.getNivel()%></b></td>
                    <td style="color:black; padding-left: 2rem; text-align: center"><b><%=heroe.getAtaque()%></b></td>
                    <td style="color:black; padding-left: 2rem; text-align: center"><b><%=heroe.getPareja()%></b></td>
                    <% } %>
                    <td>
                        <div class="btn-group" role="group" aria-label="Basic mixed styles example" style="padding-left: 3rem;">
                            <a href="<%=request.getContextPath()%>/ServletAdmin?action=index" type="button" class="btn btn-outline-secondary">Editar</a>
                            <a href="verIncidencia.html" type="button" class="btn btn-outline-secondary">Inventario</a>
                            <a type="button" class="btn btn-danger"
                               onclick="return confirm('¿Estas seguro(a) que deseas eliminar al heroe?')"
                               href="<%=request.getContextPath()%>/ServletAdmin?action=borrar&id=<%=user.getIdHeroe()%>">Eliminar
                            </a>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<br></br>
<a class="btn btn-primary" href="lab8.html" role="button" style="margin-left: 0rem; background-color:#D12C22 ; border: none;"> ◄ Atrás </a>
<br><br>
</body>
</html>