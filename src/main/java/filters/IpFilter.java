package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "IpFilter", urlPatterns = "/*",
initParams = @WebInitParam(name="ipPattern", value = "192\\.168\\.100\\.[0-9]{1,3}"))
public class IpFilter implements Filter {

    String ipPattern;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        String remoteAddr = request.getRemoteAddr();
        if (remoteAddr.matches(ipPattern)) {
            chain.doFilter(req, resp);
        } else {
            HttpServletResponse response = (HttpServletResponse) resp;
            response.sendError(403);
        }
    }

    public void init(FilterConfig config) throws ServletException {
        ipPattern = config.getInitParameter("ipPattern");
    }

}
