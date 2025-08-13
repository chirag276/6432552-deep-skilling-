import React from 'react';

function App() {
  const officeSpaces = [
    {
      name: 'Regus Workspaces',
      rent: 75000,
      address: 'MG Road, Bangalore',
      image: 'https://via.placeholder.com/300x200?text=Regus'
    },
    {
      name: 'WeWork',
      rent: 55000,
      address: 'Indiranagar, Bangalore',
      image: 'https://via.placeholder.com/300x200?text=WeWork'
    },
    {
      name: 'Smartworks',
      rent: 62000,
      address: 'Koramangala, Bangalore',
      image: 'https://via.placeholder.com/300x200?text=Smartworks'
    }
  ];

  return (
    <div style={{ padding: '20px' }}>
      <h1>Office Space Rental Listings</h1>
      {officeSpaces.map((office, index) => (
        <div key={index} style={{ border: '1px solid #ccc', margin: '10px 0', padding: '10px' }}>
          <img src={office.image} alt={office.name} style={{ width: '300px', height: '200px' }} />
          <h2>{office.name}</h2>
          <p><strong>Address:</strong> {office.address}</p>
          <p>
            <strong>Rent:</strong>{' '}
            <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
              ₹{office.rent}
            </span>
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
