package hector.developers.molcom.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*created by Hector Developers
19-10-2020
*/

@RestController
public class DefaultController implements ErrorController {

    @RequestMapping(value = "/error", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    @ApiOperation(value = "Link to swagger", notes = "Goto https://molcom.herokuapp.com/swagger-ui.html", response = String.class)
    public String handleError() {
        return "Goto https://molcom.herokuapp.com/swagger-ui.html";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}