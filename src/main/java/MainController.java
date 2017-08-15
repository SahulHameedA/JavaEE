import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.Date;

public class MainController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());  

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	String now = (new Date()).toString();
        logger.info("Returning the Main Login page (now decoupled from the location) @  " + now);
        logger.info("images are ok in webapp or within an img subfolder in webapp path");
        logger.info("Trying to center align a form and size the forms width to x px");
        logger.info("size workd, but not align, trying now with margin: 0 auto");
        return new ModelAndView("login","now",now);
    }

}