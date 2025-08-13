import React, { Component } from 'react';

class CounterComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
  };

  sayHello = () => {
    console.log('Hello from Event Handler!');
  };

  handleIncrement = () => {
    this.increment();
    this.sayHello();
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayWelcome = (message) => {
    alert(message);
  };

  handleSyntheticEvent = (e) => {
    e.preventDefault();
    alert('I was clicked');
  };

  render() {
    return (
      <div style={{ marginBottom: '30px' }}>
        <h2>Counter Example</h2>
        <p>Count: {this.state.count}</p>
        <button onClick={this.handleIncrement}>Increase</button>
        <button onClick={this.decrement}>Decrease</button>
        <br /><br />
        <button onClick={() => this.sayWelcome('Welcome to the Event App!')}>Say Welcome</button>
        <br /><br />
        <button onClick={this.handleSyntheticEvent}>Synthetic Event - OnPress</button>
      </div>
    );
  }
}

export default CounterComponent;
