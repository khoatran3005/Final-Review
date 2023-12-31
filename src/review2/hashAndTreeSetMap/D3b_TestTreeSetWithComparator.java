package review2.hashAndTreeSetMap;


import java.util.*;

import review1b.comparactor.Circle;
import review1b.comparactor.GeometricObject;
import review1b.comparactor.GeometricObjectComparator;
import review1b.comparactor.Rectangle;

public class D3b_TestTreeSetWithComparator {
	public static void main(String[] args) {
		// Create a tree set for geometric objects using a comparator

		Set<GeometricObject> set =
				new TreeSet<>(new GeometricObjectComparator());
		set.add(new Rectangle(4, 5));
		set.add(new Circle(40));
		set.add(new Circle(40));
		set.add(new Rectangle(4, 1));

		// Display geometric objects in the tree set
		System.out.println("A sorted set of geometric objects: ====");
		for (GeometricObject element: set)
			System.out.println("area = " + element.getArea());



		Set<GeometricObject> set2 =
				new TreeSet<>( (new GeometricObjectComparator()).reversed());
		set2.add(new Rectangle(4, 5));
		set2.add(new Circle(40));
		set2.add(new Circle(40));
		set2.add(new Rectangle(4, 1));

		// Display geometric objects in the tree set
		System.out.println("\nA REVERSELY sorted set of geometric objects:====");
		for (GeometricObject element: set2)
			System.out.println("area = " + element.getArea());
	}
}
