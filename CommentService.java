package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    public List<ParentComment> listAllUser() {
        return commentRepository.findAll();
    }
}
