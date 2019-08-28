package com.jinglei.shareclipboardserver.controller;

import com.jinglei.shareclipboardserver.repository.DataObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestController
@RequestMapping("/api/clipboard")
public class DataObjectController {

    private final DataObjectRepository dataObjectRepository;

    @Autowired
    public DataObjectController(DataObjectRepository dataObjectRepository) {
        this.dataObjectRepository = dataObjectRepository;
    }


}
