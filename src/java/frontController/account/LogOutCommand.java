package frontController.account;

import frontController.FrontCommand;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

public class LogOutCommand extends FrontCommand {

    @Override
    public void process() {
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("JSESSIONID")) {
                    System.out.println("JSESSIONID=" + cookie.getValue());
                    break;
                }
            }
        }
        
        HttpSession session = request.getSession(false);
    	System.out.println("User="+session.getAttribute("user"));
    	if(session != null){
    		session.invalidate();
    	}
        redirect("/");
    }

}
