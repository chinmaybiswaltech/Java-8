package com.java8.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		 Movie m1=new Movie("Inception",110);
		    Movie m2=new Movie("GodFather",200);
		    Movie m3=new Movie("Forest Gump",130);
		    Movie m4=new Movie("Avengers",150);
		 
		    List<Movie> listOfMovies = new ArrayList<>();
		    listOfMovies.add(m1);
		    listOfMovies.add(m2);
		    listOfMovies.add(m3);
		    listOfMovies.add(m4);

		   System.out.println("Before sorting by name");
		   for(Movie movie : listOfMovies) {
			   System.out.println(movie.getMovieName());
		   }
		   
		   System.out.println("Sort by name using Anonymous comparator");
		   Collections.sort(listOfMovies, new Comparator<Movie>() {
			   @Override
			   public int compare(Movie m1, Movie m2) {
				   return m1.getMovieName().compareTo(m2.getMovieName());
			   }
		   });
		   
		   for(Movie movie : listOfMovies) {
			   System.out.println(movie.getMovieName());
		   }
		   
		   System.out.println("Sort by name using lambda expression");
		   Collections.sort(listOfMovies, (o1,o2)->o1.getMovieName().compareTo(o2.getMovieName()));
		   
		   for(Movie movie : listOfMovies) {
			   System.out.println(movie.getMovieName());
		   }
	}

}
