//package cn.kgc.k9509.ribbonalgorithm;
//
//import com.netflix.client.config.IClientConfig;
//import com.netflix.loadbalancer.AbstractLoadBalancerRule;
//import com.netflix.loadbalancer.ILoadBalancer;
//import com.netflix.loadbalancer.Server;
//
//import java.util.List;
//import java.util.Random;
//
///**
// * @Classname Ribbon_zy
// * @Description TODO
// * @Date 2020/3/16 19:35
// * @Created by Alina
// */
////自定义算法(自己编写算法给微服务使用)
//public class Ribbon_zy extends AbstractLoadBalancerRule {
//
//    private int total=0;  //总共被调用的次数，目前要去每台调用五次
//    private int currenIndex=0; //当前提供服务的机器号
//
//    public Server choose(ILoadBalancer lb, Object key) {
//        if (lb == null) {
//            return null;
//        }
//
//        Server server = null;
//        while (server == null) {
//            //获取健康的服务有哪些
//            List<Server> reachableServers = lb.getReachableServers();
//            //服务一共有哪些
//            List<Server> allServers = lb.getAllServers();
//            int upCount = reachableServers.size();
//            int serverCount = allServers.size();
//
//            if ((upCount == 0) || (serverCount == 0)) {
//                return null;
//            }
//
////            int index = random.nextInt(serverCount);
////            server = allServers.get(index);
//            if(total<5){
//                server=reachableServers.get(currenIndex);
//                total++;
//            }else{
//                total=0;
//                currenIndex++;
//                if(currenIndex>=reachableServers.size()){
//                    currenIndex=0;
//                }
//            }
//
//            if (server == null) {
//                /* Transient. */
//                Thread.yield();
//                continue;
//            }
//
//            if (server.isAlive() && (server.isReadyToServe())) {
//                return (server);
//            }
//
//            // Next.
//            server = null;
//        }
//
//        return server;
//    }
//
//    @Override
//    public void initWithNiwsConfig(IClientConfig iClientConfig) {
//    }
//
//    @Override
//    public Server choose(Object key) {
//        return choose(getLoadBalancer(), key);
//    }
//}