import React from 'react';
import './App.css';

function App() {
  const officeList = [
    {
      name: 'DBS',
      rent: 50000,
      address: 'Chennai',
      image: 'https://images.unsplash.com/photo-1570129477492-45c003edd2be?auto=format&fit=crop&w=500&q=60'
// static image
    },
    {
      name: 'Regus',
      rent: 65000,
      address: 'Hyderabad',
      image: 'https://picsum.photos/id/1015/600/300'
    },
    {
      name: 'WeWork',
      rent: 80000,
      address: 'Mumbai',
      image: 'https://picsum.photos/id/1016/600/300'
    },
    {
      name: 'SmartWorks',
      rent: 45000,
      address: 'Pune',
      image: 'https://picsum.photos/id/1018/600/300'
    }
  ];

  // Show only first affordable office
  const affordableOffice = officeList.find(office => office.rent < 60000);

  return (
    <div className="App">
      <h1>Office Space , at Affordable Range</h1>

      {affordableOffice ? (
        <div>
          <img
            src={affordableOffice.image}
            alt={affordableOffice.name}
            style={{ width: '350px', height: '200px', borderRadius: '10px', marginBottom: '10px' }}
          />
          <p><strong>Name:</strong> {affordableOffice.name}</p>
          <p style={{ color: 'red', fontWeight: 'bold' }}>
            Rent: Rs. {affordableOffice.rent}
          </p>
          <p><strong>Address:</strong> {affordableOffice.address}</p>
        </div>
      ) : (
        <p>No affordable office found.</p>
      )}
    </div>
  );
}

export default App;
