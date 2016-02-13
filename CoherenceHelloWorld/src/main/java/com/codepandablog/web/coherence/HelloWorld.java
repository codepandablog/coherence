package com.codepandablog.web.coherence;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

public class HelloWorld {

	public static void main(String[] args) {
		String key="name";
		String value="Hem Chandra";
		CacheFactory.ensureCluster();
		NamedCache<Object, Object> cache=CacheFactory.getCache("hello-example");
		cache.put(key,value);
		System.out.println("Hi Welcome: Mr. "+(String)cache.get(key));
	}

}
