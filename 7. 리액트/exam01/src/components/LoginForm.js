import { useState } from 'react';

const LoginForm = () => {
  const [form, setForm] = useState({
    userId: '',
    userPw: '',
  });

  const onSubmit = (e) => {
    e.preventDefault();
  };

  const { userId, userPw } = form;

  const onChange = (e) => {
    console.log(e.currentTarget.name, e.currentTarget.value);
  };

  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>아이디</dt>
        <dd>
          <input type="text" name="userId" onChange={onChange} value={userId} />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input
            type="password"
            name="userPw"
            onChange={onChange}
            value={userPw}
          />
        </dd>
      </dl>
      <button type="submit">로그인</button>
    </form>
  );
};

export default LoginForm;
