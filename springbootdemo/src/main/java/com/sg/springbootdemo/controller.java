package com.sg.springbootdemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    String name = "John";
    int number = 42;

    @GetMapping("test")
    public String testPage(Model model) {

        model.addAttribute("number", number);
        model.addAttribute("firstName", name);

        return "test";
    }

    @GetMapping("testList")
    public String testList(Model model) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(0);
        numbers.add(10);
        numbers.add(6);
        numbers.add(35);

        model.addAttribute("numberList", numbers);

        return "testList";
    }

    @GetMapping("testConditional")
    public String testConditional(Model model) {

        model.addAttribute("truth", true);
        model.addAttribute("theNumber", 33);
        model.addAttribute("aString", "testing");

        return "testConditional";
    }

    @PostMapping("testForm")
    public String testForm(HttpServletRequest request) {
        name = request.getParameter("formFirstName");
        number = Integer.parseInt(request.getParameter("formNumber"));

        return "redirect:/test";
    }




}