package java112.project3;

/**
 * This bean contains a series of variables that will be populated through the corresponding servlet.
 * @author Louis Kaplan
 * @version 0.2
 */

/*
The page will have instance variables for the following HTTP Request Parameters:

    The remote computer making the request
    The address of the remote computer making the request
    The HTTP method of the request
    The request URI
    The request URL
    The protocol of the request
    The server name
    The server port number
    The current Locale of the server
    The query string
    The value of a query parameter with the name of “queryParameter”
    The value of the request header with the name of “User-Agent”

 */
public class HttpRequestData {

    private String remoteComputer;
    private String remoteAddress;
    private String httpMethod;
    private String requestURI;
    private String requestURL;
    private String requestProtocol;
    private String serverName;
    private String serverPort;
    private String currentLocale;
    private String queryString;
    private String queryParameter;
    private String userAgent;

    public String getRemoteComputer() {
        return remoteComputer;
    }

    public void setRemoteComputer(String remoteComputer) {
        this.remoteComputer = remoteComputer;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getRequestURI() {
        return requestURI;
    }

    public void setRequestUri(String requestURI) {
        this.requestURI = requestURI;
    }

    public String getRequestURL() {
        return requestURL;
    }

    public void setRequestUrl(String requestURL) {
        this.requestURL = requestURL;
    }

    public String getRequestProtocol() {
        return requestProtocol;
    }

    public void setRequestProtocol(String requestProtocol) {
        this.requestProtocol = requestProtocol;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public String getCurrentLocale() {
        return currentLocale;
    }

    public void setCurrentLocale(String serverLocale) {
        this.currentLocale = serverLocale;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getQueryParameter() {
        return queryParameter;
    }

    public void setQueryParameter(String queryParameter) {
        this.queryParameter = queryParameter;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }



}
