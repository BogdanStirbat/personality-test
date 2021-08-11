# Personality test

This application allows you to take personality tests. Are modeled after [this](https://www.psychologies.co.uk/self/are-you-an-introvert-or-an-extrovert.html) quiz.

This app consists of 2 parts:
 - a backend app, in the backend folder, implemented unsing Spring Boot and H2 in memory DB
 - a frontend app, in the frontend folder, implemnted using React.

 To start the app, first start the backend app, then the frontend app.

 To start the backend app, go to folder `backend/personalitytest`, and run:
  - `mvn clean install`
  - `java -jar target/personalitytest-0.0.1-SNAPSHOT.jar`

  An backend REST API, on port 8080, will start.

  To start the frontend app, go to folder `frontend/personality-test`, and run:
   - `npm start`

   You can visit [this](http://localhost:3000/) url to use the app.