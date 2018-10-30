Minimal setup:

- Execute the global build via `gradlew build`
- Deploy the EAR from `ear/build/libs` inside Glassfish, e.g., copy to `%GLASSFISH_HOME%\glassfish\domains\domain1\autodeploy`
- Open `http://localhost:8080/frontend` to see the initial UI of the frontend project
