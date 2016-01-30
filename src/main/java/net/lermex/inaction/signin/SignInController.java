package net.lermex.inaction.signin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Serg Bash on 27.01.2016.
 */
@Controller
public class SignInController {

@RequestMapping(value = "/signin")
public ModelAndView indexSignIn() {
    final ModelAndView mav = new ModelAndView("signin/signin");
    return mav;
}
}