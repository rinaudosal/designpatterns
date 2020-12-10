package com.github.rinaudosal.designpatterns.structural.facade;

public class VideoFacade {

    public VideoFile convertVideo(String fileName, String format) {
        VideoFile sourceFile = new VideoFile(fileName);
        Codec destinationCodec = CodecFactory.extract(format);

        return new VideoFile(sourceFile.getName(), destinationCodec);
    }
}