/**
 * 
 */
package com.manish.service;

import java.util.List;

import com.manish.io.Job;

/**
 * @author mbhardw
 *
 */
public interface JobSchedulerService {
	/**
	 * 
	 * @param threadCount
	 * @param job
	 */
	void shortestJobFirst(int threadCount, List<Job> job);

	/**
	 * 
	 * @param threadCount
	 * @param job
	 */
	void firstComeFirstServe(int threadCount, List<Job> job);

	/**
	 * 
	 * @param threadCount
	 * @param job
	 */
	void fixedPriorityScheduling(int threadCount, List<Job> job);

	/**
	 * 
	 * @param threadCount
	 * @param job
	 */
	void earliestDeadlineFirst(int threadCount, List<Job> job);

}
