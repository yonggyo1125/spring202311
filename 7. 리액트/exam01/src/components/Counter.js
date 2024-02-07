import { Component } from 'react';

class Counter extends Component {
  state = {
    number: 0,
  };
  render() {
    const { number } = this.state;

    return (
      <div>
        <h1>{number}</h1>
        <button
          type="button"
          onClick={() => this.setState({ number: number - 1 })}
        >
          -1
        </button>
        <button
          type="button"
          onClick={() => this.setState({ number: number + 1 })}
        >
          +1
        </button>
      </div>
    );
  }
}

export default Counter;
