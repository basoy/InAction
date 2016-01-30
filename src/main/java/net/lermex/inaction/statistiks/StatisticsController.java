package net.lermex.inaction.statistiks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Serg Bash on 27.01.2016.
 */
    @Controller
    public class StatisticsController {

    @RequestMapping(value = "/statistics")
    @ResponseBody
    public String result(){
        Random rand = new Random();
        int monday = rand.nextInt(100);
        int tuesday = rand.nextInt(100);
        int wednesday = rand.nextInt(100);
        int thuesday = rand.nextInt(100);
        int friday = rand.nextInt(100);

        String array = monday + "," + tuesday + "," + wednesday + "," + thuesday + "," + friday;
        return array;
        }
    }
