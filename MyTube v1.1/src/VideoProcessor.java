public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private MessageService service;

    public VideoProcessor() {}

    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, MessageService service) {
        this.encoder = encoder;
        this.database = database;
        this.service = service;
    }

    public void process(Video video, VideoEncoder encoder, VideoDatabase database, MessageService service) {
        encoder.encode(video);

        database.store(video);

        service.sendMessage(video.getUser());
    }

    public void setEncoder(VideoEncoder encoder) {
        this.encoder = encoder;
    }

    public void setDatabase(VideoDatabase database) {
        this.database = database;
    }

    public void setService(MessageService service) {
        this.service = service;
    }

}
