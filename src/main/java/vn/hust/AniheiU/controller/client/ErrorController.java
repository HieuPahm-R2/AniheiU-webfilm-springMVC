package vn.hust.AniheiU.controller.client;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {
    @RequestMapping(value = "errors", method = RequestMethod.GET)
    public ModelAndView renderErrorPage(HttpServletRequest request) {
        ModelAndView errorPage = new ModelAndView("/error/404.jsp");
        String errorMess = "";
        int httpErrorCode = getErrorCode(request);
        switch(httpErrorCode){
            case 400:{
                errorMess = "400 - Bad Request";
                break;
            }
            case 401:{
                errorMess = "401 - Unauthorized";
                break;
            }
            case 404:{
                errorMess = "404 - Not Found";
                break;
            }
            case 500:{
                errorMess = "500 - Internal Server Error";
                break;
            }
        }
        errorPage.addObject("errorMsg",errorMess);
        return errorPage;
    }

    private int getErrorCode(HttpServletRequest request) {
        return (Integer) request.getAttribute("javax.servlet.error.status_code");
    }
}
