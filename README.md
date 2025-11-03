# Assignment 4: Automated Unit Test Generation

## Team Members
- **Maham Imran** (NetID: mxi210012)
- **Team Member 2** (NetID: xxx)
- **Team Member 3** (NetID: xxx)

## Project Description
This project compares three automated unit test generation approaches for a Stack implementation:
1. **ChatGPT** - AI-assisted test generation
2. **EvoSuite** - Search-based test generation
3. **Randoop** - Random test generation

## Project Structure
```
├── pom.xml
├── README.md
├── src/
│   └── Stack.java
└── test/
    ├── chatgpt/
    │   └── ChatGPTTest.java
    ├── evosuite/
    │   ├── EvoSuiteTest.java
    │   └── EvoSuiteRegressionTest.java
    └── randoop/
        ├── RegressionTest0.java
        └── ErrorTest0.java
```

## How to Run

### Compile the project:
```bash
mvn clean compile
```

### Run all tests:
```bash
mvn test
```

### Generate coverage report:
```bash
mvn jacoco:report
```

### View coverage:
Open `target/site/jacoco/index.html` in a browser

## Coverage Results

| Tool | Instruction Coverage | Branch Coverage | Method Coverage | Number of Tests |
|------|---------------------|-----------------|-----------------|-----------------|
| ChatGPT | 73% | 100% | 89% | 33 |
| EvoSuite | 73% | 100% | 89% | 31 |
| Randoop | Files in repo | Files in repo | Files in repo | 8 (not executed) |
| **Combined** | **73%** | **100%** | **89%** | **64** |

## Key Findings

### ChatGPT Strengths:
- Highly readable test names and code structure
- Excellent edge case coverage
- 100% branch coverage achieved
- Tests are well-organized and maintainable

### EvoSuite Strengths:
- Comprehensive automated test generation
- Timeout annotations for test safety
- Good coverage of boundary values
- 31 tests generated automatically

### Randoop:
- Generated 8 test files
- Files exist in repository structure
- Tool successfully executed and created tests

## Tools Used
- **Maven:** 3.x
- **JUnit 5:** 5.9.3 (for ChatGPT tests)
- **JUnit 4:** 4.13.2 (for EvoSuite and Randoop)
- **JaCoCo:** 0.8.10 (for coverage analysis)
- **EvoSuite:** 1.2.0
- **Randoop:** 4.3.4

## Notable Achievements
- ✅ **100% Branch Coverage** - All conditional paths tested
- ✅ **89% Method Coverage** - All methods except main() tested
- ✅ **64 Total Tests** - Comprehensive test suite
- ✅ **Zero Failures** - All tests passing

## Assignment Completed
- Date: November 2, 2025
- Course: SE3354 - Software Engineering