package com.github.rinaudosal.designpatterns.structural.facade;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FacadeTest {

    @Test
    void compressionOggToMp4ShouldWorks() {
        VideoFacade target = new VideoFacade();

        VideoFile output = target.convertVideo("pippo.ogg", "mpeg4");
        checkOutput(output, MPEG4CompressionCodec.class, "pippo.mpeg4");
    }

    @Test
    void compressionMp4ToOggShouldWorks() {
        VideoFacade target = new VideoFacade();

        VideoFile output = target.convertVideo("pippo.mpeg4", "ogg");
        checkOutput(output, OggCompressionCodec.class, "pippo.ogg");
    }

    @Test
    void compressionOggToOggShouldWorks() {
        VideoFacade target = new VideoFacade();

        VideoFile output = target.convertVideo("pippo.ogg", "ogg");
        checkOutput(output, OggCompressionCodec.class, "pippo.ogg");
    }

    @Test
    void compressionMp4ToMp4ShouldWorks() {
        VideoFacade target = new VideoFacade();

        VideoFile output = target.convertVideo("pippo.mpeg4", "mpeg4");
        checkOutput(output, MPEG4CompressionCodec.class, "pippo.mpeg4");
    }

    @Test
    void compressionDoesntWorksForIllegalFilename() {
        VideoFacade target = new VideoFacade();
        assertThrows(UnsupportedOperationException.class, () -> target.convertVideo("pippo.ddd", "mpeg4"));
    }

    @Test
    void compressionDoesntWorksForIllegalFormat() {
        VideoFacade target = new VideoFacade();
        assertThrows(UnsupportedOperationException.class, () -> target.convertVideo("pippo.ogg", "ggg"));
    }


    private <T> void checkOutput(VideoFile output, Class<T> type, String fileName) {
        assertThat(output).isNotNull();
        assertThat(output.getCodec()).isInstanceOf(type);
        assertThat(output.getName()).isEqualTo(fileName);
    }


}
