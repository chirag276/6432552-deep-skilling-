import React from 'react';
import CounterComponent from './components/CounterComponent';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  return (
    <div style={{ padding: '20px' }}>
      <h1>React Event Handling Examples</h1>
      <CounterComponent />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
