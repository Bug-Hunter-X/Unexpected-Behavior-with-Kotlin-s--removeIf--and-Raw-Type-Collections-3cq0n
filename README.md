# Kotlin Code Errors: `removeIf` and Raw Types

This repository demonstrates two uncommon but potentially problematic scenarios in Kotlin:

1. **Incorrect usage of `removeIf`:** Modifying a list while iterating over it using `removeIf` can lead to unexpected behavior due to shifting indices.
2. **Use of raw types with collections:**  Employing raw types in collections avoids type safety and produces unchecked warnings and potential ClassCastException exceptions at runtime.

The included code samples illustrate both issues and show how to address them correctly.
