import React, { useState } from 'react';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const GuestPage = () => (
    <div>
      <h2>✈️ Available Flights</h2>
      <ul>
        <li>IndiGo - Hyderabad to Delhi - 10:00 AM</li>
        <li>Air India - Mumbai to Bangalore - 2:00 PM</li>
        <li>SpiceJet - Chennai to Kolkata - 6:30 PM</li>
      </ul>
    </div>
  );

  const UserPage = () => (
    <div>
      <h2>🎟️ Book Your Ticket</h2>
      <form onSubmit={(e) => {
        e.preventDefault();
        alert('Ticket booked successfully!');
      }}>
        <label>
          Select Flight:
          <select required>
            <option value="">--Choose a flight--</option>
            <option>Hyderabad to Delhi</option>
            <option>Mumbai to Bangalore</option>
            <option>Chennai to Kolkata</option>
          </select>
        </label>
        <br /><br />
        <button type="submit">Book Ticket</button>
      </form>
    </div>
  );

  return (
    <div className="App">
      <h1>Ticket Booking Portal</h1>
      <button onClick={() => setIsLoggedIn(prev => !prev)}>
        {isLoggedIn ? 'Logout' : 'Login'}
      </button>
      <hr />
      {isLoggedIn ? <UserPage /> : <GuestPage />}
    </div>
  );
}

export default App;
