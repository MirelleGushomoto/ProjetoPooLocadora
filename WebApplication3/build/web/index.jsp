<%-- 
    Document   : index
    Created on : 25/05/2019, 19:28:33
    Author     : mirel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>CineVideo</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

    </head>
    <body>
        <style>
            p {

text-align: justify;

}
        </style>
     
        <br>
        <div class="container">
    
   
    <center>
        <div class="alert alert-secondary" role="alert">
            <img src="logotipo.png" class="rounded float-left" width="200px" height="70px">
<div class="btn-group">
  <button type="button" class="btn btn-warning" aria-haspopup="true" aria-expanded="false">
   HOME
  </button>
</div>
    <div class="btn-group">
  <button type="button" class="btn btn-dark dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    DVD's
  </button>
  <div class="dropdown-menu">
    <a class="dropdown-item" href="#">Alguma ação</a>
    <a class="dropdown-item" href="#">Outra ação</a>
    <a class="dropdown-item" href="#">Alguma coisa aqui</a>
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="#">Link separado</a>
  </div>
</div>
    <div class="btn-group">
  <button type="button" class="btn btn-dark dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
   BLU-RAY
  </button>
  <div class="dropdown-menu">
    <a class="dropdown-item" href="#">Alguma ação</a>
    <a class="dropdown-item" href="#">Outra ação</a>
    <a class="dropdown-item" href="#">Alguma coisa aqui</a>
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="#">Link separado</a>
  </div>
</div>
    <div class="btn-group">
  <button type="button" class="btn btn-dark dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    PRÉ-VENDA
  </button>
  <div class="dropdown-menu">
    <a class="dropdown-item" href="#">Alguma ação</a>
    <a class="dropdown-item" href="#">Outra ação</a>
    <a class="dropdown-item" href="#">Alguma coisa aqui</a>
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="#">Link separado</a>
  </div>
</div>   
    <div class="btn-group">
      
  <button type="button" class="btn btn-dark dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    PROMOÇÕES
  </button>
  <div class="dropdown-menu">
    <a class="dropdown-item" href="#">Alguma ação</a>
    <a class="dropdown-item" href="#">Outra ação</a>
    <a class="dropdown-item" href="#">Alguma coisa aqui</a>
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="#">Link separado</a>
  </div>
    </div>
            <br>   <br> 
            
<nav class="navbar navbar-light bg-light">
  <form class="form-inline">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
  </form>
</nav>
            <p class="text-center text-danger">
               <?php if(isset($_SESSION['loginErro'])) {
                   echo $_SESSION['loginErro'];
                   unset($_SESSION['loginErrro']);
               }?>
            </p>
            
                           <div class="container">

<ul class="nav justify-content-end">

<form class="form-inline" method="POST" action="valida.php">
    <div class="form-group mb-2">
     <label for="inputEmail" class="sr-only">Email</label>
      <input type="email" class="form-control" placeholder="Email">

  </div>
  <div class="form-group mx-sm-3 mb-2">
    <label for="inputPassword2" class="sr-only">Password</label>
    <input type="password" class="form-control" id="inputPassword2" placeholder="Password">
  </div>
  <button type="submit" class="btn btn-primary mb-2">Acessar</button>
</form>
    </div>
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
         <div id="carouselsite" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselsite" data-slide-to="0" class="active"></li>
    <li data-target="#carouselsite" data-slide-to="1"></li>
    <li data-target="#carouselsite" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="DetetivePikachu.png" class="img-fluid d" >
    </div>
    <div class="carousel-item">
      <img src="MulherMaravilha.png" class="d-block w-100" >
    </div>
    <div class="carousel-item">
      <img src="SuckerPunch.png" class="d-block w-100" >
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Anterior</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Próximo</span>
  </a>
</div>
        </div> 
<div class="card-deck">
  <div class="card">
    <img class="card-img-top" src="Card3.png" alt="Imagem de capa do card">
    <div class="card-body" >
      <h5 class="card-title">INUYASHA - O CASTELO DAS ILUSÕES DENTRO DO ESPELHO </h5>
      <p class="card-text"> Depois de uma batalha contra o seu principal inimigo, Naraku, InuYasha e companhia separam-se para um pouco de descanso. Mas a sua paz não dura muito, pois devem combater uma nova ameaça, a princesa Kaguya. </p>
    </div>
    <div class="card-footer">
      <small class="text-muted">Atualizado a 3 minutos atrás</small>
    </div>
  </div>
  <div class="card">
    <img class="card-img-top" src="Card1.png"  alt="Imagem de capa do card">
    <div class="card-body">
      <h5 class="card-title"> A VIAGEM DE CHIHIRO (千と千尋の神隠)</h5>
      <p class="card-text">Chihiro é uma garota de 10 anos que acredita que todo o universo deve atender aos seus caprichos. Após saber através de seus pais que estarão mudando de cidade ela fica furiosa, sem fazer nenhum esforço para esconder sua raiva. nova cidade onde irão morar, indo parar defronte um túnel.</p>
    </div>
    <div class="card-footer">
      <small class="text-muted">Atualizado a 10 minutos atrás</small>
    </div>
  </div>
  <div class="card">
    <img class="card-img-top" src="Card2.png" alt="Imagem de capa do card">
    <div class="card-body">
      <h5 class="card-title">PONYO - UMA AMIZADE QUE VEIO DO MAR</h5>
      <p class="card-text">Este é um card maior com suporte a texto embaixo, que funciona como uma introdução a um conteúdo adicional. Este card tem o conteúdo ainda maior que o primeiro, para mostrar a altura igual, em ação.</p>
    </div>
    <div class="card-footer">
      <small class="text-muted">Atualizado há 1 hora atrás</small>
    </div>
  </div>
</div>
    </body>
</html>
