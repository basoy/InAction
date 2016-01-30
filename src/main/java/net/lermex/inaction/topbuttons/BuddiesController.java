package net.lermex.inaction.topbuttons;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Serg Bash on 27.01.2016.
 */

@Controller
public class BuddiesController {

    @RequestMapping(value = "/buddies")
    public ModelAndView indexBuddies() {
        final ModelAndView mav = new ModelAndView("topbuttons/buddies");
        return mav;
    }
}
