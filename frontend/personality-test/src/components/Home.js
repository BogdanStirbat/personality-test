import React from 'react'
import Axios from 'axios'

function Home(props) {

  async function startQuiz() {

    try {
      const response = await Axios.post("http://localhost:8080/quizzes",
                                       {},
                                       {
                                         headers: {
                                           'Content-Type': 'application/json'
                                         }
                                       })

      console.log(response.data)
      console.log(response.data.quizId)
    } catch (e) {
      console.log("Erorr starting quiz.")
      console.log(e)
    }
  }

  return (
    <div className="centered">
      <h1>Personality Test</h1>

      <div className="content">
        <p>Are you an extrovert or an introvert? Do the test to find out!</p>

        <div className="actions">
          <div onClick={startQuiz} className="btn primary">Start the test</div>
        </div>
      </div>

    </div>
  )
}

export default Home