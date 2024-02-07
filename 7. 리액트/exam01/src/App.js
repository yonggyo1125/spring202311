import MyComponent from './components/MyComponent2';

const App = () => {
  const name = '이이름';
  return (
    <MyComponent name={name} age={30}>
      반갑습니다.
    </MyComponent>
  );
};

export default App;
