package lab06;

import com.sun.org.apache.xpath.internal.SourceTree;
import lab05.RealSubject;
import lab05.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Ольга on 06.04.2015.
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            private Subject realSubject = new RealSubject();
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long start = System.currentTimeMillis();
                Object result = method.invoke(realSubject);
                long end = System.currentTimeMillis();
                System.out.println(end - start);
                return result;
            }
        };
        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class}, handler);
        subject.longMethod();
    }
}


