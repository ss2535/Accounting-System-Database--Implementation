package com.account4.account4.controller;

import com.account4.account4.model.RecivedCheck;
import com.account4.account4.service.RecivedCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recived-checks")
public class RecivedCheckController {

    @Autowired
    private RecivedCheckService recivedCheckService;

    @PostMapping
    public RecivedCheck createCheck(@RequestBody RecivedCheck check) {
        return recivedCheckService.addCheck(check);
    }

    @GetMapping
    public List<RecivedCheck> getAllChecks() {
        return recivedCheckService.getAllChecks();
    }

    @GetMapping("/{id}")
    public RecivedCheck getCheckById(@PathVariable Long id) {
        return recivedCheckService.getCheckById(id);
    }

    @PutMapping("/{id}")
    public RecivedCheck updateCheck(@PathVariable Long id, @RequestBody RecivedCheck check) {
        return recivedCheckService.updateCheck(id, check);
    }

    @DeleteMapping("/{id}")
    public void deleteCheck(@PathVariable Long id) {
        recivedCheckService.deleteCheck(id);
    }
}
