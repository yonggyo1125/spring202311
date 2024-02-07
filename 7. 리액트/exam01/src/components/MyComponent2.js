const MyComponent2 = ({name, age}) => {
  //const { name, age } = props;

  return (
    <>
      <div>나의 멋진 컴포넌트</div>
      <div>{name}님 안녕하세요.</div>
      <div>나이는 {age}</div>
    </>
  );
};

export default MyComponent2;
