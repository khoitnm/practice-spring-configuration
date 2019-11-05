# Introduction
This is the demo to show when test cases re-use the same Spring Context.
In this demo, you'll see there are 3 test cases.
- `Test01_ShareContext`
- `Test02_ShareContext`
- `Test03_DifferentContext`

When running `mvn clean install`, it will run all 3 test cases.
Then you'll see that the Spring Context starts 2 times (the log shows `Application finished starting` 2 times) because Test01 & Test02 share the same Spring Context, while Test03 uses a different Spring Context.

Please view more about `Context Caching` in https://docs.spring.io/spring/docs/current/spring-framework-reference/testing.html#testcontext-ctx-management-caching 