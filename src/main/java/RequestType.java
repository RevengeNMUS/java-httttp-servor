package main.java;

public enum RequestType {
    GET("GET"),
    POST("POST"),
    UNKNOWN("UNKNOWN");
    //I lowk have NO CLUE what the HECKY the TYPES are there probably liek michael b jordan in there somewhere

    private String something;

    private RequestType(String idkatpmanimsosleepy) {
        something = idkatpmanimsosleepy;
    }

    public String getSomething() {
        return something;
    }

    public static RequestType whatKINDshouldIHAVE(String thethingy) {
        if (thethingy == GET.something) {
            return GET; //if "GET"
        }
        if (thethingy == POST.something) {
            return POST; //if "POST"
        }

        //default case :P
        return UNKNOWN;
    }
}
