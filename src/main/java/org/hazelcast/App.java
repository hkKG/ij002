package org.hazelcast;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class App {
    public static void main(String[] args) {

        ////////////////////////////////////////////////////////////////////
        // https://docs.spring.io/spring-session/docs/current/reference/html5/#httpsession-why
        // https://docs.spring.io/spring-session/docs/current/reference/html5/guides/java-hazelcast.html
        // https://docs.hazelcast.org/docs/3.12.3/manual/html-single/index.html#hazelcast-configuration
        ////////////////////////////////////////////////////////////////////

        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        IMap<String, String> capitals = hz.getMap("capitals");
        if (capitals.containsKey("AU")) {
            capitals.put("NY", "NeyYork");

        }
        capitals.put("GB", "London");
        capitals.put("FR", "Paris");
        capitals.put("US", "Washington DC");
        capitals.put("AU", "Canberra");

        System.out.println("Known capital cities: " + capitals.size());
        System.out.println("Known capital cities: " + capitals.getName());
        System.out.println("Known capital cities: " + capitals.get("GB"));
        System.out.println("Known capital cities: " + capitals.get("FR"));
        System.out.println("Known capital cities: " + capitals.get("US"));
        System.out.println("Known capital cities: " + capitals.get("AU"));

        capitals.delete("GB");


        System.out.println("Known capital cities: " + capitals.size());
        System.out.println("Known capital cities: " + capitals.getName());
        System.out.println("Known capital cities: " + capitals.get("GB"));
        System.out.println("Known capital cities: " + capitals.get("FR"));
        System.out.println("Known capital cities: " + capitals.get("US"));
        System.out.println("Known capital cities: " + capitals.get("AU"));

    }
}

