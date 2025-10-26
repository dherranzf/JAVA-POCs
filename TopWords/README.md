# TopWords – Java

## What does it do?

- Normalizes input: Converts all text to lowercase and strips punctuation.
- Tokenizes: Splits sentences into words.
- Counts frequency: Uses Java Streams to group and count word occurrences.
- Sorts and limits: Returns the top 3 words, sorted by frequency (descending) and alphabetically.

## Why is it relevant?

- Demonstrates mastery of Java Streams, lambdas, and collectors.
- Shows ability to write concise, readable, and efficient code for real-world text processing.

## Example

```java
List<String> sentences = List.of(
    "Hello world, hello!",
    "World world world.",
    "Hello Java."
);

List<Map.Entry<String, Long>> top = TopWords.top3(sentences);
// Output: [world=4, hello=3, java=1]
```

## Senior Talking Points

- Stream API: Benefits for data processing, readability, and performance.
- Extensibility: How would you handle stop words or stemming?
- Complexity: The solution is O(n) for its main operations.
- Real-world use: analytics, search engines, text mining.

## Requirements

- Java 8 or higher

---