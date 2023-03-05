package com.mehmetnuri.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/auth")
public class AuthController {


    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String getLoginPage() {
        return "pages/auth/login";
    }
}
