# 🛡️ Data_Structures_Gatekeeper: Diagnostic Readiness Check

![Java Version](https://img.shields.io/badge/Java-8%2B-007396?style=for-the-badge&logo=java&logoColor=white)
![Build Status](https://img.shields.io/badge/Status-Passing-success?style=for-the-badge)
![Academic Level](https://img.shields.io/badge/Target-CS%202nd--Year-orange?style=for-the-badge)

> *"Array sequence out of bounds. Conditional branch corrupted. Human override initiated..."*

This repository contains the solution for the **Data Structure Readiness Check**, a foundational Java diagnostic program designed to verify memory manipulation, algorithmic logic, and modular software design before advancing to complex data structures.

---

## 🎯 Objective & Requirements

The primary goal of this utility is to demonstrate foundational Java control flow and clean architectural decomposition without relying on high-level collections libraries (`ArrayList`, `Vector`, etc.).

### 📋 Technical Constraints Checklist
- [x] **Sequential Storage:** Primary memory handled via raw primitives (`int[]`).
- [x] **Iteration:** Employs multiple loop structures (`for-each` and indexed `for`).
- [x] **Conditional Logic:** Filters data using modulus branching (`if (value % 2 == 0)`) and safeguards against edge cases.
- [x] **Modular Architecture:** Fully decoupled program logic across distinct, parameterized utility methods.
- [x] **Defensive Programming:** Built-in dynamic array allocation based on filtered output sizing and `null`/empty array guards.

---

## 🏗️ System Architecture

The solution uses a two-pass strategy to dynamically allocate memory for primitive arrays without wasting space or needing dynamic data structure overhead.

```mermaid
flowchart TD
    A[main Method] -->|Passes raw array| B[extractEvenNumbers]
    B --> C{Null or Empty Check}
    C -- Valid --> D[Pass 1: Count Matching Elements]
    C -- Invalid --> E[Return Empty Array]
    D --> F[Allocate Exact Output Array Size]
    F --> G[Pass 2: Populate Filtered Elements]
    G --> H[Return Processed int Array]
    H --> A
    A -->|Passes array| I[printArray Helper]
    I --> J[Output to Console]