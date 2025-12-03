package com.vec.training.trng;

import java.util.*;
import java.util.stream.Collectors;

public class filteringFM {

    static class Blog {
        private String authorName;
        private List<String> comments;

        public Blog(String authorName, String... comments) {
            this.authorName = authorName;
            this.comments = List.of(comments);
        }

        public String getAuthorName() {
            return authorName;
        }

        public List<String> getComments() {
            return comments;
        }

        @Override
        public String toString() {
            return "Blog{" +
                   "authorName='" + authorName + '\'' +
                   ", comments=" + comments +
                   '}';
        }
    }

    public static void main(String[] args) {
        List<Blog> blogs = List.of(
            new Blog("Alice", "Nice", "Very Nice"),
            new Blog("Bob", "Disappointing", "Ok", "Could be better"),
            new Blog("Carol", "Great!", "Loved it", "Awesome")
        );

        // 1) flatMapping: flatten comments per author
        Map<String, List<String>> authorCommentsFlat = blogs.stream()
            .collect(Collectors.groupingBy(
                Blog::getAuthorName,
                Collectors.flatMapping(
                    blog -> blog.getComments().stream(),
                    Collectors.toList()
                )
            ));

        System.out.println("flatMapping result:");
        authorCommentsFlat.forEach((author, comments) ->
            System.out.printf("  %s -> %s%n", author, comments)
        );

        // 2) filtering: only keep comments containing "Nice"
        Map<String, List<String>> authorCommentsFiltered = blogs.stream()
            .collect(Collectors.groupingBy(
                Blog::getAuthorName,
                Collectors.flatMapping(
                    blog -> blog.getComments().stream(),
                    Collectors.filtering(
                        comment -> comment.contains("Nice"),
                        Collectors.toList()
                    )
                )
            ));

        System.out.println("\nfiltering result:");
        authorCommentsFiltered.forEach((author, comments) ->
            System.out.printf("  %s -> %s%n", author, comments)
        );
    }
}
