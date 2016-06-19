package lf.ask.pojo;

import lombok.Data;

/**
 * DTO for ResponseMessage, message format that hipchat accepts.
 * 
 * @author Achyut Pokhrel <achyutpokhrel@lftechnology.com>
 *
 */
@Data
public class HipchatResponseMessage {

    private String color;
    private String message;
    private String notify;
    private String message_format;

    public HipchatResponseMessage() {
        this.color = "Green";
        this.notify = "false";
        this.message_format = "text";
    }
}
