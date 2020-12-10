package com.github.rinaudosal.designpatterns.structural.facade;

import lombok.Getter;

@Getter
public class VideoFile {
    private final String name;
    private final Codec codec;

    public VideoFile(String name) {
        this.name = name.substring(0, name.indexOf("."));
        this.codec = CodecFactory.extract(name.substring(name.indexOf(".") + 1));
    }

    public VideoFile(String name, Codec codec) {
        this.name = name + "." + codec.getType();
        this.codec = codec;
    }

}