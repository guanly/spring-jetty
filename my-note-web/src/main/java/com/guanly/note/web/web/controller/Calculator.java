package com.guanly.note.web.web.controller;

import com.guanly.note.web.web.api.Calculation;
import com.guanly.note.web.web.common.ReplyInfo;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Calculator {

    @RequestMapping(value = "/calc/{op}/{left}/{right}", method = RequestMethod.GET)
    @ResponseBody
    public Calculation calculate(@PathVariable("op") String op, @PathVariable("left") Integer left,
            @PathVariable("right") Integer right, HttpServletResponse response) {
        Assert.notNull(op);
        Assert.notNull(left);
        Assert.notNull(right);
        Calculation result = new Calculation();
        result.setOperation(op);
        result.setLeft(left);
        result.setRight(right);
        return doCalc(result);
    }

    @RequestMapping(value = "/calc2", method = RequestMethod.POST)
    @ResponseBody
    public Calculation calculate(@RequestBody Calculation calc) {
        Assert.notNull(calc);
        Assert.notNull(calc.getOperation());
        Assert.notNull(calc.getLeft());
        Assert.notNull(calc.getRight());
        return doCalc(calc);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String calculate(HttpServletRequest request) {
//        TestService2 testService = (TestService2) ContextUtils.getBean("testService2");
//        System.out.println(testService.getHello2());
        return "Hello world";
    }


    @RequestMapping(value = "/helloJson", method = RequestMethod.GET)
    @ResponseBody
    public ReplyInfo getHello(HttpServletRequest request) {
//        TestService testService = (TestService) ContextUtils.getBean("testService");
//        System.out.println(testService.getHello());
        return new ReplyInfo(true, "Hello world");
    }

    private Calculation doCalc(Calculation c) {
        String op = c.getOperation();
        int left = c.getLeft();
        int right = c.getRight();
        if (op.equalsIgnoreCase("subtract")) {
            c.setResult(left - right);
        } else if (op.equalsIgnoreCase("multiply")) {
            c.setResult(left * right);
        } else if (op.equalsIgnoreCase("divide")) {
            c.setResult(left / right);
        } else {
            c.setResult(left + right);
        }
        return c;
    }
    
}
