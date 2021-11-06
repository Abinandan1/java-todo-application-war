<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Todos || Add</title>
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
          <a href="/login.do">login</a>
        </li>
      </ul>
    </nav>
    <section class="login">
      <form class="login-form" action="/addtodo.do" method="post">
        <h3 class="login-title">new todo</h3>
        <div class="underline"></div>
        <div class="fields">
          <label class="label">name</label>
          <input type="text" placeholder="name" name="todo" class="box" />
        </div>
        <div class="fields">
          <label class="label">description</label>
          <input type="text" placeholder="description" name="category" class="box" />
        </div>
        <button type="submit" class="btn">add</button>
      </form>
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
