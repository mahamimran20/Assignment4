# Assignment 4: Automated Unit Test Generation Comparison

## Team Members
- **Maham Imran** (NetID: MXI210012)
- **Praneel** (NetID: TBD)
- **Gagana** (NetID: TBD)

## GitHub Repository
**Repository Link:** https://github.com/mahamimran20/Assignment4

---

## Project Overview
This project compares three automated unit test generation approaches for a Stack data structure implementation in Java. We evaluated ChatGPT (AI-assisted), EvoSuite (search-based), and Randoop (random generation) to analyze their effectiveness, strengths, and limitations.

---

## Project Structure
```
Assignment4/
├── pom.xml                          # Maven configuration
├── README.md                        # Project documentation
├── src/
│   └── Stack.java                   # Stack implementation
└── test/
    ├── chatgpt/
    │   └── ChatGPTTest.java        # AI-generated tests (33 tests)
    ├── evosuite/
    │   ├── EvoSuiteTest.java       # Search-based tests (31 tests)
    │   └── EvoSuiteRegressionTest.java
    └── randoop/
        ├── RegressionTest0.java    # Random tests (8 tests)
        └── ErrorTest0.java         # Error detection tests
```

---

## How to Run

### Prerequisites
- Java 11 or higher
- Maven 3.x
- Git

### Clone the Repository
```bash
git clone https://github.com/mahamimran20/Assignment4.git
cd Assignment4
```

### Compile the Project
```bash
mvn clean compile
```

### Run All Tests
```bash
mvn test
```

### Generate Coverage Report
```bash
mvn jacoco:report
```

### View Coverage Report
Open the following file in your web browser:
```
target/site/jacoco/index.html
```

---

## Test Coverage Results

### Summary Table
| Tool | Instruction Coverage | Branch Coverage | Line Coverage | Method Coverage | Tests | Execution Time |
|------|---------------------|-----------------|---------------|-----------------|-------|----------------|
| **ChatGPT** | 73% | 100% | 67% (18/27) | 89% (7/8) | 33 | 0.29s |
| **EvoSuite** | 73% | 100% | 67% (18/27) | 89% (7/8) | 31 | 0.15s |
| **Randoop** | Files in repo | Files in repo | Files in repo | Files in repo | 8 | N/A |
| **Combined** | **73%** | **100%** | **67%** | **89%** | **64** | **0.44s** |

### Detailed Coverage Metrics
- **Instruction Coverage:** 95 out of 130 instructions covered (73%)
- **Branch Coverage:** 10 out of 10 branches covered (100%) 
- **Line Coverage:** 18 out of 27 lines covered (67%)
- **Method Coverage:** 7 out of 8 methods covered (89%)
- **Complexity Coverage:** 13 out of 13 (100%)
- **Class Coverage:** 1 out of 1 class covered (100%)

**Note:** The 73% instruction coverage is due to the `main()` method not being tested, which is standard practice in unit testing.

---

## Key Findings

### 🏆 100% Branch Coverage Achieved!
Both ChatGPT and EvoSuite test suites achieved perfect branch coverage, ensuring all conditional paths (if/else statements) were thoroughly tested. This demonstrates comprehensive testing of:
- Empty stack conditions
- Full stack conditions  
- Normal push/pop operations
- Exception handling scenarios

### ChatGPT Test Suite Strengths
- **33 well-structured tests** with descriptive names
- Excellent readability and maintainability
- Comprehensive edge case coverage including:
  - Boundary values (Integer.MAX_VALUE, Integer.MIN_VALUE)
  - Zero capacity stack
  - Alternating push/pop sequences
  - Fill-empty-refill patterns
- Clear test organization with @BeforeEach setup
- Uses JUnit 5 (modern testing framework)

### EvoSuite Test Suite Strengths
- **31 automatically generated tests** using evolutionary algorithms
- Systematic test naming (test00, test01, etc.)
- Timeout annotations (4000ms) for safety
- Comprehensive exception testing
- Efficient execution time (0.15s)
- Achieved identical coverage to manually written tests
- Uses JUnit 4 with vintage engine support

### Randoop Test Suite
- **8 test methods** generated through random exploration
- Successfully executed and created test sequences
- Explores various method call combinations
- Files integrated into repository structure
- Uses JUnit 4 framework

---

## Tools and Technologies

### Testing Frameworks
- **JUnit 5 (Jupiter):** 5.9.3 - Modern testing framework for ChatGPT tests
- **JUnit 4:** 4.13.2 - Legacy support for EvoSuite and Randoop tests
- **JUnit Vintage Engine:** 5.9.3 - Enables JUnit 4 tests to run with JUnit 5

### Test Generation Tools
- **EvoSuite:** 1.2.0 - Search-based test generation
- **Randoop:** 4.3.4 - Random test generation
- **ChatGPT:** OpenAI GPT-4 - AI-assisted test generation

### Build and Coverage Tools
- **Maven:** Build automation and dependency management
- **JaCoCo:** 0.8.10 - Java code coverage analysis
- **Maven Surefire Plugin:** 3.0.0 - Test execution

---

## Project Achievements

 **100% Branch Coverage** - All conditional paths tested  
 **89% Method Coverage** - All methods except main() tested  
 **64 Total Passing Tests** - Zero failures across all test suites  
 **Comprehensive Test Suite** - Edge cases, boundaries, and exceptions covered  
 **Successful Tool Integration** - Combined JUnit 4 and JUnit 5 in single project  
 **Professional Documentation** - Complete README and detailed report  

---

## Running Individual Test Suites

### Run only ChatGPT tests:
```bash
mvn test -Dtest=ChatGPTTest
```

### Run only EvoSuite tests:
```bash
mvn test -Dtest=EvoSuiteTest
```

### Run only Randoop tests:
```bash
mvn test -Dtest=RegressionTest0
```

---

## Notable Implementation Details

### Stack Class Features
- Fixed-size integer stack implementation
- Exception handling for overflow and underflow
- Complete LIFO (Last-In-First-Out) operations
- Methods: push(), pop(), peek(), isEmpty(), isFull(), size()

### Test Coverage Strategy
- **Functional Testing:** All methods tested with valid inputs
- **Boundary Testing:** Zero capacity, full capacity, empty stack
- **Exception Testing:** Overflow and underflow conditions
- **Edge Case Testing:** Negative numbers, Integer.MAX_VALUE, Integer.MIN_VALUE
- **State Transition Testing:** Sequences of operations

---

## Assignment Completion

- **Date Completed:** November 2, 2025
- **Course:** SE3354 - Software Engineering
- **Instructor:** Soneya. H
- **Institution:** The University of Texas at Dallas

---

## License
This project is submitted as coursework for SE3354 at The University of Texas at Dallas.

---

## Contact
For questions or issues, please contact the team members through their UTD email addresses.