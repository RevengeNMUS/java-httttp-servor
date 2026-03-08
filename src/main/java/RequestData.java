package main.java;

public class RequestData {
    private RequestType requestType;
    private String header;

    public RequestData(String thethingythatwasrecieved) {
        String[] michael = thethingythatwasrecieved.split(" ");
        requestType = RequestType.valueOf(michael[0]);
        header = michael[1];
    }

    public String getHeader() {
        return header;
    }

    public RequestType getRequestType() {
        return requestType;
    }
}
