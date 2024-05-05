package pl.pja.s28201.tpo_07.dto;

import java.time.LocalDateTime;

public class CodeFormatDto {

    private String id;
    private String body;
    private LocalDateTime timeSerialized;
    private Long secondsToExpire;

    public CodeFormatDto() {
    }

        public CodeFormatDto(String id, String body, LocalDateTime timeSerialized, Long secondsToExpire) {
        this.id = id;
        this.body = body;
        this.timeSerialized = timeSerialized;
        this.secondsToExpire = secondsToExpire;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getTimeSerialized() {
        return timeSerialized;
    }

    public void setTimeSerialized(LocalDateTime timeSerialized) {
        this.timeSerialized = timeSerialized;
    }

    public Long getSecondsToExpire() {
        return secondsToExpire;
    }

    public void setSecondsToExpire(Long secondsToExpire) {
        this.secondsToExpire = secondsToExpire;
    }
}
