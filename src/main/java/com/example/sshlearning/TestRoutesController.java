package com.example.sshlearning;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Basic Routing Controller", description = "Test endpoints for GET, POST, UPDATE, and DELETE")
public class TestRoutesController {

    private static final Logger log = LoggerFactory.getLogger(TestRoutesController.class);

    @GetMapping("/get")
    @Operation(summary = "GET Route", description = "Prints 'this is GET route being tested' in application logs")
    public String handleGet() {
        log.info("this is {} route being tested", "GET");
        return "this is GET route being tested";
    }

    @PostMapping("/post")
    @Operation(summary = "POST Route", description = "Prints 'this is POST route being tested' in application logs")
    public String handlePost(@RequestBody(required = false) String body) {
        log.info("this is {} route being tested", "POST");
        return "this is POST route being tested";
    }

    @PutMapping("/update")
    @Operation(summary = "UPDATE Route", description = "Prints 'this is UPDATE route being tested' in application logs")
    public String handleUpdate(@RequestBody(required = false) String body) {
        log.info("this is {} route being tested", "UPDATE");
        return "this is UPDATE route being tested";
    }

    @DeleteMapping("/delete")
    @Operation(summary = "DELETE Route", description = "Prints 'this is DELETE route being tested' in application logs")
    public String handleDelete() {
        log.info("this is {} route being tested", "DELETE");
        return "this is DELETE route being tested";
    }
}
