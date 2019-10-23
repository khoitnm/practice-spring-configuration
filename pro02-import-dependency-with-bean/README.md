# Overview 
In this example, the `main-module` imports dependencies `sub-module-01`, `sub-module-02`.<br/>
But the `sub-module-01` & `sub-module-02` both import the same `shared-beans`.<br/>
It means that the main-module imports dependency `shared-beans` 2 times.<br/>
Then, we want to make sure than the Spring beans inside `shared-beans` is initiated ONE time only.