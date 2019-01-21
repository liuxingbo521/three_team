package com.jk.service.impl;

import com.jk.mapper.MessageMapper;
import com.jk.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MassageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;


}
