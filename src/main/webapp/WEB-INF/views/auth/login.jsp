<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <html>
 <%@include file="../decorator/meta/head.jsp"%>
 <body>
 
 <div class="sign section--bg" data-bg="/img/section/section.jpg">
     <div class="container">
         <div class="row">
             <div class="col-12">
                 <div class="sign__content">
                     <!-- authorization form -->
                     <form:form class="sign__form">
                         <a href="#" class="sign__logo">
                             <img src="../../../../resources/static/img/logo.svg" alt="">
                         </a>
 
                         <div class="sign__group">
                             <input type="text" class="sign__input" placeholder="Username or Email" id="username" name="username">
                         </div>
 
                         <div class="sign__group">
                             <input type="password" class="sign__input" placeholder="Password" id="password" name="password">
                         </div>
 
                            <div class="sign__group sign__group--checkbox">
                                <input type="checkbox" id="remember" name="remember" class="sign__checkbox">
                                <label for="remember">Remember me</label>
 
                         <button class="sign__btn" type="submit">Sign in</button>
 
                         <span class="sign__text">Don't have an account? <a href="signup.html">Sign up!</a></span>
 
                         <p class="sign__text"><a href="#">Forgot password?</a></p>
                     </form:form>
                     <!-- end authorization form -->
                 </div>
             </div>
         </div>
     </div>
 </div>
 <%@include file="../decorator/script/script.jsp"%>
 </body>
 </html>