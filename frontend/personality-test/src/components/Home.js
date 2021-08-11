import React from 'react'

function Home(props) {

  return (
    <div className="centered">
      <h1>Personality Test</h1>

      <div className="content">
        <p>Are you an extrovert or an introvert? Do the test to find out!</p>

        <div className="actions">
          <div className="btn primary">Start the test</div>
        </div>
      </div>

    </div>
  )
}

export default Home