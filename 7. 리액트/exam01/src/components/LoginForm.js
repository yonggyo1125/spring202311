import { useState } from 'react';

const LoginForm = () => {
  const [userId, setUserId] = useState('');
  const [userPw, setUserPw] = useState('');

  const onSubmit = (e) => {
    e.preventDefault();
    console.log(e);
  };

  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>아이디</dt>
        <dd>
          <input
            type="text"
            onChange={(e) => setUserId(e.currentTarget.value)}
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input
            type="password"
            onChange={(e) => setUserPw(e.currentTarget.value)}
          />
        </dd>
      </dl>
      <button type="submit">로그인</button>
    </form>
  );
};

export default LoginForm;
