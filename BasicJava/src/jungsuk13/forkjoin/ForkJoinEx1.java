package jungsuk13.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinEx1 {
	static final ForkJoinPool pool = new ForkJoinPool();
	
	public static void main(String[] args) {
		long from = 1L;
		long to = 100_000_000L;
		
		SumTask task = new SumTask(from, to);
		
		long start = System.currentTimeMillis();
		Long result = pool.invoke(task);
		System.out.println("Elapsed time(6 Core): "+(System.currentTimeMillis()-start));
		
		System.out.printf("sum of %d~%d=%d\n", from, to, result);
		System.out.println();
		
		result = 0L;
		start = System.currentTimeMillis();
		for(long i=from; i<=to; i++) {
			result += i;
		}
		
		System.out.println("Elapsed time(1 Core): "+(System.currentTimeMillis()-start));
		System.out.printf("sum of %d~%d=%d\n",from, to, result);
	}
	
}

class SumTask extends RecursiveTask<Long>{
	long from, to;
	
	SumTask(long from, long to) {
		this.from = from;
		this.to = to;
	}
	
	@Override
	protected Long compute() {
		long size = to - from + 1;
		
		if(size <= 16666666) {
			return sum();
		}
		
		long half = (from+to)/2;
		
		//범위를 반으로 나눠서 두 개의 작업을 생성
		SumTask leftSum = new SumTask(from, half);
		SumTask rightSum = new SumTask(half+1, to);
		
		leftSum.fork();
		
		return rightSum.compute() + leftSum.join();
	}
	
	long sum() {
		long tmp = 0L;
		
		for(long i=from; i<=to; i++) {
			tmp += i;
		}
		return tmp;
	}
}