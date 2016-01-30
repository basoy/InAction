package net.lermex.inaction.signup;

import net.lermex.inaction.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignUpController {

@RequestMapping(value = "/signup")
public ModelAndView indexSignUp() {
    final ModelAndView mav = new ModelAndView("signup/signup");
    return mav;
}

}