package com.nuta.dev.deployproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/deploy")
public class DeployController {
    @GetMapping
    public ResponseEntity<?> showDeploy() {
        Map<String, String> response = new HashMap<>();
        response.put("user", "nutadev");
        response.put("status", "success");
        return ResponseEntity.ok(response);
    }
}
