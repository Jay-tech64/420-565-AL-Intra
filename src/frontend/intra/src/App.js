import React, { useState } from "react";
import { addTwoNumber } from "./services/ArithmeticService";

const App = () => {
  const [addOne, setAddOne] = useState("");
  const [addTwo, setAddTwo] = useState("");
  const [addResult, setAddResult] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    addTwoNumber(addOne, addTwo)
      .then(({ data }) => setAddResult(data.result))
      .catch((err) => console.log(err));
  };

  return (
    <div>
      <div>
        <h1>Examen Intra</h1>
        <h2>Calculatrice web</h2>
      </div>
      <form onSubmit={handleSubmit}>
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
