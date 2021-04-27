package com.flavio.demo.controller;

import com.flavio.demo.controller.dto.FileDto;
import com.flavio.demo.model.File;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FileController {

    @RequestMapping("/files")
    public List<FileDto> list() {
        File file = new File("java", 10, 100, 1000);

        return FileDto.converter(Arrays.asList(file, file, file, file));

    }
}
