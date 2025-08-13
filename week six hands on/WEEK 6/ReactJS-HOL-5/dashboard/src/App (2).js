import React from 'react';
import './App.css';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    { name: 'React Basics', status: 'ongoing', startDate: '2025-06-01', endDate: '2025-08-01' },
    { name: 'Advanced Node', status: 'completed', startDate: '2025-04-01', endDate: '2025-06-01' }
  ];

  return (
    <div className="App">
      <h1>Cohort Dashboard</h1>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
