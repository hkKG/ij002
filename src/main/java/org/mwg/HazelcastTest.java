package org.mwg;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class HazelcastTest {


    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        // TODO
//        clientConfig.addAddress("127.0.0.1:5701");
//        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
//        IMap<Object, Object> map = client.getMap("customers");
//        System.out.println("Map Size:" + map.size());
//
//        client.getDurableExecutorService("hello").submit(new HazelcastJob(() -> System.out.println("Hello")));

    }


}
