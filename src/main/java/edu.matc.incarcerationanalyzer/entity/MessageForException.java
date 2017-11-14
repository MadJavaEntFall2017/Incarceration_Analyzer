package edu.matc.incarcerationanalyzer.entity;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageForException {
    private String message;
    private int code;
    private String info;

    public MessageForException(){}

    public MessageForException(String message, int code, String info) {
        this.message = message;
        this.code = code;
        this.info = info;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
