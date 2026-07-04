# Test-Driven Development (TDD)

## Overview

Test-Driven Development (TDD) is a software development approach in which test cases are written **before** writing the actual application code. The goal is to ensure that the code meets the required functionality and remains reliable throughout development.

---

## TDD Cycle (Red → Green → Refactor)

### 🔴 Red
- Write a test case.
- The test fails because the implementation does not exist yet.

### 🟢 Green
- Write the minimum code required to make the test pass.

### 🔵 Refactor
- Improve and clean the code without changing its behavior.
- Run all tests again to ensure they still pass.

---

## Advantages of TDD

- Improves code quality
- Detects bugs early
- Encourages clean and modular code
- Makes refactoring safer
- Increases developer confidence
- Provides better test coverage

---

## TDD vs Traditional Testing

| Test-Driven Development (TDD) | Traditional Testing |
|-------------------------------|---------------------|
| Tests are written before code | Tests are written after code |
| Follows Red → Green → Refactor | Testing is done after implementation |
| Helps prevent bugs early | Bugs are detected later |
| Promotes better code design | Focuses mainly on verifying completed code |

---

## JUnit

JUnit is a Java testing framework used to write and execute unit tests.

### Common Annotations

- `@Test`
- `@BeforeEach`
- `@AfterEach`
- `@BeforeAll`
- `@AfterAll`

### Common Assertions

- `assertEquals()`
- `assertTrue()`
- `assertFalse()`
- `assertNull()`
- `assertNotNull()`
- `assertThrows()`

---

## Mockito

Mockito is a Java framework used to create mock objects for unit testing.

### Features

- Mocking
- Stubbing
- Verification
- Dependency Isolation

### Common Methods

- `mock()`
- `when()`
- `thenReturn()`
- `verify()`

---

## Important Concepts

### Mocking
Creating a fake object that simulates the behavior of a real object.

### Stubbing
Specifying what value a mocked method should return.

### Verification
Checking whether a method was called during the test.

---

## Technologies Used

- Java
- JUnit 5
- Mockito

---

## Status

✅ Completed
