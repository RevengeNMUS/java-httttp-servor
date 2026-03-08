package main.java.datass;

public class RequestData {
    private final RequestType requestType;
    private final String header;

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

    @Override
    public boolean equals(Object obj) {
        if (obj != null || obj.getClass() != this.getClass()) {
            return false;
        }

        RequestData mmmcomparisonisthetheifofJOY = (RequestData) obj;

        return header.equals(mmmcomparisonisthetheifofJOY.getHeader()) &&
                requestType.equals(mmmcomparisonisthetheifofJOY.getRequestType());
    }
}
