package javainaction.javaone.collections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class ColletionInnerWorking {
	public static void main(String[] args) {
			List<Integer> integers = new  ArrayList<>();
			integers.add(9);
			integers.add(8);
			
			Deque<Integer> deque = new LinkedList<>();
			deque.addAll(integers);
			System.out.println(deque.peek());;
			System.out.println(deque.poll());
			System.out.println(deque.offer(66));
			
			System.out.println(integers.size());
			System.out.println("-----");
			deque.forEach(System.out::println);
			//System.out.println(10>>1);
			
			Set<Integer> set= new  HashSet<Integer>();
			set.add(88);
			Object object = new  Object();
			int h =object.hashCode();
			CyclicBarrier barrier = new CyclicBarrier(9);
			CountDownLatch countDownLatch = new CountDownLatch(8);
			Semaphore semaphore =  new Semaphore(4);
			ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
			Map<Integer, String> map2 = map;
			
					
			System.out.println(h);
			int k=h>>>16;
			System.out.println(k);
			System.out.println(h^k);
			
			
	}

}
