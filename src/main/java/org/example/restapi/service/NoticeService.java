package org.example.restapi.service;

import org.example.restapi.model.Notice;
import org.example.restapi.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class NoticeService {

    @Autowired
    private NoticeRepository noticeRepository;

    public List<Notice> getNotices() {
        return noticeRepository.findAll();
    }

    public Object getNoticeById(int id) {
        // Find the notice by ID
        Optional<Notice> notice = noticeRepository.findById(id);

        // If notice is present, return it, otherwise return the response message
        if (notice.isPresent()) {
            return notice.get();
        } else {
            HashMap<String, String> response = new HashMap<>();
            response.put("message", "Notice not found.");
            return response;
        }
    }

    public HashMap<String, String> setNotice(Notice notice) {
        HashMap<String, String> response = new HashMap<>();

        // Check if the notice exists (by ID for example), and if so, update it.
        if (noticeRepository.existsById(notice.getId())) {
            response.put("message", "Notice already exists.");
        } else {
            noticeRepository.save(notice);
            response.put("message", "Notice added successfully.");
        }

        return response;
    }

    public HashMap<String, String> deleteNotice(int id) {
        HashMap<String, String> response = new HashMap<>();

        if (noticeRepository.existsById(id)) {
            noticeRepository.deleteById(id);
            response.put("message", "Notice deleted successfully.");
        } else {
            response.put("message", "Notice not found.");
        }

        return response;
    }

    public HashMap<String, String> updateNotice(Notice notice) {
        HashMap<String, String> response = new HashMap<>();

        if (noticeRepository.existsById(notice.getId())) {
            noticeRepository.save(notice);
            response.put("message", "Notice updated successfully.");
        } else {
            response.put("message", "Notice not found.");
        }

        return response;
    }
}
