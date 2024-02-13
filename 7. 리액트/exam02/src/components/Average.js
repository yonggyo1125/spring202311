import { useState } from 'react';

const Average = () => {
  const [number, setNumber] = useState(0);
  const [list, setList] = useState([]);

  const onChange = (e) => setNumber(parseInt(e.currentTarget.value));
  const onClick = () => {
    setList(list.concat([number]));
    setNumber('');
  };

  return (
    <div>
      <div>
        <input type="number" onChange={onChange} value={number} />
        <button type="button" onClick={onClick}>
          평균구하기
        </button>
      </div>
      <ul>
        {list.map((number, i) => (
          <li key={i}>{number}</li>
        ))}
      </ul>
      <div>평균 : </div>
    </div>
  );
};

export default Average;
