package com.flavio.demo.controller.dto;

import com.flavio.demo.model.File;

import java.util.List;
import java.util.stream.Collectors;

public class FileDto {

    private String extension;
    private int count;
    private int lines;
    private long bytes;

    public FileDto (File file) {
        this.extension = file.getExtension();
        this.count = file.getCount();
        this.lines = file.getLines();
        this.bytes = file.getBytes();

    }

    public String getExtension() {
        return extension;
    }

    public int getCount() {
        return count;
    }

    public int getLines() {
        return lines;
    }

    public long getBytes() {
        return bytes;
    }

    public static List<FileDto> converter(List<File> files) {
        return files.stream().map(FileDto::new).collect(Collectors.toList());
    }
}
