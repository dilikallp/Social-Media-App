package com.example.Social.media.Controller;

import com.example.Social.media.Entity.Status;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/statusService")
public class StatusController {
    @PostMapping(value = "/save")
    public Status saveStatus(@RequestBody Status status) {
        return new Status();

    }
    @GetMapping(value = "/getAllStatus")
    public ArrayList<Status> getAllStatus() {

        return new ArrayList<Status>();
    }

}
