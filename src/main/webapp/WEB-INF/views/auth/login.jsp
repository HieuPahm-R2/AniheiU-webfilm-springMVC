<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 <html>
 <%@include file="../decorator/head/head.jsp"%>
 <body>
 
 <div class="sign section--bg" data-bg="/img/section/section.jpg">
     <div class="container">
         <div class="row">
             <div class="col-12">
                 <div class="sign__content">
                     <!-- authorization form -->
                     <form action="login" method="post" class="sign__form">
                         <a href="#" class="sign__logo">
                             <img src="/img/aniix.svg" alt="">
                         </a>
 
                         <div class="sign__group">
                             <input type="text" class="sign__input" placeholder="Username" id="username" name="username">
                         </div>
 
                         <div class="sign__group">
                             <input type="password" class="sign__input" placeholder="Password" id="password" name="password">
                         </div>
 
                            <div class="sign__group sign__group--checkbox">
                                <input type="checkbox" id="remember" name="remember" class="sign__checkbox">
                                <label for="remember">Remember me</label>
 
                         <button class="sign__btn" type="submit">Sign in</button>
 
                         <span class="sign__text">Don't have an account? <a href="signup.html">Sign up!</a></span>
 
                         <span class="sign__text"><a href="#">Forgot password?</a></span>
                     </form>
                     <!-- end authorization form -->
                 </div>
             </div>
         </div>
     </div>
 </div>
 <%@include file="../decorator/script/script.jsp"%>
 </body>
 </html>