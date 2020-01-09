package com.app.core;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.Stream;
public class File {
public static void main(String[] args) throws IOException {
	Stream<String> bands=java.nio.file.Files.lines(Paths.get("F:\\JavaPrograms\\CoreJava\\Streams\bands.txt"));
	bands.sorted().filter(x->x.length()>13).forEach(System.out::print);
	bands.close();
}
}
