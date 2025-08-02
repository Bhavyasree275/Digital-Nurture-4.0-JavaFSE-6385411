import React, { useState } from 'react';
import './App.css';

function App() {
  const [count, setCount] = useState(0);
  const [memberNumber, setMemberNumber] = useState(1);
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleIncrement = () => {
    setCount(prev => prev + 1);
    alert(`Hello! Member${memberNumber}`);
    setMemberNumber(prev => prev + 1);
  };

  const handleDecrement = () => {
    setCount(prev => prev - 1);
  };

  const sayWelcome = () => {
    alert('welcome');
  };

  const handleClick = () => {
    alert('I was clicked');
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (currency.toLowerCase() === 'euro') {
      const converted = parseFloat(amount) * 80; // Conversion rate: 1 EUR = 80 INR
      alert(`Converting to Euro Amount is ${converted}`);
    } else {
      alert('Currency not supported');
    }
  };

  return (
    <div className="App">
      <h2>{count}</h2>
      <button onClick={handleIncrement}>Increment</button><br />
      <button onClick={handleDecrement}>Decrement</button><br />
      <button onClick={sayWelcome}>Say welcome</button><br />
      <button onClick={handleClick}>Click on me</button>

      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>

      <form onSubmit={handleSubmit}>
        <label>
          Amount: &nbsp;
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
            required
          />
        </label>
        <br /><br />
        <label>
          Currency: &nbsp;
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
            required
          />
        </label>
        <br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default App;
