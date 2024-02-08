import { Component } from 'react';

class LifeCycle extends Component {
  state = {
    number: 0,
    color: 'black',
  };

  static getDerivedStateFromProps(nextProps, prevState) {}

  render() {
    const { number, color } = this.state;
    return (
      <>
        <h1>{number}</h1>
        <h2>{color}</h2>
        <button
          type="button"
          onClick={() => this.setState({ number: number - 1, color })}
        >
          -1
        </button>
        <button
          type="button"
          onClick={() => this.setState({ number: number + 1, color })}
        >
          +1
        </button>
      </>
    );
  }
}
