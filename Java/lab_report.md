# Gilded Rose Refactoring Summary

## Original Design

The initial implementation of the Gilded Rose system was highly centralized, with the `GildedRose` class managing all logic for updating the properties of items. Key characteristics of this design included:

- **Single Responsibility Violation**:

  - The `GildedRose` class was responsible for managing inventory updates across all item types, leading to a tightly coupled and complex method: `updateQuality()`.

- **Conditional Logic**:

  - Item-specific rules were implemented using conditional checks (`if` statements and string comparisons) to differentiate between types of items, such as "Aged Brie" or "Sulfuras."

- **Challenges**:

  - Difficult to extend: Adding new item types required modifying the existing `updateQuality()` logic.
  - Reduced maintainability: The large and complex method was hard to test and understand.


## Refactored Design

### Key Changes

1. **Delegation to Specific Classes**:

   - Refactored the `GildedRose` class to delegate item update logic to dedicated subclasses, improving modularity and alignment with the **Single Responsibility Principle**.

2. **Abstract Class for Items**:

   - Introduced an abstract `Item` class, encapsulating shared properties (`name`, `sellIn`, `quality`) and defining an abstract method `update()` for item-specific behavior.

   ```java
   public abstract class Item {
       protected String name;
       protected int sellIn;
       protected int quality;

       public abstract void update();
   }
   ```

3. **Subclasses for Specific Item Types**:

   - Created subclasses to handle different categories of items:
     - `LegendaryItem`: For items like "Sulfuras" that do not degrade in quality.
     - `ClassicItem`: For regular items with standard quality degradation rules.
     - `TimeSensitiveItem`: For items like "Aged Brie" or "Backstage Passes" with unique evolution patterns over time.

4. **Adherence to Open/Closed Principle**:

   - The refactored design enables easy addition of new item types by creating a new subclass without modifying existing logic.

### Benefits

The refactored design enhances maintainability, extensibility, and testability. Smaller, more focused classes and methods improve readability and ease of maintenance. Adding new rules is straightforward, as it involves creating new subclasses without modifying existing code, reducing the risk of introducing bugs. Furthermore, item-specific behaviors are isolated, allowing for targeted and effective testing of each item type.

---

## Testing Enhancements

1. **Comprehensive Test Suite**:

   - Tests now validate the behavior of all item types, including edge cases such as quality bounds (0 to 50).

2. **Regression Prevention**:

   - Ensured that tests cover all existing behaviors, preventing unintended changes during future refactoring.

---

## Summary of Improvements

- **Code Structure**:

  - From a monolithic design to a modular, object-oriented structure.

- **Ease of Maintenance**:

  - Simplified updates and modifications due to clear separation of concerns.

- **Future-Proofing**:

  - Adding a new item rule now involves extending the `Item` class, which reduces risk and effort compared to modifying a central method.

- **Testing**:

  - A robust test suite ensures correctness and minimizes the risk of introducing errors.

