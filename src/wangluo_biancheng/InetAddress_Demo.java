package wangluo_biancheng;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    1.public static InetAddress getByName(String host) throws UnknownHostException
        在给定主机名的情况下确定主机的 IP 地址。
        主机名可以是机器名（如 "java.sun.com"），也可以是其 IP 地址的文本表示形式。
        如果提供字面值 IP 地址，则仅检查地址格式的有效性。

    2. public String getHostAddress()
        返回 IP 地址字符串（以文本表现形式）。

    3. public String getHostName()
        获取此 IP 地址的主机名。
        如果此 InetAddress 是用主机名创建的，则记忆并返回主机名；否则，将执行反向名称查找并基于系统配置的名称查找服务返回结果
 */
public class InetAddress_Demo {
    public static void main(String[] args) throws UnknownHostException {
        //1.public static InetAddress getByName(String host) throws UnknownHostException
//        InetAddress name = InetAddress.getByName("liubo-Computer");
        InetAddress name = InetAddress.getByName("10.100.22.163");//推荐采用这种

        //2. public String getHostAddress()
        String hostAddress = name.getHostAddress();


        //3. public String getHostName()
        String hostName = name.getHostName();

        System.out.println("IP地址" + hostAddress);
        System.out.println("主机名" + hostName);


    }
}
