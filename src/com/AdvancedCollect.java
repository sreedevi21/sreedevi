package com;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.model.Employee;

public class AdvancedCollect {

	public static void main(String[] args) {
		/// toColletion
		/*
		 * String[] empList = { "c", "c++", "spring" };
		 * 
		 * Vector<String> empNames =
		 * Stream.of(empList).collect(Collectors.toCollection(AdvancedCollect::vector));
		 * System.out.println(empNames);
		 * 
		 * System.out.println(Stream.of(empList).collect(Collectors.toCollection(
		 * AdvancedCollect::list)));
		 */
		/// summarizingDouble
		/*
		 * Double[] empIds = { 1.2, 1.0, 3.0, 4.5 }; DoubleSummaryStatistics stats =
		 * Stream.of(empIds).collect(Collectors.summarizingDouble(i -> i = i));
		 * System.out.println(stats.getAverage()); System.out.println(stats.getCount());
		 */

		/// partitioningBy
		/*
		 * Map<Boolean, List<Employee>> emps = getEmps().stream()
		 * .collect(Collectors.partitioningBy(e -> e.getId() % 2 == 0));
		 * System.out.println(emps.get(true));
		 */
		
		///groupingBy
		/*
		 * Map<String,List<Employee>>
		 * emps=getEmps().stream().collect(Collectors.groupingBy(e->e.getDept()));
		 * System.out.println(emps.get("eee"));
		 */
		
		///mapping
		/*
		 * Map<Object,List<Integer>>
		 * emps=getEmps().stream().collect(Collectors.groupingBy(e ->
		 * e.getDept(),Collectors.mapping(Employee::getId, Collectors.toList())));
		 * System.out.println(emps);
		 */
		
		///reducing
		Double salIncrOverhead = getEmps().stream().collect(Collectors.reducing(
		        0.0, e -> e.getSal() * 10.0 / 100, (s1, s2) -> s1 + s2));
		System.out.println(salIncrOverhead);
		
		///file read and write pending need to study

	}
public static Vector<String> vector(){
	Vector<String> v=new Vector<String>();
	v.add("sha");
	return v;
}
public static ArrayList<String> list(){
	ArrayList<String> v=new ArrayList<String>();
	v.add("java");
	return v;
}
public static List<Employee> getEmps(){
	ArrayList<Employee> list=new ArrayList<Employee>();
	list.add(new Employee(101, "shahin",100.0, "cse"));
	list.add(new Employee(102, "banu",200.0, "ece"));
	list.add(new Employee(103, "mujju",300.0, "eee"));
	list.add(new Employee(104, "yas",400.0, "ece"));
	list.add(new Employee(105, "sree",500.0, "cse"));
	return list;
}
}
