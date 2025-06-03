# JavaCore

This project just for fun

----

This is markdown code

## Package Overview

The source code under `src/com/` is grouped in broad areas:

- **io** – utilities for working with files and streams (copying, reading, zipping, etc.).
- **apache** and **pdf** – usage examples for external libraries such as Apache POI and PDFBox.
- **java8** – demonstrations of language features including lambdas and streams.
- **connection** and **crud** – simple JDBC connectivity and CRUD operations.
- **patterns** and **exceptions** – design pattern snippets and custom exception classes.
- **laboratory** – assorted small OOP exercises and other experiments.
- **generics** – small examples demonstrating Java generics.
- **network** – simple networking utilities using `java.net` APIs.

## Running examples

The project is built with Maven. To execute a specific example class you can use
the Maven exec plugin. For example:

```bash
mvn -q exec:java -Dexec.mainClass=com.io.file.ReadFile
```

Replace `com.io.file.ReadFile` with the fully qualified class name you want to
run.

## Sample data and configs

Sample input files used by many of the examples are stored in the
[`data/`](data/) directory. Configuration property files are located under
[`properties/`](properties/).
