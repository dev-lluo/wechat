package top.flyfire.wechat.http;

import top.flyfire.wechat.event.WechatEvent;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

/**
 * Created by shyy_work on 2016/7/20.
 */
public class HttpServletEventRequest implements javax.servlet.http.HttpServletRequest {

    private ServletRequest parent;

    private WechatEvent wechatEvent;

    public HttpServletEventRequest(ServletRequest parent,WechatEvent wechatEvent) {
        this.parent = parent;
    }

    private HttpServletRequest _getHttpServletRequest() {
        return (HttpServletRequest)parent;
    }

    public String getAuthType() {
        return this._getHttpServletRequest().getAuthType();
    }

    public Cookie[] getCookies() {
        return this._getHttpServletRequest().getCookies();
    }

    public long getDateHeader(String s) {
        return this._getHttpServletRequest().getDateHeader(s);
    }

    public String getHeader(String s) {
        return this._getHttpServletRequest().getHeader(s);
    }

    public Enumeration<String> getHeaders(String s) {
        return this._getHttpServletRequest().getHeaders(s);
    }

    public Enumeration<String> getHeaderNames() {
        return this._getHttpServletRequest().getHeaderNames();
    }

    public int getIntHeader(String s) {
        return this._getHttpServletRequest().getIntHeader(s);
    }

    public String getMethod() {
        return this._getHttpServletRequest().getMethod();
    }

    public String getPathInfo() {
        return this._getHttpServletRequest().getPathInfo();
    }

    public String getPathTranslated() {
        return this._getHttpServletRequest().getPathTranslated();
    }

    public String getContextPath() {
        return this._getHttpServletRequest().getContextPath();
    }

    public String getQueryString() {
        return this._getHttpServletRequest().getQueryString();
    }

    public String getRemoteUser() {
        return this._getHttpServletRequest().getRemoteUser();
    }

    public boolean isUserInRole(String s) {
        return this._getHttpServletRequest().isUserInRole(s);
    }

    public Principal getUserPrincipal() {
        return this._getHttpServletRequest().getUserPrincipal();
    }

    public String getRequestedSessionId() {
        return this._getHttpServletRequest().getRequestedSessionId();
    }

    public String getRequestURI() {
        return this._getHttpServletRequest().getRequestURI();
    }

    public StringBuffer getRequestURL() {
        return this._getHttpServletRequest().getRequestURL();
    }

    public String getServletPath() {
        return this._getHttpServletRequest().getServletPath();
    }

    public HttpSession getSession(boolean b) {
        return this._getHttpServletRequest().getSession(b);
    }

    public HttpSession getSession() {
        return this._getHttpServletRequest().getSession();
    }

    public String changeSessionId() {
        return this._getHttpServletRequest().changeSessionId();
    }

    public boolean isRequestedSessionIdValid() {
        return this._getHttpServletRequest().isRequestedSessionIdValid();
    }

    public boolean isRequestedSessionIdFromCookie() {
        return this._getHttpServletRequest().isRequestedSessionIdFromCookie();
    }

    public boolean isRequestedSessionIdFromURL() {
        return this._getHttpServletRequest().isRequestedSessionIdFromURL();
    }

    @Deprecated
    public boolean isRequestedSessionIdFromUrl() {
        return this._getHttpServletRequest().isRequestedSessionIdFromUrl();
    }

    public boolean authenticate(HttpServletResponse httpServletResponse) throws IOException, ServletException {
        return this._getHttpServletRequest().authenticate(httpServletResponse);
    }

    public void login(String s, String s1) throws ServletException {
        this._getHttpServletRequest().login(s,s1);
    }

    public void logout() throws ServletException {
        this._getHttpServletRequest().logout();
    }

    public Collection<Part> getParts() throws IOException, ServletException {
        return this._getHttpServletRequest().getParts();
    }

    public Part getPart(String s) throws IOException, ServletException {
        return this._getHttpServletRequest().getPart(s);
    }

    public <T extends HttpUpgradeHandler> T upgrade(Class<T> aClass) throws IOException, ServletException {
        return this._getHttpServletRequest().upgrade(aClass);
    }

    public Object getAttribute(String s) {
        return parent.getAttribute(s);
    }

    public Enumeration<String> getAttributeNames() {
        return parent.getAttributeNames();
    }

    public String getCharacterEncoding() {
        return parent.getCharacterEncoding();
    }

    public void setCharacterEncoding(String s) throws UnsupportedEncodingException {
        parent.setCharacterEncoding(s);
    }

    public int getContentLength() {
        return parent.getContentLength();
    }

    public long getContentLengthLong() {
        return parent.getContentLengthLong();
    }

    public String getContentType() {
        return parent.getContentType();
    }

    public ServletInputStream getInputStream() throws IOException {
        return parent.getInputStream();
    }

    public String getParameter(String s) {
        return parent.getParameter(s);
    }

    public Enumeration<String> getParameterNames() {
        return parent.getParameterNames();
    }

    public String[] getParameterValues(String s) {
        return parent.getParameterValues(s);
    }

    public Map<String, String[]> getParameterMap() {
        return parent.getParameterMap();
    }

    public String getProtocol() {
        return parent.getProtocol();
    }

    public String getScheme() {
        return parent.getScheme();
    }

    public String getServerName() {
        return parent.getServerName();
    }

    public int getServerPort() {
        return parent.getServerPort();
    }

    public BufferedReader getReader() throws IOException {
        return parent.getReader();
    }

    public String getRemoteAddr() {
        return parent.getRemoteAddr();
    }

    public String getRemoteHost() {
        return parent.getRemoteHost();
    }

    public void setAttribute(String s, Object o) {
        parent.setAttribute(s,o);
    }

    public void removeAttribute(String s) {
        parent.removeAttribute(s);
    }

    public Locale getLocale() {
        return parent.getLocale();
    }

    public Enumeration<Locale> getLocales() {
        return parent.getLocales();
    }

    public boolean isSecure() {
        return parent.isSecure();
    }

    public RequestDispatcher getRequestDispatcher(String s) {
        return parent.getRequestDispatcher(s);
    }

    @Deprecated
    public String getRealPath(String s) {
        return parent.getRealPath(s);
    }

    public int getRemotePort() {
        return parent.getRemotePort();
    }

    public String getLocalName() {
        return parent.getLocalName();
    }

    public String getLocalAddr() {
        return parent.getLocalAddr();
    }

    public int getLocalPort() {
        return parent.getLocalPort();
    }

    public ServletContext getServletContext() {
        return parent.getServletContext();
    }

    public AsyncContext startAsync() throws IllegalStateException {
        return parent.startAsync();
    }

    public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse) throws IllegalStateException {
        return parent.startAsync(servletRequest,servletResponse);
    }

    public boolean isAsyncStarted() {
        return parent.isAsyncStarted();
    }

    public boolean isAsyncSupported() {
        return parent.isAsyncSupported();
    }

    public AsyncContext getAsyncContext() {
        return parent.getAsyncContext();
    }

    public DispatcherType getDispatcherType() {
        return parent.getDispatcherType();
    }

    public WechatEvent getWechatEvent(){
        return wechatEvent;
    }
}
