# Unhandled Exception in Scala Class

This repository demonstrates a common error in Scala: failing to handle exceptions that might be thrown by a class's methods. The `MyClass` example has an `age_=` method that throws an `IllegalArgumentException` if a negative age is provided. However, the `Main` object that uses `MyClass` doesn't include any exception handling. 

The solution provided shows how to properly handle the exception using a `try-catch` block.