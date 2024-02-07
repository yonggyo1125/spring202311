import { useState } from 'react';

const LoginForm = () => {
  const [form, setForm] = useState({
    userId: '',
    userPw: '',
  });

  const [message, setMessage] = useState('');

  const onSubmit = (e) => {
    e.preventDefault();
    
    try {

        for (const key in form) {
            const message = ((key === 'userId')? '아이디':'비밀번호') + "를 입력하세요.";
            if (!form[key].trim()) {
                throw new Error(message);
            }
        }

    } catch (err) {
        setMessage(err.message);
    }
  };

  const { userId, userPw } = form;

  const onChange = (e) => {
    setForm({ ...form, [e.currentTarget.name]: e.currentTarget.value });
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
