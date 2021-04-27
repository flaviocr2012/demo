package com.flavio.demo.model;

import java.util.Objects;

public class File {

    private String extension;
    private int count;
    private int lines;
    private long bytes;

    public File(String extension, int count, int lines, long bytes) {
        this.count = count;
        this.lines = lines;
        this.bytes = bytes;
        this.extension = extension;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof File)) return false;
        File file = (File) o;
        return getCount() == file.getCount() && getLines() == file.getLines() && Double.compare(file.getBytes(), getBytes()) == 0 && Objects.equals(getExtension(), file.getExtension());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExtension(), getCount(), getLines(), getBytes());
    }
}
