<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Todos || List</title>
    <!-- font-awesome -->
    <link
      rel="stylesheet"
      href="<c:url value="/resources/fontawesome-free-5.15.4-web/css/all.min.css" />"
      type="text/css"
    />
    <!-- CSS -->
    <link href="<c:url value="/resources/main.css" />" rel="stylesheet" type="text/css"> 
  </head>
  <body>
    <nav class="navbar" id="nav">
      <div class="header">
        <h2 class="title">todos</h2>
      </div>
      <ul class="navs">
        <li>
          <a href="#">home</a>
        </li>
        <li>
          <a href="listtodo.do">todos</a>
        </li>
        <li>
          <a href="logout.do">logout</a>
        </li>
      </ul>
    </nav>
    <section class="todos">
    	<h2 class="list-title">your todos</h2>
    	<div class="todos-center">
    		<!-- single card -->
    		<div class="card-initial">
    			<i class="fas fa-list-ul"></i>
    			<a href="addtodo.do"><i class="fas fa-plus-circle"></i></a>
    		</div>
    		<!-- end of single card -->
    		<c:forEach items="${todos}" var="todo">
    		<div class="card">
    			<div class="image">
    				<img class="img" alt="" src="/resources/banner.jpg">
    				<i class="fas fa-clipboard-list"></i>
    			</div>
    			<div class="content">
    				<h4>${todo.name}</h4>
    				<p>${todo.category}</p>    				
    			</div>
    			<div class="card-footer">
    				<a class="btn" href="/delete-todo.do?todo=${todo.name}&category=${todo.category}">delete</a>
    			</div>
    		</div>       		  	
    	</c:forEach>
    	   	
    	</div>
    </section>
    <footer class="footer">
    	<div class="footer-center">
    		<article class="social-icons">
    			<a href="https://www.twitter.com">
    				<i class="fab fa-twitter"></i>
    			</a>
    			<a href="https://www.facebook.com">
    				<i class="fab fa-facebook"></i>
    			</a>
    			<a href="https://www.instagram.com">
    				<i class="fab fa-instagram"></i>
    			</a>
    			<a href="https://www.linkedin.com">
    				<i class="fab fa-linkedin"></i>
    			</a>
    		</article>
    		<p class="copy">&copy; 2021 <span>todos</span> all rights reserved</p>
    	</div>
    </footer>
    <!-- JS -->
    <script src="<c:url value="/resources/js.js" />"></script>
  </body>
</html>
