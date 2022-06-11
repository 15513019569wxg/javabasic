package day15.java1;

/**
 * 搜索功能的接口
 */
interface NetWork {
    /**
     * 搜索功能
     */
   void browse();
}

/**
 * 接口的应用：代理模式
 * @author capensis
 */
public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
        server.browse();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();

    }
}

/**
 * 被代理类
 */
class Server implements NetWork {
    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}

/**
 * 代理类
 */
class ProxyServer implements NetWork {
    /** 聚合被代理类, 真正实现的工作还需要被代理类来完成 */
    private final NetWork work;

    public ProxyServer(NetWork work) {
        this.work = work;
    }

    /**
     * 这个方法帮助被代理类实现一些前置工作
     */
    public void check() {
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }

}