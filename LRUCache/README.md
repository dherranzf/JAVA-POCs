# 🚀 LRUCache – Java

## What does it do?

- Implements a simple LRU (Least Recently Used) cache using `LinkedHashMap`.
- Stores key-value pairs (`String` → `Object`).
- Automatically evicts the least recently used entry when capacity is exceeded.

## Why is it relevant?

- LRU caches are a classic topic for discussing data structures, memory management, and performance.
- Shows understanding of Java collections, especially `LinkedHashMap` and its ordering features.
- Demonstrates ability to write concise, readable, and efficient code.
- For concurrent environments, consider using `ConcurrentLinkedHashMap`.

## Example

```java
LRUCache cache = new LRUCache(3);
cache.put("a", 1);
cache.put("b", 2);
cache.put("c", 3);
cache.get("a"); // Access 'a', now 'b' is the least recently used
cache.put("d", 4); // Evicts 'b'
```

## Senior Talking Points

- Why use `LinkedHashMap` for LRU? How does access order work?
- How would you make LRUCache thread-safe?
- What about generics and type safety?
- Real-world use: caching, session management, resource pools.

## Requirements

- Java 8 or higher

---