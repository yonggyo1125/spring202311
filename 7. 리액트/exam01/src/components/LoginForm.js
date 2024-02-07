const LoginForm = () => {
  return (
    <form>
      <dl>
        <dt>아이디</dt>
        <dd>
          <input type="text" />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input type="password" />
        </dd>
      </dl>
      <button type="submit">로그인</button>
    </form>
  );
};

export default LoginForm;
