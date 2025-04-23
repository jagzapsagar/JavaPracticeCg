**URL:** `POST /rewards/add`  
**Description:** Adds a new transaction for a customer.

**Request Example:**
```json
{
  "customerId": 101,
  "customerName": "Amit",
  "amount": 120.50,
  "transactionDate": "2025-04-08T10:30:00"
}



```text
reward-points-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── rewardpointapi/
│   │   │               ├── controller/
│   │   │               │   └── RewardController.java
│   │   │               ├── dto/
│   │   │               │   ├── RewardDTO.java
│   │   │               │   └── TransactionRequestDTO.java
│   │   │               ├── entity/
│   │   │               │   └── Transaction.java
│   │   │               ├── exception/
│   │   │               │   ├── GlobalExceptionHandler.java
│   │   │               │   ├── NoTransactionDataFoundException.java
│   │   │               │   └── ResourceNotFoundException.java
│   │   │               ├── repository/
│   │   │               │   └── TransactionRepository.java
│   │   │               ├── service/
│   │   │               │   ├── RewardService.java
│   │   │               │   └── RewardServiceImpl.java
│   │   │               └── RewardPointsApiApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── rewardpointapi/
│                       ├── RewardControllerTest.java
│                       ├── RewardServiceTest.java
│                       └── RewardPointsApiApplicationTests.java
├── .gitignore
├── pom.xml
└── README.md
```
