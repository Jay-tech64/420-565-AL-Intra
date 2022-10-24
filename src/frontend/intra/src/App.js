import React, { useState } from "react";

const App = () => {
  const [addOne, setAddOne] = useState("");
  const [addTwo, setAddTwo] = useState("");
  const [addResult, setAddResult] = useState("");

  return (
    <div>
      <div>
        <h1>Examen Intra</h1>
        <h2>Calculatrice web</h2>
      </div>
      <form>
        <div>
          <label htmlFor="addOne">One</label>
          <input
            type="number"
            id={"addOne"}
            placeholder={"One"}
            value={addOne}
            onChange={({ target }) => setAddOne(target.value)}
          />
        </div>
        <div>
          <label htmlFor="addTwo">Two</label>
          <input
            type="number"
            id={"addTwo"}
            placeholder={"Two"}
            value={addTwo}
            onChange={({ target }) => setAddTwo(target.value)}
          />
        </div>
        <button>Additionne</button>
      </form>
      <h1>{addResult}</h1>
    </div>
  );
};

export default App;
