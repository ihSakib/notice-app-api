package org.example.restapi.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.example.restapi.model.Notice;
import org.example.restapi.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/")
    public HashMap<String, String> home() {
        HashMap<String, String> response = new HashMap<>();
        response.put("message", "Welcome to the Notice API.");
        return response;
    }

    @GetMapping("/notice")
    public List<Notice> getNotices() {
        return noticeService.getNotices();
    }

    @GetMapping("/notice/{id}")
    public Object getNoticeById(@PathVariable int id) {
        return noticeService.getNoticeById(id);
    }

    @PostMapping("/notice")
    public HashMap<String, String> setNotice(@RequestBody Notice notice) {
        return noticeService.setNotice(notice);
    }

    @DeleteMapping("/notice/{id}")
    public HashMap<String, String> deleteNotice(@PathVariable int id) {
        return noticeService.deleteNotice(id);
    }

    @PutMapping("/notice")
    public HashMap<String, String> updateNotice(@RequestBody Notice notice) {
        return noticeService.updateNotice(notice);
    }
}
