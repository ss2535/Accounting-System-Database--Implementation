package com.account4.account4.controller.frontend;

import com.account4.account4.model.AccountHeading;
import com.account4.account4.service.AccountHeadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account-heading-form")
public class AccountHeadingController2 {

    @Autowired
    private AccountHeadingService accountHeadingService;

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("accountHeading", new AccountHeading());
        return "account_heading_form";
    }

    @PostMapping
    public String saveAccountHeading(AccountHeading accountHeading) {
        System.out.println(accountHeading);
        accountHeadingService.save(accountHeading);
        return "redirect:/account-heading-form";
    }
}