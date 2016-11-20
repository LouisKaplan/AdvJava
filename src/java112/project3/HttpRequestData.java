package java112.project3;

/**
 * This bean contains a series of variables that will be populated through the corresponding servlet.
 * The page will have instance variables for the following HTTP Request Parameters:
 * The remote computer making the request
 * The address of the remote computer making the request
 * The HTTP method of the request
 * The request URI
 * The request URL
 * The protocol of the request
 * The server name
 * The server port number
 * The current Locale of the server
 * The query string
 * The value of a query parameter with the name of “queryParameter”
 * The value of the request header with the name of “User-Agent”
 * @author Louis Kaplan
 * @version 0.2
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

    /**
     * getRemoteComputer returns the value of the String remoteComputer.
     * @return remoteComputer is the value of the String remoteComputer.
     */
    public String getRemoteComputer() {
        return remoteComputer;
    }

    /**
     * setRemoteComputer sets the value of the String remoteComputer.
     * @param remoteComputer is the value of the String remoteComputer.
     */
    public void setRemoteComputer(String remoteComputer) {
        this.remoteComputer = remoteComputer;
    }

    /**
     * getRemoteAddress returns the value of the String remoteAddress.
     * @return remoteAddress is the value of the String remoteAddress.
     */
    public String getRemoteAddress() {
        return remoteAddress;
    }

    /**
     * setRemoteAddress sets the value of the String remoteAddress.
     * @param remoteAddress is the value of the String remoteAddress.
     */
    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    /**
     * getHttpMethod returns the value of the String httpMethod.
     * @return httpMethod is the value of the String httpMethod.
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * setHttpMethod sets the value of the String httpMethod.
     * @param httpMethod is the value of the String httpMethod.
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * getRequestURI returns the value of the String requestURI.
     * @return requestURI is the value of the String requestURI.
     */
    public String getRequestURI() {
        return requestURI;
    }

    /**
     * setRequestUri sets the value of the String requestURI.
     * @param requestURI is the value of the String requestURI.
     */
    public void setRequestUri(String requestURI) {
        this.requestURI = requestURI;
    }

    /**
     * getRequestURL returns the value of the String requestURL.
     * @return requestURL is the value of the String requestURL.
     */
    public String getRequestURL() {
        return requestURL;
    }

    /**
     * setRequestUrl sets the value of the String requestURL.
     * @param requestURL is the value of the String requestURL.
     */
    public void setRequestUrl(String requestURL) {
        this.requestURL = requestURL;
    }

    /**
     * getRequestProtocol returns the value of the String requestProtocol.
     * @return requestProtocol is the value of the String requestProtocol.
     */
    public String getRequestProtocol() {
        return requestProtocol;
    }

    /**
     * setRequestProtocol sets the value of the String requestProtocol.
     * @param requestProtocol is the value of the String requestProtocol.
     */
    public void setRequestProtocol(String requestProtocol) {
        this.requestProtocol = requestProtocol;
    }

    /**
     * getServerName returns the value of the String serverName.
     * @return serverName is the value of the String serverName.
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * setServerName sets the value of the String serverName.
     * @param serverName is the value of the String serverName.
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * getServerPort returns the value of the String serverPort.
     * @return serverPort is the value of the String serverPort.
     */
    public String getServerPort() {
        return serverPort;
    }

    /**
     * setServerPort sets the value of the String serverPort.
     * @param serverPort is the value of the String serverPort.
     */
    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    /**
     * getCurrentLocale returns the value of the String currentLocale.
     * @return currentLocale is the value of the String currentLocale.
     */
    public String getCurrentLocale() {
        return currentLocale;
    }

    /**
     * setCurrentLocale sets the value of the String serverLocale.
     * @param serverLocale is the value of the String serverLocale.
     */
    public void setCurrentLocale(String serverLocale) {
        this.currentLocale = serverLocale;
    }

    /**
     * getQueryString returns the value of the String queryString.
     * @return queryString is the value of the String queryString.
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * setQueryString sets the value of the String queryString.
     * @param queryString is the value of the String queryString.
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * getQueryParameter returns the value of the String queryParameter.
     * @return queryParameter is the value of the String queryParameter.
     */
    public String getQueryParameter() {
        return queryParameter;
    }

    /**
     * setQueryParameter sets the value of the String queryParameter.
     * @param queryParameter is the value of the String queryParameter.
     */
    public void setQueryParameter(String queryParameter) {
        this.queryParameter = queryParameter;
    }

    /**
     * getUserAgent returns the value of the String userAgent.
     * @return userAgent is the value of the String userAgent.
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * setUserAgent sets the value of the String userAgent.
     * @param userAgent is the value of the String userAgent.
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
