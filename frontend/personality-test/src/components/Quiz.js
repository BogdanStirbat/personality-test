import React, { useContext } from 'react'
import Axios from 'axios'

import StateContext from '../context/StateContext'
import DispatchContext from '../context/DispatchContext'
import axios from 'axios'

function Quiz(props) {

  const state = useContext(StateContext)
  const dispatch = useContext(DispatchContext)

  async function restartQuiz() {

    try {
      await Axios.delete("http://localhost:8080/quizzes/" + state.quizId,
                        {
                          headers: {
                            'Content-Type': 'application/json'
                          }
                        })
    } catch(e) {
      console.log("Error deleting quiz")
      console.log(e)
    }

    dispatch({type: "quizRestart"})
  }

  return (
    <div className="centered">
      <h1>Personality Test</h1>

      <div className="content center-left">
        <p className="question">You’re really busy at work and a colleague is telling you their life story and personal woes. You:</p>

        <div className="variants center-left">
          <div className="variant">
            <div className="circle"></div>
            <p>Don’t dare to interrupt them</p>
          </div>
          <div className="variant selected">
            <div className="circle"></div>
            <p>Think it’s more important to give them some of your time; work can wait</p>
          </div>
          <div className="variant">
            <div className="circle"></div>
            <p>Listen, but with only with half an ear</p>
          </div>
          <div className="variant">
            <div className="circle"></div>
            <p>Interrupt and explain that you are really busy at the moment</p>
          </div>
        </div>

        <div className="actions">
          <div className="multiple-buttons">
            <div className="btn primary">Answer</div>
            <div onClick={restartQuiz} className="btn secundary">Restart test</div>
          </div>
        </div>
      </div>
    
    </div>
  )
}

export default Quiz