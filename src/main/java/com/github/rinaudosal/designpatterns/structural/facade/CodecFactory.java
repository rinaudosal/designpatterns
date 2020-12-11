package com.github.rinaudosal.designpatterns.structural.facade;

public final class CodecFactory {

    private CodecFactory(){}

    public static Codec extract(String extension) {
        return switch (extension) {
            case "mpeg4" -> new MPEG4CompressionCodec();
            case "ogg" -> new OggCompressionCodec();
            default -> throw new UnsupportedOperationException(String.format("Invalid %s video format", extension));
        };
    }
}