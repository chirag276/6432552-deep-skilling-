import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState('');

  const handleChange = (e) => {
    setRupees(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const euroValue = parseFloat(rupees) / 90;
    setEuros(euroValue.toFixed(2));
  };

  return (
    <div>
      <h2>Currency Convertor (INR to EUR)</h2>
      <form onSubmit={handleSubmit}>
        <label>Enter Rupees: </label>
        <input type="number" value={rupees} onChange={handleChange} required />
        <button type="submit">Convert</button>
      </form>
      <p>Converted Value: €{euros}</p>
    </div>
  );
};

export default CurrencyConvertor;
