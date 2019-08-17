package com.yu.delegate;

import com.yu.delegate.controller.ActionOne;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: ServletDispatchar
 * @author: yu.liu
 * @date: 2019/8/17 11:26
 * @description:
 */
public class ServletDispachar {

    class Handler{

        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public void setController(Object controller) {
            this.controller = controller;
        }

        public Method getMethod() {
            return method;
        }

        public void setMethod(Method method) {
            this.method = method;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public  ServletDispachar(){

        Class<?>  actionOne = ActionOne.class;
        Handler handler = new Handler();
        try {
            handler.setController(actionOne);
            handler.setMethod(actionOne.getMethod("methodOne",actionOne));
            handler.setUrl("/act/action");
            handlerList.add(handler);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
    private List<Handler> handlerList = new ArrayList<>();

    public  void  doSeervice(HttpServletRequest request, HttpServletResponse response){
         doDispatch(request, response);
    }
     private void doDispatch(HttpServletRequest request, HttpServletResponse response){

        String uri = request.getRequestURI();
        Handler handler = null;
         for (Handler h : handlerList) {
             if (h.getUrl().equals(uri)){
                 handler = h;
                 break;
             }
         }
         Object o = null;
         try {
           o = handler.getMethod().invoke(handler.getController(),request.getParameter(""));
         } catch (IllegalAccessException e) {
             e.printStackTrace();
         } catch (InvocationTargetException e) {
             e.printStackTrace();
         }
         // response.getWriter().write();
     }
}
