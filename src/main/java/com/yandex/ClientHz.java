package com.yandex;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.collection.IQueue;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

import java.text.SimpleDateFormat;

public class ClientHz {
    public static void main(String[] args) {
        ClientConfig clientConfigHz = new ClientConfig();
        HazelcastInstance clientHz = HazelcastClient.newHazelcastClient(clientConfigHz);

        IMap<Integer, String> map = clientHz.getMap("mymap");
        map.put(1, "Vasya");
        map.put(2, "Petya");
        map.put(3, "Kolya");
        
        System.out.println("Map size: "+map.size());
        String name =map.remove(2);
        System.out.println("Map size: "+map.size());

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(map.getEntryView(1).getCreationTime()));

        IQueue<String> queue = clientHz.getQueue("myqueue");
        queue.add(name);
        System.out.println("Queue size: "+queue.size());
        name = queue.poll();
        System.out.println("Queue size: "+queue.size() + ", name: "+name);
    }
}