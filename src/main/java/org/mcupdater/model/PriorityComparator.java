package org.mcupdater.model;

import java.util.Comparator;

public class PriorityComparator implements Comparator<PrioritizedURL> {
	@Override
	public int compare(PrioritizedURL o1, PrioritizedURL o2) {
		if (o1.getPriority() == o2.getPriority()) {
			return o1.getUrl().compareTo(o2.getUrl());
		} else {
			return Integer.valueOf(o1.getPriority()).compareTo(Integer.valueOf(o2.getPriority()));
		}
	}
}
