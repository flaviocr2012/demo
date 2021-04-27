package com.flavio.demo.model;

import java.util.Objects;

public class Extension {

    private String java;
    private String xml;

    public Extension(String java, String xml) {
        this.java = java;
        this.xml = xml;
    }

    public String getJava() {
        return java;
    }

    public String getXml() {
        return xml;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Extension)) return false;
        Extension extension = (Extension) o;
        return Objects.equals(java, extension.java) && Objects.equals(xml, extension.xml);
    }

    @Override
    public int hashCode() {
        return Objects.hash(java, xml);
    }
}
